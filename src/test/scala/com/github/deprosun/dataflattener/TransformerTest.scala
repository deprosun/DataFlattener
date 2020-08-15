package com.github.deprosun.dataflattener

import com.github.deprosun.dataflattener.model.{PathName, SimpleJsonPathContext, StraightMappingContext}
import org.json4s.JsonAST.{JNothing, JNull, JString}
import org.json4s.{JValue, JsonAST}
import org.json4s.native.JsonMethods._


class TransformerTest extends TestStyle {

  describe("A transformer with only string and int as extraction rules in the world") {

    val transformer = new Transformer {
      override val udfMap: Map[String, this.MapFunc] = Map()

      override def extractValue(json: JsonAST.JValue, mappingContext: StraightMappingContext): Any = {
        mappingContext.dataType.trim.toLowerCase match {
          case "string" => json.extract[String]
          case "int" => json.extract[Int]
        }

      }
    }

    val json: JValue = parse(
      """
        |{
        | "a" : 5,
        | "b" : {
        |   "c" : "foo"
        | }
        |}
      """.stripMargin
    )


    it("should be able to retrieve string value from a path") {

      val mapping = StraightMappingContext(
        SimpleJsonPathContext(path = List(PathName("a"))),
        desiredColumnName = "newColumnA",
        dataType = "string",
        precision = Nil,
        isNull = false,
        attributes = Nil
      )

      transformer.getValueFromStraight(json, mapping) match {
        case ColumnValue(colName, value) =>
          assert(colName == mapping.desiredColumnName, "Column names don't match.")
          assert(value == "5", "Column values don't match.")
      }

    }

    it("should be able to retrieve int value from a path") {

      val mapping = StraightMappingContext(
        SimpleJsonPathContext(path = List(PathName("a"))),
        desiredColumnName = "newColumnA",
        dataType = "int",
        precision = Nil,
        isNull = false,
        attributes = Nil
      )

      transformer.getValueFromStraight(json, mapping) match {
        case ColumnValue(colName, value) =>
          assert(colName == mapping.desiredColumnName, "Column names don't match.")
          assert(value == 5, "Column values don't match.")
      }

    }

    it("should be able to retrieve value from nested structure") {

      val mapping = StraightMappingContext(
        SimpleJsonPathContext(path = List(PathName("b"), PathName("c"))),
        desiredColumnName = "newColumnA",
        dataType = "string",
        precision = Nil,
        isNull = false,
        attributes = Nil
      )

      transformer.getValueFromStraight(json, mapping) match {
        case ColumnValue(colName, value) =>
          assert(colName == mapping.desiredColumnName, "Column names don't match.")
          assert(value == "foo", "Column values don't match.")
      }

    }

    it("should throw error when unknown data type is mentioned") {

      val mapping = StraightMappingContext(
        SimpleJsonPathContext(path = List(PathName("a"))),
        desiredColumnName = "newColumnA",
        dataType = "varchar",
        precision = Nil,
        isNull = false,
        attributes = Nil
      )

      intercept[Exception](transformer.getValueFromStraight(json, mapping)) match {
        case x => assert(x.isInstanceOf[MatchError])
      }

    }

  }

  describe("A transformer that only produces json") {

    val transformer = new Transformer {
      override val udfMap: Map[String, this.MapFunc] = Map()

      override def extractValue(json: JsonAST.JValue, mappingContext: StraightMappingContext): Any =
        mappingContext.dataType.trim.toLowerCase match {
          case "json" => json
        }
    }

    val json: JValue = parse(
      """
        |{
        | "a" : 5,
        | "b" : {
        |   "c" : "foo"
        | }
        |}
      """.stripMargin
    )


    it("should be able to retrieve json struct") {

      val mapping = StraightMappingContext(
        SimpleJsonPathContext(path = List(PathName("b"))),
        desiredColumnName = "newColumnA",
        dataType = "json",
        precision = Nil,
        isNull = false,
        attributes = Nil
      )

      val expectedValue = json \ mapping.path.asInstanceOf[SimpleJsonPathContext].path.head.id

      transformer.getValueFromStraight(json, mapping) match {
        case ColumnValue(colName, value) =>
          assert(colName == mapping.desiredColumnName, "Column names don't match.")
          assert(value == expectedValue, "Column values don't match.")
      }

    }

  }

}
