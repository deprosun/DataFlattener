package com.deprosun.dataflattener.parser

case class Mapping(path: Seq[PathName], column: String, dataType: String, precision: List[String], isNull: Boolean, attr: Seq[MappingAttribute])
