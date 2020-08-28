package com.github.deprosun.dataflattener.model

import com.github.deprosun.dataflattener.parser.FlattenerParser

import scala.collection.JavaConversions._
import scala.language.postfixOps

object JsonPathContext {

  def getPathName(mfc: FlattenerParser.Middle_field_nameContext): PathName = {
    val value = {
      Option(mfc.list_index()).map(x => x.ID().getText).getOrElse(mfc.getText)
    }
    PathName(value, value forall Character.isDigit)
  }

  def getPathNameList(jsonPath: FlattenerParser.Simple_json_pathContext): List[PathName] = {
    val first = PathName(jsonPath.first_field_name().getText)

    val rest = Option(jsonPath.middle_field_name()) map { x =>
      x map getPathName toList
    } getOrElse Nil

    first :: rest
  }

  /**
    * Convert FlattenerParser.Simple_json_pathContext to SimpleJsonPathContext
    */
  def getSimpleJsonPathContext(context: FlattenerParser.Simple_json_pathContext): SimpleJsonPathContext = {
    val first = PathName(context.first_field_name().getText)

    val rest = Option(context.middle_field_name()) map { x =>
      x map getPathName toList
    } getOrElse Nil

    SimpleJsonPathContext(first :: rest)
  }

  /**
    * Convert FlattenerParser.Map_funcContext to MapFunctionJsonPathContext
    */
  def getMapFunctionJsonPathContext(context: FlattenerParser.Map_funcContext): MapFunctionJsonPathContext = {

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
  def getConcatJsonPathContext(context: FlattenerParser.Concat_funcContext): ConcatJsonPathContext = {

    val pathNames: List[PathName] = getPathNameList(context.simple_json_path())

    val separator = context.id().getText

    ConcatJsonPathContext(pathNames, separator)
  }

  /**
    * Convert FlattenerParser.Json_pathContext to JsonPathContext
    */
  def getJsonPathContext(context: FlattenerParser.Json_pathContext): JsonPathContext = {

    val isSimple = Option(context.simple_json_path()).nonEmpty

    val isMapFunc = Option(context.map_func()).nonEmpty

    if (isSimple)
      getSimpleJsonPathContext(context.simple_json_path())
    else if (isMapFunc)
      getMapFunctionJsonPathContext(context.map_func())
    else getConcatJsonPathContext(context.concat_func())

  }

}

trait JsonPathContext

case class MapFunctionJsonPathContext(funcName: String, functionParams: List[JsonPathContext]) extends JsonPathContext

case class SimpleJsonPathContext(path: List[PathName]) extends JsonPathContext

case class ConcatJsonPathContext(path: List[PathName], separator: String) extends JsonPathContext

