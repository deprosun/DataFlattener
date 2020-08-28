package com.github.deprosun.dataflattener.model

import com.github.deprosun.dataflattener.parser.FlattenerParser

object AttributeContext {
  /**
    * Convert FlattenerParser.ReferenceContext to ReferenceAttributeContext
    */
  def getReferenceAttributeContext(context: FlattenerParser.ReferenceContext): ReferenceAttributeContext = {
    val tableName = context.table_name().getText

    val columnName = Option(context.id()) map (_.getText)

    ReferenceAttributeContext(tableName, columnName)
  }

  /**
    * Convert FlattenerParser.Pk_fkContext to AttributeContext
    */
  def getPKFkAttributeContext(context: FlattenerParser.Pk_fkContext): AttributeContext = {
    val isPk = Option(context.pk()).isDefined

    if (isPk) return PrimaryKeyAttributeContext

    ForeignKeyAttributeContext
  }

  /**
    * Convert FlattenerParser.AttributeContext to AttributeContext
    */
  def getAttributeContext(context: FlattenerParser.AttributeContext): AttributeContext = {
    val isReference = Option(context.reference()).nonEmpty

    if (isReference) getReferenceAttributeContext(context.reference())
    else getPKFkAttributeContext(context.pk_fk())
  }
}

trait AttributeContext

case class ReferenceAttributeContext(tableName: String, columnName: Option[String]) extends AttributeContext

case object PrimaryKeyAttributeContext extends AttributeContext

case object ForeignKeyAttributeContext extends AttributeContext
