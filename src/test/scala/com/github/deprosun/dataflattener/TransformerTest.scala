package com.github.deprosun.dataflattener

import com.github.deprosun.dataflattener.model.{MapperContext, PathName, SimpleJsonPathContext, StraightMappingContext}
import org.json4s
import org.json4s.JValue
import org.json4s.JsonAST.JString
import org.json4s.native.JsonMethods._
import org.slf4j.{Logger, LoggerFactory}

import scala.util.Random


class TransformerTest extends TestStyle {

  def getLogger(): Logger = LoggerFactory.getLogger("test")

  describe("A transformer with only string and int as extraction rules in the world") {

    val transformer = new Transformer {

      override val logger: Logger = getLogger()

      //define your custom transformation functions
      override val udfMap: Map[String, this.MapFunc] = Map()

      //define your custom data type
      override val customDataType: Map[String, JValue => Option[Any]] = Map()

      //vault for sensitive data retrieval
      override val vaultAddress: String = ""
      override val vaultToken: String = ""
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


    it("should throw error when a varchar is requested from an int") {

      val mapping = StraightMappingContext(
        SimpleJsonPathContext(path = List(PathName("a"))),
        desiredColumnName = "newColumnA",
        dataType = "varchar",
        precision = Nil,
        isNull = false,
        attributes = Nil
      )

      intercept[IllegalArgumentException](transformer.getValueFromStraight(json, mapping))

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
          value match {
            case None => fail("fail")
            case Some(x: Int) => assert(x == 5, "Column values don't match.")
          }
      }

    }

    it("should be able to retrieve value from nested structure") {

      val mapping = StraightMappingContext(
        SimpleJsonPathContext(path = List(PathName("b"), PathName("c"))),
        desiredColumnName = "newColumnA",
        dataType = "varchar",
        precision = Nil,
        isNull = false,
        attributes = Nil
      )

      transformer.getValueFromStraight(json, mapping) match {
        case ColumnValue(colName, value) =>
          assert(colName == mapping.desiredColumnName, "Column names don't match.")
          value match {
            case None => fail("fail")
            case Some(x: String) => assert(x == "foo", "Column values don't match.")
          }
      }

    }

    it("should throw error when unknown data type is mentioned") {

      val mapping = StraightMappingContext(
        SimpleJsonPathContext(path = List(PathName("a"))),
        desiredColumnName = "newColumnA",
        dataType = "unknown",
        precision = Nil,
        isNull = false,
        attributes = Nil
      )

      intercept[UnsupportedOperationException](transformer.getValueFromStraight(json, mapping))

    }

  }

  describe("A transformer that only produces json") {

    val transformer: Transformer = new Transformer {

      override val logger: Logger = getLogger()

      override val udfMap: Map[String, this.MapFunc] = Map()

      def extractJson(json: JValue): Option[Any] = Option(json)

      override val customDataType: Map[String, JValue => Option[Any]] = Map(
        "JSON" -> extractJson
      )

      //vault for sensitive data retrieval
      override val vaultAddress: String = ""

      override val vaultToken: String = ""

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
          value match {
            case None => fail("fail")
            case Some(x: JValue) => assert(x == expectedValue, "Column values don't match.")
          }
      }

    }

  }

  describe("A full transformation") {

    def superSafeEncryptionApi(s: String) = {
      s.reverse.foldLeft("") { (acc, x) =>
        acc + Random.nextPrintableChar() + x
      }
    }

    val transformer: Transformer = new Transformer {

      override val logger: Logger = getLogger()

      def encrypt(json: List[JValue]): JValue = json match {
        case JString(s) :: Nil => JString(superSafeEncryptionApi(s))
        case x =>
          throw new UnknownError(s"Should not get here $x")
      }

      override val udfMap: Map[String, this.MapFunc] = Map(
        "encrypt" -> encrypt
      )

      //vault for sensitive data retrieval
      override val vaultAddress: String = ""
      override val vaultToken: String = ""

      override val customDataType: Map[String, json4s.JValue => Option[Any]] = Map()
    }

    val json: JValue = parse(
      """
        |{
        | "id" : 5,
        | "name" : {
        |   "first" : "Karan",
        |   "last" : "Gupta",
        |   "SSN" : "123-234-556"
        | }
        |}
      """.stripMargin
    )

    val mapper =
      """
        |TABLE User (
        |    MAPPING (
        |        id                 =   partyId       Int             NOT NULL
        |        name.first         =   firstName     VARCHAR (100)   NOT NULL
        |        name.last          =   lastName      VARCHAR (100)   NOT NULL
        |        encrypt(name.SSN)  =   ssn           VARCHAR (100)   NOT NULL
        |    )
        |)
      """.stripMargin

    MapperContext.getMappers(mapper) foreach { x =>
      println(
        transformer.transform(json, x)
      )
    }

  }
}
