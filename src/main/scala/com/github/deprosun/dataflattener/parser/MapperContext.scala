package com.github.deprosun.dataflattener.parser

import java.io.{InputStream, StringReader}

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

import scala.collection.JavaConversions._
import scala.language.postfixOps

object MapperContext {

  private def getParser(inputStream: InputStream): FlattenerParser = {
    val inputCharStream = CharStreams.fromStream(inputStream)
    val tokenSource = new FlattenerLexer(inputCharStream)
    val inputTokenStream = new CommonTokenStream(tokenSource)
    new FlattenerParser(inputTokenStream)
  }

  private def getParser(input: String): FlattenerParser = {
    val inputCharStream = CharStreams.fromReader(new StringReader(input))
    val tokenSource = new FlattenerLexer(inputCharStream)
    val inputTokenStream = new CommonTokenStream(tokenSource)
    val p = new FlattenerParser(inputTokenStream)
    p.removeErrorListeners()
    p.addErrorListener(new WrongSyntaxErrorListener())
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

  private def getSimpleJsonPathContext(context: FlattenerParser.Simple_json_pathContext): SimpleJsonPathContext = {
    val first = PathName(context.first_field_name().getText)

    val rest = Option(context.middle_field_name()) map { x =>
      x map getPathName toList
    } getOrElse Nil

    SimpleJsonPathContext(first :: rest)
  }

  private def getUuidJsonPathContext(context: FlattenerParser.Uuid_funcContext): UuidJsonPathContext = {

    val pathNames: List[PathName] = getPathNameList(context.simple_json_path())

    UuidJsonPathContext(pathNames)
  }

  private def getConcatJsonPathContext(context: FlattenerParser.Concat_funcContext): ConcatJsonPathContext = {

    val pathNames: List[PathName] = getPathNameList(context.simple_json_path())

    val separator = context.id().getText

    ConcatJsonPathContext(pathNames, separator)
  }

  private def getJsonPathContext(context: FlattenerParser.Json_pathContext): JsonPathContext = {

    val isSimple = Option(context.simple_json_path()).nonEmpty

    val isUUID = Option(context.uuid_func()).nonEmpty

    if (isSimple)
      getSimpleJsonPathContext(context.simple_json_path())
    else if (isUUID)
      getUuidJsonPathContext(context.uuid_func())
    else getConcatJsonPathContext(context.concat_func())

  }

  private def getReferenceAttributeContext(context: FlattenerParser.ReferenceContext): ReferenceAttributeContext = {
    val tableName = context.table_name().getText

    val columnName = Option(context.id()) map (_.getText)

    ReferenceAttributeContext(tableName, columnName)
  }

  private def getPKFkAttributeContext(context: FlattenerParser.Pk_fkContext): AttributeContext = {
    val isPk = Option(context.pk()).isDefined

    if (isPk) return PrimaryKeyAttributeContext

    ForeignKeyAttributeContext
  }

  private def getAttributeContext(context: FlattenerParser.AttributeContext): AttributeContext = {
    val isReference = Option(context.reference()).nonEmpty

    if (isReference) getReferenceAttributeContext(context.reference())
    else getPKFkAttributeContext(context.pk_fk())
  }

  private def getExplodeMappingContext(context: FlattenerParser.Explode_mappingContext): ExplodeMappingContext = {

    val path = getJsonPathContext(context.json_path())

    val mappings = context.mapping() map getMappingContext toList

    ExplodeMappingContext(path, mappings)
  }

  private def getStraightMappingContext(context: FlattenerParser.Straight_mappingContext): StraightMappingContext = {

    val path = getJsonPathContext(context.json_path())

    val desiredColumnName = context.column_name().id().getText

    val dataType = context.data_type().id().getText

    val precision = Option(context.precision()) map {
      _.id().map(_.getText) toList
    } getOrElse Nil

    val isNull = if (context.null_notnull().getText.equalsIgnoreCase("not null")) false else true

    val attributes = Option(context.attribute()) map (_.map(getAttributeContext) toList) getOrElse Nil

    StraightMappingContext(path, desiredColumnName, dataType, precision, isNull, attributes)
  }

  private def getMappingContext(context: FlattenerParser.MappingContext): MappingContext = {
    val isExplode = Option(context.explode_mapping()).nonEmpty

    if (isExplode)
      getExplodeMappingContext(context.explode_mapping())
    else
      getStraightMappingContext(context.straight_mapping())
  }

  private def getMapperContext(context: FlattenerParser.MapperContext): MapperContext = {
    val tableName = context.table_name().getText

    val fromField: Option[JsonPathContext] = Option(context.fromField()) map { x =>
      getSimpleJsonPathContext(x.simple_json_path())
    }

    val mappings = context.mapping() map getMappingContext toList

    val children = context.mapper() map getMapperContext toList

    MapperContext(tableName, fromField, mappings, children)
  }

  def getMapper(input: InputStream): MapperContext = {
    getMapperContext(getParser(input).mapper())
  }

  def getMapper(input: String): MapperContext = {
    getMapperContext(getParser(input).mapper())
  }

  def getMappers(input: String): List[MapperContext] = {
    getParser(input).mappers().mapper() map getMapperContext toList
  }

}

case class MapperContext(tableName: String,
                         fromField: Option[JsonPathContext],
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

case class ExplodeMappingContext(path: JsonPathContext,
                                 mappingContext: List[MappingContext]) extends MappingContext


trait JsonPathContext {
  val path: List[PathName]
}

case class SimpleJsonPathContext(path: List[PathName]) extends JsonPathContext

case class UuidJsonPathContext(path: List[PathName]) extends JsonPathContext

case class ConcatJsonPathContext(path: List[PathName], separator: String) extends JsonPathContext


trait AttributeContext

case class ReferenceAttributeContext(tableName: String, columnName: Option[String]) extends AttributeContext

case object PrimaryKeyAttributeContext extends AttributeContext

case object ForeignKeyAttributeContext extends AttributeContext

case class PathName(id: String, isNumber: Boolean = false)

//trait JoinContext {
//  val tableName: String
//  val alias: String
//  val conditions: List[ConditionContext]
//}
//
//case class InnerJoinContext(tableName: String, alias: String, conditions: List[ConditionContext]) extends JoinContext
//
//case class LeftJoinContext(tableName: String, alias: String, conditions: List[ConditionContext]) extends JoinContext
//
//case class RightJoinContext(tableName: String, alias: String, conditions: List[ConditionContext]) extends JoinContext


//case class ConditionContext(leftColumn: JsonPathContext, rightColumn: JsonPathContext,
//                            conditionOperatorContext: ConditionOperatorContext)
//
//
//trait ConditionOperatorContext {
//  val andOr: String
//}
//
//case class LessThanConditionOperatorContext(andOr: String) extends ConditionOperatorContext
//
//case class LessThanEqualToConditionOperatorContext(andOr: String) extends ConditionOperatorContext
//
//case class EqualConditionOperatorContext(andOr: String) extends ConditionOperatorContext
//
//case class GreaterThanEqualToConditionOperatorContext(andOr: String) extends ConditionOperatorContext
//
//case class GreaterThanConditionOperatorContext(andOr: String) extends ConditionOperatorContext


