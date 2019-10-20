package com.github.deprosun.dataflattener.parser

trait MappingAttribute {
  val value: String
}

case class Reference(value: String) extends MappingAttribute {
  override def toString: String = s"Reference[$value]"
}

case class ReferenceType(value: String = "") extends MappingAttribute {
  override def toString: String = s"ReferenceType"
}

case class PK_FK(value: String) extends MappingAttribute {
  override def toString: String = if (value.equalsIgnoreCase("pk")) "PK" else "FK"
}

case class Separator(value: String) extends MappingAttribute {
  override def toString: String = s"ConcatBy['$value']"
}

