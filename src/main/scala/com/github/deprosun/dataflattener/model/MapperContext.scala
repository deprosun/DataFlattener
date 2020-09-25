package com.github.deprosun.dataflattener.model

import java.io.StringReader

import com.github.deprosun.dataflattener.model.JsonPathContext._
import com.github.deprosun.dataflattener.model.MappingContext._
import com.github.deprosun.dataflattener.parser.{FlattenerLexer, FlattenerParser, ThrowingErrorListener}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.write

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

  /**
    * Function to convert FlattenerParser.Child_mapperContext to MapperContext case class
    */
  private def getChildMapperContext(context: FlattenerParser.Child_mapperContext): MapperContext = {
    val tableName = context.topic_name().getText

    val fromField: Option[JsonPathContext] = Option(context.fromField()) map { x =>
      getSimpleJsonPathContext(x.simple_json_path())
    }

    val filter: Option[Filter] = Option(context.filter()) map { condition =>
      val path1 = getJsonPathContext(condition.json_path(0))
      val path2 = getJsonPathContext(condition.json_path(1))
      Filter(path1, path2)
    }

    val copiedKeys = getBroadCast(context.broadcast())

    val mappings = context.mapping() map getMappingContext toList

    val children = context.child_mapper() map getChildMapperContext toList

    MapperContext(tableName, fromField, filter, copiedKeys, mappings, children)
  }

  /**
    * Function to convert FlattenerParser.MapperContext to MapperContext case class
    */
  private def getMapperContext(context: FlattenerParser.MapperContext): MapperContext = {
    val tableName = context.topic_name().getText

    val fromField: Option[JsonPathContext] = Option(context.fromField()) map { x =>
      getSimpleJsonPathContext(x.simple_json_path())
    }

    val filter: Option[Filter] = Option(context.filter()) map { condition =>
      val path1 = getJsonPathContext(condition.json_path(0))
      val path2 = getJsonPathContext(condition.json_path(1))
      Filter(path1, path2)
    }

    val copiedKeys = getBroadCast(context.broadcast())

    val mappings = context.mapping() map getMappingContext toList

    val children = context.child_mapper() map getChildMapperContext toList

    MapperContext(tableName, fromField, filter, copiedKeys, mappings, children)
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

case class MapperContext(topicName: String,
                         fromField: Option[JsonPathContext],
                         filter: Option[Filter],
                         broadcast: BroadCast,
                         mappings: List[MappingContext],
                         children: List[MapperContext])

case class Filter(path: JsonPathContext, path2: JsonPathContext)