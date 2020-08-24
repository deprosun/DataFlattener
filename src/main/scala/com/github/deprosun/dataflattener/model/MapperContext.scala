package com.github.deprosun.dataflattener.model

import java.io.StringReader

import com.github.deprosun.dataflattener.parser.ThrowingErrorListener
import com.github.deprosun.dataflattener.parser.{FlattenerLexer, FlattenerParser}
//import com.github.deprosun.dataflattener. model}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.{read, write}

import scala.collection.JavaConversions._
import scala.language.postfixOps

object MapperContext {

  implicit val formats: AnyRef with Formats = Serialization.formats(NoTypeHints)

  private def getParser(input: String): FlattenerParser = {
    val inputCharStream = CharStreams.fromReader(new StringReader(input))
    val tokenSource = new FlattenerLexer(inputCharStream)


    tokenSource.removeErrorListeners()
    tokenSource.addErrorListener(ThrowingErrorListener.INSTANCE)

    val inputTokenStream = new CommonTokenStream(tokenSource)
    val p = new FlattenerParser(inputTokenStream)
    p.removeErrorListeners()
    p.addErrorListener(ThrowingErrorListener.INSTANCE)

    p
  }

  private def getPathName(mfc: FlattenerParser.Middle_field_nameContext): PathName = {
    val value = {
      Option(mfc.list_index()).map(x => x.ID().getText).getOrElse(mfc.getText)
    }
    PathName(value, value forall Character.isDigit)
  }

  private def getPathNameList(jsonPath: FlattenerParser.Simple_json_pathContext): List[PathName] = {
    val first = PathName(jsonPath.first_field_name().getText)

    val rest = Option(jsonPath.middle_field_name()) map { x =>
      x map getPathName toList
    } getOrElse Nil

    first :: rest
  }

  /**
    * Convert FlattenerParser.Simple_json_pathContext to SimpleJsonPathContext
    */
  private def getSimpleJsonPathContext(context: FlattenerParser.Simple_json_pathContext): SimpleJsonPathContext = {
    val first = PathName(context.first_field_name().getText)

    val rest = Option(context.middle_field_name()) map { x =>
      x map getPathName toList
    } getOrElse Nil

    SimpleJsonPathContext(first :: rest)
  }

  /**
    * Convert FlattenerParser.Map_funcContext to MapFunctionJsonPathContext
    */
  private def getMapFunctionJsonPathContext(context: FlattenerParser.Map_funcContext): MapFunctionJsonPathContext = {

    val funcName = context.id().getText

    val functionParams: List[JsonPathContext] = context.json_path() map { x =>

      val concat: Option[JsonPathContext] = Option(x.concat_func()) map getConcatJsonPathContext
      val simple: Option[JsonPathContext] = Option(x.simple_json_path()) map getSimpleJsonPathContext
      val mapAgain: Option[JsonPathContext] = Option(x.map_func()) map getMapFunctionJsonPathContext

      concat getOrElse {
        simple getOrElse {
          mapAgain.get
        }
      }
    } toList

    MapFunctionJsonPathContext(funcName, functionParams)
  }

  /**
    * Convert FlattenerParser.Concat_funcContext to ConcatJsonPathContext
    */
  private def getConcatJsonPathContext(context: FlattenerParser.Concat_funcContext): ConcatJsonPathContext = {

    val pathNames: List[PathName] = getPathNameList(context.simple_json_path())

    val separator = context.id().getText

    ConcatJsonPathContext(pathNames, separator)
  }

  /**
    * Convert FlattenerParser.Json_pathContext to JsonPathContext
    */
  private def getJsonPathContext(context: FlattenerParser.Json_pathContext): JsonPathContext = {

    val isSimple = Option(context.simple_json_path()).nonEmpty

    val isMapFunc = Option(context.map_func()).nonEmpty

    if (isSimple)
      getSimpleJsonPathContext(context.simple_json_path())
    else if (isMapFunc)
      getMapFunctionJsonPathContext(context.map_func())
    else getConcatJsonPathContext(context.concat_func())

  }

  /**
    * Convert FlattenerParser.ReferenceContext to ReferenceAttributeContext
    */
  private def getReferenceAttributeContext(context: FlattenerParser.ReferenceContext): ReferenceAttributeContext = {
    val tableName = context.table_name().getText

    val columnName = Option(context.id()) map (_.getText)

    ReferenceAttributeContext(tableName, columnName)
  }

  /**
    * Convert FlattenerParser.Pk_fkContext to AttributeContext
    */
  private def getPKFkAttributeContext(context: FlattenerParser.Pk_fkContext): AttributeContext = {
    val isPk = Option(context.pk()).isDefined

    if (isPk) return PrimaryKeyAttributeContext

    ForeignKeyAttributeContext
  }

  /**
    * Convert FlattenerParser.AttributeContext to AttributeContext
    */
  private def getAttributeContext(context: FlattenerParser.AttributeContext): AttributeContext = {
    val isReference = Option(context.reference()).nonEmpty

    if (isReference) getReferenceAttributeContext(context.reference())
    else getPKFkAttributeContext(context.pk_fk())
  }

  /**
    * Convert FlattenerParser.Explode_mappingContext to ExplodeMappingContext
    */
  private def getExplodeMappingContext(context: FlattenerParser.Explode_mappingContext): ExplodeMappingContext = {

    val path = getJsonPathContext(context.json_path())

    val copiedKeys = Option(context.`with`()) map { w =>
      w.mappingAlias() map { x =>
        val alias = x.column_name().id().getText

        alias -> getJsonPathContext(x.json_path())
      } toMap
    } getOrElse Map()

    val mappings = context.mapping() map getMappingContext toList

    ExplodeMappingContext(path, copiedKeys, mappings)
  }

  /**
    * Convert FlattenerParser.Straight_mappingContext to StraightMappingContext case class
    */
  private def getStraightMappingContext(context: FlattenerParser.Straight_mappingContext): StraightMappingContext = {

    val mappingColumnName = context.mappingAlias().column_name()

    val mappingJsonPath = context.mappingAlias().json_path()

    val path = getJsonPathContext(mappingJsonPath)

    val desiredColumnName = mappingColumnName.id().getText

    val dataType = context.data_type().id().getText

    val precision = Option(context.precision()) map {
      _.id().map(_.getText) toList
    } getOrElse Nil

    val isNull = if (context.null_notnull().getText.equalsIgnoreCase("notnull")) false else true

    val attributes = Option(context.attribute()) map (_.map(getAttributeContext) toList) getOrElse Nil

    StraightMappingContext(path, desiredColumnName, dataType, precision, isNull, attributes)
  }

  /**
    * Function to convert FlattenerParser.MappingContext to MappingContext case class
    */
  private def getMappingContext(context: FlattenerParser.MappingContext): MappingContext = {
    val isExplode = Option(context.explode_mapping()).nonEmpty

    if (isExplode)
      getExplodeMappingContext(context.explode_mapping())
    else
      getStraightMappingContext(context.straight_mapping())
  }

  /**
    * Function to convert FlattenerParser.Child_mapperContext to MapperContext case class
    */
  private def getChildMapperContext(context: FlattenerParser.Child_mapperContext): MapperContext = {
    val tableName = context.table_name().getText

    val fromField: Option[JsonPathContext] = Option(context.fromField()) map { x =>
      getSimpleJsonPathContext(x.simple_json_path())
    }

    val filter: Option[Filter] = Option(context.filter()) map { condition =>
      val path1 = getJsonPathContext(condition.json_path(0))
      val path2 = getJsonPathContext(condition.json_path(1))
      Filter(path1, path2)
    }

    val mappings = context.mapping() map getMappingContext toList

    val children = context.child_mapper() map getChildMapperContext toList

    MapperContext(tableName, fromField, filter, mappings, children)
  }

  /**
    * Function to convert FlattenerParser.MapperContext to MapperContext case class
    */
  private def getMapperContext(context: FlattenerParser.MapperContext): MapperContext = {
    val tableName = context.table_name().getText

    val fromField: Option[JsonPathContext] = Option(context.fromField()) map { x =>
      getSimpleJsonPathContext(x.simple_json_path())
    }

    val filter: Option[Filter] = Option(context.filter()) map { condition =>
      val path1 = getJsonPathContext(condition.json_path(0))
      val path2 = getJsonPathContext(condition.json_path(1))
      Filter(path1, path2)
    }

    val mappings = context.mapping() map getMappingContext toList

    val children = context.child_mapper() map getChildMapperContext toList

    MapperContext(tableName, fromField, filter, mappings, children)
  }

  def toJSON(mapperContext: MapperContext): String = {
    write[MapperContext](mapperContext)
  }

  /**
    * This function returns the mapper context from the input string
    */
  def getMappers(input: String): List[MapperContext] = {
    getParser(input).mappers().mapper() map getMapperContext toList
  }

}

case class MapperContext(tableName: String,
                         fromField: Option[JsonPathContext],
                         filter: Option[Filter],
                         mappings: List[MappingContext],
                         children: List[MapperContext])

trait MappingContext {
  val path: JsonPathContext
}

case class StraightMappingContext(path: JsonPathContext,
                                  desiredColumnName: String,
                                  dataType: String,
                                  precision: List[String],
                                  isNull: Boolean,
                                  attributes: List[AttributeContext]) extends MappingContext

case class ExplodeMappingContext(path: JsonPathContext, copiedKeys: Map[String, JsonPathContext],
                                 mappingContext: List[MappingContext]) extends MappingContext


trait JsonPathContext

case class MapFunctionJsonPathContext(funcName: String, functionParams: List[JsonPathContext]) extends JsonPathContext

case class SimpleJsonPathContext(path: List[PathName]) extends JsonPathContext

case class ConcatJsonPathContext(path: List[PathName], separator: String) extends JsonPathContext


case class Filter(path: JsonPathContext, path2: JsonPathContext)


trait AttributeContext

case class ReferenceAttributeContext(tableName: String, columnName: Option[String]) extends AttributeContext

case object PrimaryKeyAttributeContext extends AttributeContext

case object ForeignKeyAttributeContext extends AttributeContext

case class PathName(id: String, isNumber: Boolean = false)