package com.github.deprosun.dataflattener.parser

import java.io.{File, InputStream, PrintWriter, StringReader}

import com.github.deprosun.dataflattener.parser.FlattenerParser.FromFieldContext
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

import scala.collection.JavaConversions._
import scala.language.postfixOps

object Mapper {

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

  /**
    * Creates a PathName object
    */
  private def getPathName(mfc: FlattenerParser.Middle_field_nameContext): PathName = {
    val value = {
      Option(mfc.list_index()).map(x => x.ID().getText).getOrElse(mfc.getText)
    }
    PathName(value, value forall Character.isDigit)
  }

  /**
    * Creates a PathName object
    *
    */
  private def getPathName(ffc: FlattenerParser.First_field_nameContext): PathName = PathName(ffc.getText)

  /**
    * Given the MappingContext, returns a list of PathName's
    */
  private def getPathNameList(mc: FlattenerParser.MappingContext): Seq[PathName] = {

    //get the first field name
    val firstField = getPathName(mc.first_field_name())

    //(map the list of middle field names to PathName class) and also prepend first field information to the list and return
    Seq(firstField) ++ (mc.middle_field_name() map getPathName)

  }

  /**
    * Given the FromFieldContext, returns a list of PathName's
    */
  private def getPathNameList(ffc: FromFieldContext): Seq[PathName] = {
    val firstField = getPathName(ffc.first_field_name())

    Seq(firstField) ++ (ffc.middle_field_name() map getPathName)
  }

  /**
    * Depending on the attribute context, form the right Attribute object
    */
  private def getAttribute(ac: FlattenerParser.AttributesContext): Seq[MappingAttribute] = {

    ac.attribute map { attr =>
      val concatBy = Option(attr.concatBy())
      val pk_fk = Option(attr.pk_fk())
      val reference = Option(attr.reference())

      (concatBy, pk_fk, reference) match {
        case (Some(x), _, _) => Separator(x.separator().getText)
        case (_, Some(x), _) => PK_FK(x.getText)
        case (_, _, Some(x)) => Reference(x.fhirResource().getText)
        case _ => ReferenceType()
      }
    }

  }

  /**
    * Creates a Mapping object
    */
  private def getMapping(mc: FlattenerParser.MappingContext): Mapping = {

    //get path list
    val pathNameList = getPathNameList(mc)

    //get sql column this mapping is mapped to
    val column = mc.column_name().getText

    //get the data type
    val dataType = mc.data_type().getText

    //get nullable information
    val isNull = mc.null_notnull().getText.toLowerCase.trim.equals("null")

    //get all attributes if available
    val attribute = Option(mc.attributes()) map getAttribute getOrElse Seq()

    val precision = Option(mc.precision()).map { p => p.id().map(_.getText).toList } getOrElse Nil

    Mapping(pathNameList, column, dataType, precision, isNull, attribute)
  }

  /**
    * Get a MapperSource object contained with a list of Mappings
    */
  private def getMappings(msc: FlattenerParser.MappingsContext): Seq[Mapping] = {
    Option(msc.mapping()) map { mappings =>
      mappings map getMapping
    } getOrElse Seq()
  }

  /**
    * This is the representation plan of the given table.
    */
  private def getMapper(mc: FlattenerParser.MapperContext): Mapper = {

    //get the table name
    val tableName = mc.table_name().getText

    //get the from field
    val fromField = Option(mc.fromField()) map getPathNameList getOrElse Seq()

    //get mappings
    val mappings = getMappings(mc.mappings())

    //get child mappers
    val children = Option(mc.mapper()) map { x => x map getMapper } getOrElse Seq()

    Mapper(tableName, fromField, mappings, children)

  }

  def getMapper(input: InputStream): Mapper = {
    getMapper(getParser(input).mapper())
  }

  def getMapper(input: String): Mapper = {
    getMapper(getParser(input).mapper())
  }

}

case class Mapper(tableName: String, fromField: Seq[PathName] = Seq(), mappings: Seq[Mapping], children: Seq[Mapper] = Seq()) {

  def hasChildren: Boolean = children.nonEmpty

  def isRoot: Boolean = fromField.isEmpty

  private def columnString: String = mappings map { case Mapping(_, col, datatype, precision, nullity, _) =>

    "\t" + {
      if (precision.nonEmpty)

        String.format("%-30s  %-15s %10s %15s",
          s"[$col]",
          datatype.toUpperCase,
          s"(${precision.mkString(" ,")})",
          if (nullity) "NULL" else "NOT NULL"
        )
      else
        String.format("%-30s  %-15s %30s",
          s"[$col]",
          datatype.toUpperCase,
          if (nullity) "NULL" else "NOT NULL"
        )
    }
  } mkString ",\n"

  private def createScript(schema: String): String =
    s"""
       |CREATE TABLE [$schema].[$tableName](
       |$columnString
       |)
    """.stripMargin

  /**
    * Returns a descendent mapper by name. If it is not found, None is returned.
    *
    * @param name name of the child mapper
    * @return
    */
  def findChild(name: String): Option[Mapper] = {
    def find(mappers: Seq[Mapper]): Option[Mapper] = {
      mappers match {
        case Nil => None
        case m :: rest => if (m.tableName == name) Some(m) else find(rest ++ m.children)
      }
    }

    find(List(this))
  }

  /**
    * Utility to create CREATE TABLE scripts for all the mappers in the given directory
    *
    * @param outputDir directory where the files are going to be outputted
    * @param schema    schema of the tables
    */
  def outputCreateTableScript(outputDir: File, schema: String): Unit = {

    if (!outputDir.exists())
      outputDir.mkdirs()

    def write(mappers: Seq[Mapper]): Unit = {
      mappers match {
        case Nil =>
        case m :: rest =>
          val pw = new PrintWriter(outputDir.getAbsolutePath + "/" + m.tableName + ".sql")
          pw.write(m.createScript(schema))
          pw.close()
          write(rest ++ m.children)
      }
    }

    write(List(this))
  }
}
