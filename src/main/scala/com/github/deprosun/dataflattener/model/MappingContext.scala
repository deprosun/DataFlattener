package com.github.deprosun.dataflattener.model

import com.github.deprosun.dataflattener.model.AttributeContext._
import com.github.deprosun.dataflattener.model.JsonPathContext._
import com.github.deprosun.dataflattener.parser.FlattenerParser

import scala.collection.JavaConversions._
import scala.language.postfixOps

object MappingContext {

  /**
    * Convert FlattenerParser.Straight_mappingContext to StraightMappingContext case class
    */
  def getStraightMappingContext(context: FlattenerParser.Straight_mappingContext): StraightMappingContext = {

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

  def getObjectMappingContext(context: FlattenerParser.Object_mappingContext): ObjectMappingContext = {

    val collectedValues: Map[String, JsonPathContext] = Option(context.from()) map { b =>

      b.alias_json_path() map { c =>

        val pathContext: JsonPathContext = getJsonPathContext(c.json_path())

        Option(c.as()) map { as =>
          as.id().getText -> pathContext
        } getOrElse {

          //assume that user inputed a column that is of format a.b.d
          c.json_path().simple_json_path().getText -> pathContext
        }
      } toMap

    } getOrElse {
      Map()
    }

    val columnName = context.column_name().id().getText

    val mappings = context.mapping() map getMappingContext toList

    ObjectMappingContext(columnName, collectedValues, mappings)
  }

  def getListMappingContext(context: FlattenerParser.List_mappingContext): ListMappingContext = {

    val collectedValues: Map[String, JsonPathContext] = Option(context.broadcast()) map { b =>

      b.alias_json_path() map { c =>

        val pathContext: JsonPathContext = getJsonPathContext(c.json_path())

        Option(c.as()) map { as =>
          as.id().getText -> pathContext
        } getOrElse {

          //assume that user inputed a column that is of format a.b.d
          c.json_path().simple_json_path().getText -> pathContext
        }
      } toMap

    } getOrElse {
      Map()
    }

    val path = getJsonPathContext(context.json_path())

    val columnName = context.column_name().id().getText

    val mappings = context.mapping() map getMappingContext toList

    ListMappingContext(path, columnName, collectedValues, mappings)
  }

  /**
    * Convert FlattenerParser.Explode_mappingContext to ExplodeMappingContext
    */
  def getExplodeMappingContext(context: FlattenerParser.Explode_mappingContext): ExplodeMappingContext = {

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
    * Function to convert FlattenerParser.MappingContext to MappingContext case class
    */
  def getMappingContext(context: FlattenerParser.MappingContext): MappingContext = {
    val isExplode = Option(context.explode_mapping()).nonEmpty
    val isObject = Option(context.object_mapping()).nonEmpty
    val isList = Option(context.list_mapping()).nonEmpty

    if (isExplode)
      getExplodeMappingContext(context.explode_mapping())
    else if (isObject)
      getObjectMappingContext(context.object_mapping())
    else if (isList)
      getListMappingContext(context.list_mapping())
    else
      getStraightMappingContext(context.straight_mapping())
  }


}

trait MappingContext

trait ColumnMappingContext extends MappingContext {
  val desiredColumnName: String
  val dataType: String
}

case class StraightMappingContext(path: JsonPathContext,
                                  desiredColumnName: String,
                                  dataType: String,
                                  precision: List[String],
                                  isNull: Boolean,
                                  attributes: List[AttributeContext]) extends ColumnMappingContext

case class ExplodeMappingContext(path: JsonPathContext, copiedKeys: Map[String, JsonPathContext],
                                 mappingContext: List[MappingContext]) extends MappingContext


case class ObjectMappingContext(desiredColumnName: String,
                                collectedValues: Map[String, JsonPathContext],
                                mappingContext: List[MappingContext]) extends ColumnMappingContext {
  val dataType = "JSON"
}

case class ListMappingContext(path: JsonPathContext,
                              desiredColumnName: String,
                              collectedValues: Map[String, JsonPathContext],
                              mappingContext: List[MappingContext]) extends ColumnMappingContext {
  val dataType = "JSON"
}

case class PathName(id: String, isNumber: Boolean = false)