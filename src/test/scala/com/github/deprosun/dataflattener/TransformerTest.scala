package com.github.deprosun.dataflattener

import com.github.deprosun.dataflattener.model.{MapperContext, PathName, SimpleJsonPathContext, StraightMappingContext}
import org.json4s
import org.json4s.JsonAST.{JArray, JField, JObject, JString}
import org.json4s.native.JsonMethods._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.write
import org.json4s.{Formats, JValue, NoTypeHints}
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
        case Column(colName, value) =>
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
        case Column(colName, value) =>
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
        case Column(colName, value) =>
          assert(colName == mapping.desiredColumnName, "Column names don't match.")
          value match {
            case None => fail("fail")
            case Some(x: JValue) => assert(x == expectedValue, "Column values don't match.")
          }
      }

    }

  }

  //    describe("A full transformation") {
  //
  //      def superSafeEncryptionApi(s: String) = {
  //        s.reverse.foldLeft("") { (acc, x) =>
  //          acc + Random.nextPrintableChar() + x
  //        }
  //      }
  //
  //      val transformer: Transformer = new Transformer {
  //
  //        override val logger: Logger = getLogger()
  //
  //        def encrypt(json: List[JValue]): JValue = json match {
  //          case JString(s) :: Nil => JString(superSafeEncryptionApi(s))
  //          case x =>
  //            throw new UnknownError(s"Should not get here $x")
  //        }
  //
  //        def toUpperCase(json: List[JValue]): JValue = json match {
  //          case JString(s) :: Nil => JString(s.toUpperCase())
  //          case x =>
  //            throw new UnknownError(s"Should not get here $x")
  //        }
  //
  //        override val udfMap: Map[String, this.MapFunc] = Map(
  //          "encrypt" -> encrypt
  //        )
  //
  //        //vault for sensitive data retrieval
  //        override val vaultAddress: String = ""
  //        override val vaultToken: String = ""
  //
  //        override val customDataType: Map[String, json4s.JValue => Option[Any]] = Map()
  //      }
  //
  //      val json: JValue = parse(
  //        """
  //          |{
  //          | "id" : 5,
  //          | "name" : {
  //          |   "first" : "Karan",
  //          |   "last" : "Gupta",
  //          |   "SSN" : "123-234-556"
  //          | },
  //          | "children" : [
  //          |   {
  //          |     "nickName" : "sunny"
  //          |   },
  //          |   {
  //          |     "nickName" : "lorry"
  //          |   }
  //          | ]
  //          |}
  //        """.stripMargin
  //      )
  //
  //      val mapper =
  //        """
  //          |TABLE User (
  //          |    MAPPING (
  //          |        id                 =   partyId       Int             NOT NULL
  //          |        name.first         =   firstName     VARCHAR (100)   NOT NULL
  //          |        name.last          =   lastName      VARCHAR (100)   NOT NULL
  //          |        encrypt(name.SSN)  =   ssn           VARCHAR (100)   NOT NULL
  //          |    )
  //          |
  //          |    TABLE Child FROM children (
  //          |       MAPPING(
  //          |           toUpperCase(nameName)  = nName VARCHAR (100)   NOT NULL
  //          |       )
  //          |    )
  //          |)
  //        """.stripMargin
  //
  //      implicit val formats: AnyRef with Formats = Serialization.formats(NoTypeHints)
  //
  //      val ss = MapperContext.getMappers(mapper)
  //
  //      MapperContext.getMappers(mapper) foreach { x =>
  //        transformer.transform(json, x).foreach(x => println(write(x)))
  //      }
  //
  //    }

  describe("A full transformation with filter records") {

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

      def combineParties(json: List[JValue]): JValue = {
        val insured: JValue = json.head \ "dob"
        val owners: JArray = json.last.extract[JArray]

        val ownersDob = owners filterField { case (x, _) => x == "dob" } map { case (_, v) => "dateOfBirth" -> v }

        val allDobs: List[JField] = ("dateOfBirth" -> insured) :: ownersDob

        val array: JValue = JArray(allDobs map { x =>
          JObject(x)
        })


        array
      }

      def extractJson(json: JValue): Option[Any] = Option(json)

      override val udfMap: Map[String, this.MapFunc] = Map(
        "encrypt" -> encrypt,
        "combineParties" -> combineParties
      )

      //vault for sensitive data retrieval
      override val vaultAddress: String = ""
      override val vaultToken: String = ""

      override val customDataType: Map[String, json4s.JValue => Option[Any]] = Map(
        "JSON" -> extractJson
      )
    }

    //    val json: JValue = parse(
    //      """
    //        |{
    //        | "id" : 5,
    //        | "name" : {
    //        |   "first" : "Karan",
    //        |   "last" : "Gupta",
    //        |   "SSN" : "123-234-556"
    //        | }
    //        |}
    //      """.stripMargin
    //    )


    //    it("should return 0 records when predicates dont match") {
    //      val mapper =
    //        """
    //          |TABLE User FILTER id = 5 (
    //          |    MAPPING (
    //          |        id                 =   partyId       Int             NOT NULL
    //          |        name.first         =   firstName     VARCHAR (100)   NOT NULL
    //          |        name.last          =   lastName      VARCHAR (100)   NOT NULL
    //          |        encrypt(name.SSN)  =   ssn           VARCHAR (100)   NOT NULL
    //          |    )
    //          |)
    //        """.stripMargin
    //
    //      MapperContext.getMappers(mapper) foreach { x =>
    //        assert(transformer.transform(json, x) == Nil)
    //      }
    //    }

    it("CoverPath to A360") {
      val json = parse(
        """
          |{
          |    "eventHeader":{
          |        "eventType": "applicationSubmitted",
          |        "eventGroup": "Policy",
          |        "eventDateTime": "2020-07-21T04:10:18.861Z",
          |        "eventOccuredDateTime": "2020-07-21T04:10:18.861Z",
          |        "eventId": "efa2d474-02f4-4d0e-893b-5bda0eed016d",
          |        "eventRequester": "coverpath"
          |    },
          |    "eventBody": {
          |        "policy": {
          |            "policyNumber": "402000000",
          |            "productType": "TermLife",
          |            "productCode": "CPL100",
          |            "companyCode": "CP45",
          |            "faceAmount": 500000,
          |            "status": "submitted",
          |            "externalKey": "HAP"
          |        },
          |        "insured": {
          |            "nonNatural": false,
          |            "entityName": null,
          |            "firstName": "Donald",
          |            "lastName": "Duck",
          |            "middleName": "Duey",
          |            "dob": "2000-06-23T00:00:00Z",
          |            "govId": "109984944",
          |            "govIdType": "SSN",
          |            "address": {
          |                "street": "38 Haggerty Hill Rd",
          |                "city": "Juneau",
          |                "state": "AK",
          |                "zip": "99801",
          |                "country": "US"
          |            }
          |        },
          |        "owners": [
          |            {
          |                "nonNatural": false,
          |                "entityName": null,
          |                "firstName": "John",
          |                "lastName": "Smith",
          |                "middleName": "Will",
          |                "dob": "1987-07-02T00:00:00Z",
          |                "govId": "341127689",
          |                "govIdType": "SSN",
          |                "address": {
          |                    "street": "38 Haggerty Hill Rd",
          |                    "city": "Juneau",
          |                    "state": "AK",
          |                    "zip": "99801",
          |                    "country": "US"
          |                }
          |            },
          |            {
          |                "nonNatural": false,
          |                "entityName": null,
          |                "firstName": "Alice",
          |                "lastName": "Smith",
          |                "middleName": "Mary",
          |                "dob": "1986-03-21T00:00:00Z",
          |                "govId": "125677689",
          |                "govIdType": "SSN",
          |                "address": {
          |                    "street": "38 Haggerty Hill Rd",
          |                    "city": "Juneau",
          |                    "state": "AK",
          |                    "zip": "99801",
          |                    "country": "US"
          |                }
          |            }
          |        ],
          |        "advisors": [
          |            {
          |                "advisorId": "AA438607",
          |                "role": "primary"
          |            },
          |            {
          |                "advisorId": "AA424123",
          |                "role": "secondary"
          |            }
          |        ]
          |    }
          |}
        """.stripMargin
      )

      val mapper =
        """
          |TABLE A360 (
          |    MAPPING (
          |     eventBody.policy.policyNumber             = policyNumber        VARCHAR       NOT NULL
          |     combineParties(eventBody.insured, eventBody.owners)           = parties             JSON          NOT NULL
          |    )
          |)
        """.stripMargin

      MapperContext.getMappers(mapper) foreach { x =>
        transformer.transform(json, x) foreach { y =>
          println(y.toString)

          //          println(write(y))
        }
      }
    }

  }

  describe("A full transformation with filter recordsdfs") {

    val transformer: Transformer = new Transformer {

      override val logger: Logger = getLogger()

      def extractJson(json: JValue): Option[Any] = Option(json)

      override val udfMap: Map[String, this.MapFunc] = Map(
      )

      //vault for sensitive data retrieval
      override val vaultAddress: String = ""
      override val vaultToken: String = ""

      override val customDataType: Map[String, json4s.JValue => Option[Any]] = Map(
        "JSON" -> extractJson
      )
    }

    it("CoverPath to A360") {
      val json = parse(
        """
          |{
          |    "eventHeader":{
          |        "eventType": "applicationSubmitted",
          |        "eventGroup": "Policy",
          |        "eventDateTime": "2020-07-21T04:10:18.861Z",
          |        "eventOccuredDateTime": "2020-07-21T04:10:18.861Z",
          |        "eventId": "efa2d474-02f4-4d0e-893b-5bda0eed016d",
          |        "eventRequester": "coverpath"
          |    },
          |    "eventBody": {
          |        "policy": {
          |            "policyNumber": "402000000",
          |            "productType": "TermLife",
          |            "productCode": "CPL100",
          |            "companyCode": "CP45",
          |            "faceAmount": 500000,
          |            "status": "submitted",
          |            "externalKey": "HAP"
          |        },
          |        "insured": {
          |            "nonNatural": false,
          |            "entityName": null,
          |            "firstName": "Donald",
          |            "lastName": "Duck",
          |            "middleName": "Duey",
          |            "dob": "2000-06-23T00:00:00Z",
          |            "govId": "109984944",
          |            "govIdType": "SSN",
          |            "address": {
          |                "street": "38 Haggerty Hill Rd",
          |                "city": "Juneau",
          |                "state": "AK",
          |                "zip": "99801",
          |                "country": "US"
          |            }
          |        },
          |        "owners": [
          |            {
          |                "nonNatural": false,
          |                "entityName": null,
          |                "firstName": "John",
          |                "lastName": "Smith",
          |                "middleName": "Will",
          |                "dob": "1987-07-02T00:00:00Z",
          |                "govId": "341127689",
          |                "govIdType": "SSN",
          |                "address": {
          |                    "street": "38 Haggerty Hill Rd",
          |                    "city": "Juneau",
          |                    "state": "AK",
          |                    "zip": "99801",
          |                    "country": "US"
          |                },
          |                "owners": [
          |                     {
          |                         "nonNatural": false,
          |                         "entityName": null,
          |                         "firstName": "John",
          |                         "lastName": "Smith",
          |                         "middleName": "Will",
          |                         "dob": "1987-07-02T00:00:00Z",
          |                         "govId": "341127689",
          |                         "govIdType": "SSN",
          |                         "address": {
          |                             "street": "38 Haggerty Hill Rd",
          |                             "city": "Juneau",
          |                             "state": "AK",
          |                             "zip": "99801",
          |                             "country": "US"
          |                         }
          |                     },
          |                     {
          |                         "nonNatural": false,
          |                         "entityName": null,
          |                         "firstName": "Alice",
          |                         "lastName": "Smith",
          |                         "middleName": "Mary",
          |                         "dob": "1986-03-21T00:00:00Z",
          |                         "govId": "125677689",
          |                         "govIdType": "SSN",
          |                         "address": {
          |                             "street": "38 Haggerty Hill Rd",
          |                             "city": "Juneau",
          |                             "state": "AK",
          |                             "zip": "99801",
          |                             "country": "US"
          |                         }
          |                     }
          |                 ]
          |            },
          |            {
          |                "nonNatural": false,
          |                "entityName": null,
          |                "firstName": "Alice",
          |                "lastName": "Smith",
          |                "middleName": "Mary",
          |                "dob": "1986-03-21T00:00:00Z",
          |                "govId": "125677689",
          |                "govIdType": "SSN",
          |                "address": {
          |                    "street": "38 Haggerty Hill Rd",
          |                    "city": "Juneau",
          |                    "state": "AK",
          |                    "zip": "99801",
          |                    "country": "US"
          |                },
          |                "owners": [
          |                     {
          |                         "nonNatural": false,
          |                         "entityName": null,
          |                         "firstName": "John",
          |                         "lastName": "Smith",
          |                         "middleName": "Will",
          |                         "dob": "1987-07-02T00:00:00Z",
          |                         "govId": "341127689",
          |                         "govIdType": "SSN",
          |                         "address": {
          |                             "street": "38 Haggerty Hill Rd",
          |                             "city": "Juneau",
          |                             "state": "AK",
          |                             "zip": "99801",
          |                             "country": "US"
          |                         }
          |                     },
          |                     {
          |                         "nonNatural": false,
          |                         "entityName": null,
          |                         "firstName": "Alice",
          |                         "lastName": "Smith",
          |                         "middleName": "Mary",
          |                         "dob": "1986-03-21T00:00:00Z",
          |                         "govId": "125677689",
          |                         "govIdType": "SSN",
          |                         "address": {
          |                             "street": "38 Haggerty Hill Rd",
          |                             "city": "Juneau",
          |                             "state": "AK",
          |                             "zip": "99801",
          |                             "country": "US"
          |                         }
          |                     }
          |                 ]
          |            }
          |        ],
          |        "advisors": [
          |            {
          |                "advisorId": "AA438607",
          |                "role": "primary"
          |            },
          |            {
          |                "advisorId": "AA424123",
          |                "role": "secondary"
          |            }
          |        ]
          |    }
          |}
        """.stripMargin
      )

      val mapper =
        """
          |TABLE A360 (
          |    MAPPING (
          |         eventHeader.eventType               = type          VARCHAR (100)   NOT NULL
          |         explode(eventBody.owners) (
          |             firstName               = firstName          VARCHAR (100)   NOT NULL
          |             dob                     = dob                VARCHAR (100)   NOT NULL
          |             explode(owners) (
          |                 firstName               = innerFirstName          VARCHAR (100)   NOT NULL
          |                 dob                     = innerDob                VARCHAR (100)   NOT NULL
          |             )
          |         )
          |    )
          |)
        """.stripMargin

      MapperContext.getMappers(mapper) foreach { x =>
        transformer.transform(json, x) foreach { y =>
          println(y.toString)
        }
      }
    }

  }
}
