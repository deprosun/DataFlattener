package com.github.deprosun.dataflattener.transform

import com.github.deprosun.dataflattener.model._
import org.json4s.JsonAST._
import org.json4s.JsonDSL._
import org.json4s.native.JsonMethods._
import org.slf4j.Logger

trait Transformer {

  val logger: Logger

  type MapFunc = List[JValue] => JValue

  val udfMap: Map[String, MapFunc]

  private def getStraightMappings(mappings: List[MappingContext]): List[MappingContext] =
    mappings filter (_.isInstanceOf[StraightMappingContext])

  private def getObjectMappings(mappings: List[MappingContext]): List[MappingContext] =
    mappings filter (_.isInstanceOf[ObjectMappingContext])

  private def getListMappings(mappings: List[MappingContext]): List[MappingContext] =
    mappings filter (_.isInstanceOf[ListMappingContext])

  private def getExplodeMappings(mappings: List[MappingContext]): List[MappingContext] =
    mappings filter (_.isInstanceOf[ExplodeMappingContext])

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
    val traversed: JValue = traversePath(json, mappingContext.path)
    Column(mappingContext.desiredColumnName, mappingContext, traversed)
  }

  def getJson(jsonList: List[JValue], context: ColumnMappingContext, mergeFunc: JValue => JValue): JValue = {

    val straightMappings = getStraightMappings(context.mappings)

    val explodeMappings = getExplodeMappings(context.mappings)

    val objectMappings = getObjectMappings(context.mappings)

    val listMappings = getListMappings(context.mappings)

    jsonList map { j =>

      val json = mergeFunc(j)

      val objectColumns: List[Column] = objectMappings map { i =>
        getValueFromObject(json, i.asInstanceOf[ObjectMappingContext])
      }

      val listColumns: List[Column] = listMappings map { i =>
        getValueFromList(json, i.asInstanceOf[ListMappingContext])
      }

      val simpleColumns: List[Column] = getFlatColumns(json, straightMappings)

      val flattenedRow = Row(simpleColumns ++ objectColumns ++ listColumns)

      //get all the rows from exploded mappings
      val moreInnerRows: List[Row] = getRowsFromExplode(json, explodeMappings)

      //for all additional rows from explosion, add the single row we got from the set of StraightMappings
      val allRows = if (moreInnerRows.nonEmpty) {
        moreInnerRows map { row => row.copy(columns = flattenedRow.columns ++ row.columns) }
      } else {
        flattenedRow :: Nil
      }

      val initial: JValue = JNothing

      allRows.foldLeft(initial) { case (acc, x) =>
        acc merge x.toJson
      }
    }
  }

  def getValueFromObject(json: JValue, context: ObjectMappingContext): Column = {

    //first get the json we will be using to create our JSON struct/object
    val initial: JValue = JNothing
    val traversed: JValue = context.collectedValues.foldLeft(initial) { case (acc, (key, path)) =>
      val j: JValue = key -> traversePath(json, path)
      acc merge j
    }

    val transformed: JValue = traversed match {
      case json: JValue =>
        val no_op = (x: JValue) => x
        getJson(List(json), context, no_op)
    }

    Column(context.desiredColumnName, context, transformed)
  }

  def getValueFromList(json: JValue, context: ListMappingContext): Column = {

    val traversed = traversePath(json, context.path)

    val neededValues: JValue = context.collectedValues map { case (key, valuePaths) =>
      key -> traversePath(json, valuePaths)
    }

    val transformed: JValue = traversed match {
      case JArray(arr) =>
        val mergeFunc: JValue => JValue = (x: JValue) => {
          x merge neededValues
        }
        getJson(arr, context, mergeFunc)
      case x: JValue => throw new Error(s"The data type is for column ${context.desiredColumnName} is not list $x")
    }

    Column(context.desiredColumnName, context, transformed)
  }

  def getRowsFromExplode(json: JValue, mappings: List[MappingContext]): List[Row] = {
    //first get all the columns that are to be retrieved from this json
    getExplodeMappings(mappings) flatMap { case y: ExplodeMappingContext =>

      val carryOvers = y.copiedKeys.toList map { case (k, v) =>
        JObject(JField(k, traversePath(json, v)))
      }

      val explodedJson = traversePath(json, y.path)

      val straightMappings = getStraightMappings(y.mappings)

      val objectMappings = getObjectMappings(y.mappings)

      val moreExplodeMappings = getExplodeMappings(y.mappings)

      val listMappings = getListMappings(y.mappings)

      explodedJson.children flatMap { j =>

        val json = carryOvers.foldLeft(j)((acc, x) =>
          acc merge x
        )

        val listColumns: List[Column] = listMappings map { i =>
          getValueFromList(json, i.asInstanceOf[ListMappingContext])
        }

        val simpleColumns: List[Column] = getFlatColumns(json, straightMappings)

        val objectColumns: List[Column] = objectMappings map { i =>
          getValueFromObject(json, i.asInstanceOf[ObjectMappingContext])
        }

        val flattenedRow = Row(simpleColumns ++ objectColumns ++ listColumns)

        val moreInnerRows: List[Row] = getRowsFromExplode(j, moreExplodeMappings)

        if (moreInnerRows.nonEmpty) {
          moreInnerRows map { row => row.copy(columns = flattenedRow.columns ++ row.columns) }
        } else {
          flattenedRow :: Nil
        }

      }
    }

  }

  def getFlatColumns(json: JValue, mappings: List[MappingContext]): List[Column] = {
    //first get all the columns that are to be retrieved from this json
    getStraightMappings(mappings) map { case x: StraightMappingContext =>
      getValueFromStraight(json, x)
    }
  }

  /**
    * Merges the list of JSONs to `json`
    */
  def valueBringScope(json: JValue, additionalValues: List[JValue]): JValue =
    additionalValues.foldLeft(json) { case (acc, x) =>
      acc merge x
    }

  /**
    * Looking at the mapper configuration determine the source rows needed to perform further transformation.
    *
    * @param additionalValues a list of potential "other" or "parent" values needed downstream transformation logic.
    *                         `additionalValues` is a list of `JValue`
    *
    *                         JNothing extends JValue // 'zero' for JValue
    *                         JNull extends JValue
    *                         JString(s: String) extends JValue
    *                         JDouble(num: Double) extends JValue
    *                         JDecimal(num: BigDecimal) extends JValue
    *                         JInt(num: BigInt) extends JValue
    *                         JLong(num: Long) extends JValue
    *                         JBool(value: Boolean) extends JValue
    *                         JObject(obj: List[JField]) extends JValue
    *                         JArray(arr: List[JValue]) extends JValue
    * @return
    */
  def getSourceRows(json: JValue, mapperContext: MapperContext, additionalValues: List[JValue]): List[JValue] = {


    mapperContext.fromField match {
      case None =>

        //add the extra values
        val workingJson: JValue = valueBringScope(json, additionalValues)

        workingJson :: Nil
      case Some(f) =>

        //get a list of JSON as source
        val source = traversePath(json, f).children

        //add the extra values
        source map { j =>
          valueBringScope(j, additionalValues)
        }
    }
  }

  /**
    * Transform the JSON input into multiple tables
    *
    * @param json          JSON value to convert
    * @param mapperContext mapper configuration
    * @return List of Table objects
    */
  def transform(json: JValue, mapperContext: MapperContext, additionalValues: List[JValue] = Nil): List[Table] = {

    def start: List[Table] = {

      //get the source rows
      val sourceData: List[JValue] = getSourceRows(json, mapperContext, additionalValues)

      //get the straight mappings and explode mappings
      val straightMappings = getStraightMappings(mapperContext.mappings)

      //explode mappings
      val explodeMappings = getExplodeMappings(mapperContext.mappings)

      //get the list mappings / JSON type columns
      val listMappings = getListMappings(mapperContext.mappings)

      //get the object mappings / JSON type columns
      val objectMappings = getObjectMappings(mapperContext.mappings)

      val tableRows: List[Row] = sourceData flatMap { sourceJson =>

        val listColumns: List[Column] = listMappings map { i =>
          getValueFromList(sourceJson, i.asInstanceOf[ListMappingContext])
        }

        val objectColumns: List[Column] = objectMappings map { i =>
          getValueFromObject(json, i.asInstanceOf[ObjectMappingContext])
        }

        val simpleColumns: List[Column] = getFlatColumns(sourceJson, straightMappings)

        //get a row that from all the straight mappings
        val flattenedRow = Row(simpleColumns ++ objectColumns ++ listColumns)

        //get all the rows from exploded mappings
        val moreInnerRows: List[Row] = getRowsFromExplode(sourceJson, explodeMappings)

        //for all additional rows from explosion, add the single row we got from the set of StraightMappings
        if (moreInnerRows.nonEmpty) {
          moreInnerRows map { row => row.copy(columns = flattenedRow.columns ++ row.columns) }
        } else {
          flattenedRow :: Nil
        }
      }

      //get the children recursively
      val children: List[Table] = mapperContext.children flatMap { childMapper =>

        sourceData flatMap { sourceJson =>
          //get the additional values needed for all children rows
          val additionalValues: List[JValue] = childMapper.copiedKeys.toList map { case (k, path) =>
            JObject(JField(k, traversePath(sourceJson, path)))
          }
          transform(sourceJson, childMapper, additionalValues)
        }

      }

      //table name
      val tableName = mapperContext.tableName

      //finally, return the whole list of tables
      Table(tableName, tableRows) :: children
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

case class Column(columnName: String, mappingContext: ColumnMappingContext, value: JValue) {
  def toJson: JValue = columnName -> value
}

case class Row(columns: List[Column]) {

  def toJson: JValue = {
    val initial: JValue = JNothing
    columns.foldLeft(initial) { (acc, x) =>
      acc merge x.toJson
    }
  }
}

case class Table(tableName: String, rows: List[Row]) {
  def toJson: JValue = tableName -> (rows map (_.toJson))

  def toJsonString: String = compact {
    render {
      toJson
    }
  }
}
