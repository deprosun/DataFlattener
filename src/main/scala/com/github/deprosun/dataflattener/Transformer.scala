package com.github.deprosun.dataflattener

import com.github.deprosun.dataflattener.model._
import org.json4s.JsonAST.{JArray, JField, JObject, JValue}
import org.json4s.native.JsonMethods._
import org.slf4j.Logger

trait Transformer extends Extraction {

  val logger: Logger

  type MapFunc = List[JValue] => JValue

  val udfMap: Map[String, MapFunc]

  /**
    * Traverses and extracts the value specified by the path context
    *
    */
  def traversePath(json: JValue, path: JsonPathContext): JValue = {
    //json path context can be of 2 types:
    //1. map_func: user defined function applied to the value
    //2. simple_json_path: simple struct traversed value

    def mapFunctionJsonPathContext(m: MapFunctionJsonPathContext): JValue = {

      //get the function
      val mapFunc = udfMap.getOrElse(m.funcName,
        throw new RuntimeException(s"Unknown user defined function '${m.funcName}'"))

      //get the values
      val values = m.functionParams map { param => traversePath(json, param) }

      //apply the function
      mapFunc(values)
    }

    def simpleJsonPathContext(s: SimpleJsonPathContext, j: JValue): JValue = {

      def traverse(path: List[PathName], currentJson: JValue): JValue = {
        path match {
          case Nil => currentJson
          case x :: rest if x.isNumber =>
            val newJ = currentJson.children(x.id.toInt)
            traverse(rest, newJ)
          case x :: rest =>
            val newJ = currentJson \ x.id
            traverse(rest, newJ)
        }
      }

      traverse(s.path, json)
    }

    path match {
      case m: MapFunctionJsonPathContext => mapFunctionJsonPathContext(m)
      case s: SimpleJsonPathContext => simpleJsonPathContext(s, json)
    }

  }

  def getValueFromStraight(json: JValue, mappingContext: StraightMappingContext): Column = {
    val traversed = traversePath(json, mappingContext.path)
    val value = extractData(traversed, mappingContext)
    value match {
      case None if !mappingContext.isNull =>
        throw new IllegalArgumentException(s"Column ${mappingContext.desiredColumnName} cannot be null.")
      case _ => Column(mappingContext.desiredColumnName, value)
    }
  }

  /**
    * Returns a list of ColumnValues given JSON input and a mapping configuration
    *
    * @param json           JSON input
    * @param mappingContext mapping configuration
    * @return List of (c,v) where c is the name of the column and v, it's corresponding value
    */
  def getValues(json: JValue, mappingContext: MappingContext): List[Column] = {
    //if the mapping configuration is of type straight, then simply call getValueFromStraight
    //if the mapping configuration is of type exploded, then we need to do a couple of things:
    // - get a list of carry over values from the current JSON
    // - get the list of json from the current json defined in ExplodeMappingContext
    // - foreach json in the derived list,
    //  - attach the carry over values to it
    //  - foreach mapping defined in explode call getValues recursively

    mappingContext match {

      case x: StraightMappingContext => getValueFromStraight(json, x) :: Nil

      case y: ExplodeMappingContext =>

        val carryOvers = y.copiedKeys.toList map { case (k, v) =>
          JObject(JField(k, traversePath(json, v)))
        }

        val explodedJson = traversePath(json, y.path)

        explodedJson.children flatMap { j =>

          val json = carryOvers.foldLeft(j)((acc, x) =>
            acc merge x
          )

          val func = getValues(json, _: MappingContext)

          y.mappingContext flatMap func
        }
    }
  }

  def getRows(json: JValue, mappings: List[MappingContext]): List[Row] = {

    //first get all the columns that are to be retrieved from this json
    //    val flatColumns: List[Column] = mappings filter (_.isInstanceOf[StraightMappingContext]) map {
    //      case x: StraightMappingContext =>
    //        getValueFromStraight(json, x)
    //    }

    //    val moreRows = mappings filter (_.isInstanceOf[ExplodeMappingContext]) flatMap {
    //      case y: ExplodeMappingContext =>
    //
    //        val carryOvers = y.copiedKeys.toList map { case (k, v) =>
    //          JObject(JField(k, traversePath(json, v)))
    //        }
    //
    //        val explodedJson = traversePath(json, y.path)
    //
    //        val moreRows = explodedJson.children flatMap { j =>
    //
    //          val json = carryOvers.foldLeft(j)((acc, x) =>
    //            acc merge x
    //          )
    //
    //          val ss = getRows(json, y.mappingContext)
    //
    //          ss
    //
    //        }
    //
    //        moreRows
    //    }

    mappings filter (_.isInstanceOf[ExplodeMappingContext]) match {
      case explodedMappings: List[ExplodeMappingContext] =>

        explodedMappings flatMap {
          y: ExplodeMappingContext =>

            val carryOvers = y.copiedKeys.toList map { case (k, v) =>
              JObject(JField(k, traversePath(json, v)))
            }

            val explodedJson = traversePath(json, y.path)

            val ss = explodedJson.children flatMap { j =>

              val json = carryOvers.foldLeft(j)((acc, x) =>
                acc merge x
              )

              getRows(json, y.mappingContext)
            }

            ss
        }

    }
  }

  //  /**
  //    * Transform the JSON input into multiple column values
  //    *
  //    * @param json          JSON input
  //    * @param mapperContext mapper configuration
  //    * @return List of (c,v) where c is the name of the column and v, it's corresponding value
  //    */
  //  def getColumnValues(json: JValue, mapperContext: MapperContext): List[Row] = {
  //
  //    //if the value of this table comes from expanding from another array field in the current json, then
  //    //this function will result in multiple ColumnValues - one SET of ColumnValue per element in the array.
  //
  //    //therefore, if fromField is mentioned, we need to get mapping values for each element.
  //    //if fromField is not provided then, the current json is the only one that needs to be used
  //    //for extraction
  //    val sourceData: List[JValue] = mapperContext.fromField match {
  //      case None => json :: Nil // probably a root, no alteration needed
  //      case Some(f) => traversePath(json, f).children
  //    }
  //
  //    //for each source json, for each mapping defined, call getValues
  //    sourceData map { json =>
  //
  //      val func: MappingContext => List[Row] = getValues(json, _: MappingContext)
  //
  //      //first get all the columns that are to be retrieved from this json
  //      val flatColumns = mapperContext.mappings filter (_.isInstanceOf[StraightMappingContext]) map {
  //        case x: StraightMappingContext =>
  //          getValueFromStraight(json, x)
  //      }
  //
  //      val moreRows = mapperContext.mappings filter (_.isInstanceOf[ExplodeMappingContext]) foreach {
  //        case y: ExplodeMappingContext =>
  //
  //      }
  //
  //      //      mapperContext.mappings foreach {
  //      //        case e: ExplodeMappingContext => //results more rows
  //      //        case s: StraightMappingContext => // if Explode is present then,  we need to
  //      //
  //      //      }
  //
  //      mapperContext.mappings flatMap func
  //    }
  //  }

  private def getFlatColumns(json: JValue, mappings: List[MappingContext]): List[Column] = {
    //first get all the columns that are to be retrieved from this json
    mappings filter (_.isInstanceOf[StraightMappingContext]) map { case x: StraightMappingContext =>
      getValueFromStraight(json, x)
    }
  }

  private def getRowsFromExplode(json: JValue, mappings: List[MappingContext]): List[Row] = {
    //first get all the columns that are to be retrieved from this json
    mappings filter (_.isInstanceOf[ExplodeMappingContext]) flatMap { case y: ExplodeMappingContext =>

      val carryOvers = y.copiedKeys.toList map { case (k, v) =>
        JObject(JField(k, traversePath(json, v)))
      }

      val explodedJson = traversePath(json, y.path)

      val (straightMappings, moreExplodeMappings) =
        y.mappingContext.partition(_.isInstanceOf[StraightMappingContext])


      val straightValue = explodedJson.children flatMap { j =>

        val json = carryOvers.foldLeft(j)((acc, x) =>
          acc merge x
        )

        val flattenedRow = Row(getFlatColumns(json, straightMappings))

        val moreInnerRows: List[Row] = getRowsFromExplode(j, moreExplodeMappings)

        if (moreInnerRows.nonEmpty) {
          moreInnerRows map { row => row.copy(columns = flattenedRow.columns ++ row.columns) }
        } else {
          flattenedRow :: Nil
        }
        //        else

        //        Row(getFlatColumns(json, straightMappings map (_.asInstanceOf[StraightMappingContext])))

      }

      straightValue


    }

  }

  /**
    * Transform the JSON input into multiple tables
    *
    * @param json          JSON value to convert
    * @param mapperContext mapper configuration
    * @return List of Table objects
    */
  def transform(json: JValue, mapperContext: MapperContext): List[Table] = {

    def start: List[Table] = {
      //table name
      val tableName = mapperContext.tableName

      val (straightMappings, moreExplodeMappings) =
        mapperContext.mappings.partition(_.isInstanceOf[StraightMappingContext])

      val flattenedRow = Row(getFlatColumns(json, straightMappings))

      val moreInnerRows: List[Row] = getRowsFromExplode(json, moreExplodeMappings)

      val allRows = if (moreInnerRows.nonEmpty) {
        moreInnerRows map { row => row.copy(columns = flattenedRow.columns ++ row.columns) }
      } else {
        flattenedRow :: Nil
      }

      //      val rootColumnValues = getFlatColumns(json, mapperContext.mappings)

      //all column values for this table
      //      val rows: List[Row] = getRows(json, mapperContext.mappings) //getColumnValues(json, mapperContext)

      //if the mapper has children configuration defined, make tables for those
      val children = mapperContext.children flatMap {
        x => transform(json, x)
      }

      //finally, return the whole list of tables
      Table(tableName, allRows) :: children
    }

    logger.info(s"Transforming ${mapperContext.tableName}")

    mapperContext.filter match {
      case Some(Filter(path1, path2)) =>
        val value1 = traversePath(json, path1)
        val value2 = traversePath(json, path2)
        if (value1 == value2) start else Nil
      case _ => start

    }
  }

}

case class Column(name: String, value: Option[Any])

case class Row(columns: List[Column]) {
  override def toString: String =
    s"""
       |{
       | ${columns map { c => s""" "${c.name}" : "${c.value.toString}" """ } mkString ","}
       |}
    """.stripMargin
}

case class Table(tableName: String, rows: List[Row]) {
  override def toString: String = compact {
    render {
      parse {
        s"""{
           | "tableName" : [
           |   ${rows map (_.toString) mkString ","}
           | ]
           |}""".stripMargin
      }
    }
  }
}