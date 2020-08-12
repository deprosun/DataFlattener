package com.github.deprosun.dataflattener

import org.json4s.DefaultFormats
import org.scalatest.FunSpec

class TestStyle extends FunSpec {
  implicit val formats = DefaultFormats // Brings in default date formats etc.
}
