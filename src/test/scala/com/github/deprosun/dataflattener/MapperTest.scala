package com.github.deprosun.dataflattener

import com.github.deprosun.dataflattener.model._
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.json4s.native.JsonMethods._

import scala.language.postfixOps

class MapperTest extends TestStyle {

  describe("A mapper") {

    describe("with root table definition with no 'from' field column") {

      val config =

        """
          |
          |TOPIC dim_rules_result (
          |    MAPPING (
          |        EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |           suitabilityRuleId               = ruleId            VARCHAR (100)   NOT NULL
          |           ruleResultValue                 = ruleResult        VARCHAR (101)   NOT NULL
          |           TO_UUID(gateResultValue)        = gateResultValue   VARCHAR (105)   NOT NULL
          |        )
          |    )
          |)
          |
          |
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        val expected = MapperContext(
          topicName = "dim_rules_result",
          fromField = None,
          filter = None,
          broadcast = BroadCast(Map()),
          mappings = List(
            ExplodeMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
              broadcast = BroadCast(
                Map(
                  "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                  "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription"))))
              ),
              mappings = List(
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                  desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                  isNull = false, attributes = Nil
                ),
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("ruleResultValue"))),
                  desiredColumnName = "ruleResult", dataType = "VARCHAR", precision = List("101"),
                  isNull = false, attributes = Nil
                ),
                StraightMappingContext(
                  path = MapFunctionJsonPathContext(
                    funcName = "TO_UUID",
                    functionParams = List(SimpleJsonPathContext(List(PathName("gateResultValue"))))
                  ),
                  desiredColumnName = "gateResultValue", dataType = "VARCHAR", precision = List("105"),
                  isNull = false, attributes = Nil
                )
              )
            )
          ),
          children = Nil
        )

        val diff = parse(MapperContext.toJSON(actual)).diff(parse(MapperContext.toJSON(expected)))

        assert(actual == expected, diff)

      }
    }

    describe("with an explode type mapping") {

      val config =

        """
          |
          |TOPIC dim_rules_result FROM rulesResult (
          |  MAPPING (
          |      EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |         suitabilityRuleId           = ruleId                        VARCHAR (100)   NOT NULL
          |         ruleResultValue             = ruleResult                        VARCHAR (101)   NOT NULL
          |         TO_UUID(gateResultValue)    = gateResult             VARCHAR (105)   NOT NULL
          |      )
          |  )
          |)
          |
          |
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        val expected = MapperContext(
          topicName = "dim_rules_result",
          fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
          filter = None,
          broadcast = BroadCast(Map()),
          mappings = List(
            ExplodeMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
              broadcast = BroadCast(
                Map(
                  "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                  "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription"))))
              ),
              mappings = List(
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                  desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                  isNull = false, attributes = Nil
                ),
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("ruleResultValue"))),
                  desiredColumnName = "ruleResult", dataType = "VARCHAR", precision = List("101"),
                  isNull = false, attributes = Nil
                ),
                StraightMappingContext(
                  path = MapFunctionJsonPathContext(
                    funcName = "TO_UUID",
                    functionParams = List(SimpleJsonPathContext(List(PathName("gateResultValue"))))
                  ),
                  desiredColumnName = "gateResult", dataType = "VARCHAR", precision = List("105"),
                  isNull = false, attributes = Nil
                )
              )
            )
          ),
          children = Nil
        )

        val diff = parse(MapperContext.toJSON(actual)).diff(parse(MapperContext.toJSON(expected)))

        assert(actual == expected, diff)

      }
    }

    describe("with an explode type mapping and straight type mapping as siblings") {

      val config =

        """
          |
          |TOPIC dim_rules_result FROM rulesResult FILTER query = obama (
          |    MAPPING (
          |        suitabilityRuleId = ruleId                                VARCHAR (100)   NOT NULL
          |        EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |           suitabilityRuleId = ruleId                         VARCHAR (100)   NOT NULL
          |           ruleResultValue = ruleResult                       VARCHAR (101)   NOT NULL
          |           TO_UUID(gateResultValue) = gateResultValue          VARCHAR (105)   NOT NULL
          |        )
          |    )
          |)
          |
          |
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        val expected = MapperContext(
          topicName = "dim_rules_result",
          fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
          filter = Some(Filter(SimpleJsonPathContext(List(PathName("query"))), SimpleJsonPathContext(List(PathName("obama"))))),
          broadcast = BroadCast(Map()),
          mappings = List(
            StraightMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
              desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
              isNull = false, attributes = Nil
            ),
            ExplodeMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
              broadcast = BroadCast(
                Map(
                  "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                  "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription"))))
              ),
              mappings = List(
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                  desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                  isNull = false, attributes = Nil
                ),
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("ruleResultValue"))),
                  desiredColumnName = "ruleResult", dataType = "VARCHAR", precision = List("101"),
                  isNull = false, attributes = Nil
                ),
                StraightMappingContext(
                  path = MapFunctionJsonPathContext(
                    funcName = "TO_UUID",
                    functionParams = List(SimpleJsonPathContext(List(PathName("gateResultValue"))))
                  ),
                  desiredColumnName = "gateResultValue", dataType = "VARCHAR", precision = List("105"),
                  isNull = false, attributes = Nil
                )
              )
            )
          ),
          children = Nil
        )

        val diff = parse(MapperContext.toJSON(actual)).diff(parse(MapperContext.toJSON(expected)))

        assert(actual == expected, diff)
      }
    }

    describe("with a child table") {

      val config =

        """
          |
          |TOPIC dim_rules_result FROM rulesResult (
          |    MAPPING (
          |        suitabilityRuleId  = ruleId                               VARCHAR (100)   NOT NULL
          |        EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |           suitabilityRuleId = ruleId                        VARCHAR (100)   NOT NULL
          |           ruleResultValue = ruleResult                      VARCHAR (101)   NOT NULL
          |           TO_UUID(gateResultValue) = gateResult             VARCHAR (105)   NOT NULL
          |        )
          |    )
          |    TOPIC childTable FROM someProperty (
          |       MAPPING (
          |           suitabilityRuleId  = ruleId                               VARCHAR (100)   NOT NULL
          |           EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |              suitabilityRuleId = ruleId                        VARCHAR (100)   NOT NULL
          |              ruleResultValue = ruleResult                      VARCHAR (101)   NOT NULL
          |              TO_UUID(gateResultValue) = gateResult             VARCHAR (105)   NOT NULL
          |           )
          |       )
          |    )
          |)
          |
          |
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        val expected = MapperContext(
          topicName = "dim_rules_result",
          fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
          filter = None,
          broadcast = BroadCast(Map()),
          mappings = List(
            StraightMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
              desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
              isNull = false, attributes = Nil
            ),
            ExplodeMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
              broadcast = BroadCast(
                Map(
                  "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                  "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription"))))
              ),
              mappings = List(
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                  desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                  isNull = false, attributes = Nil
                ),
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("ruleResultValue"))),
                  desiredColumnName = "ruleResult", dataType = "VARCHAR", precision = List("101"),
                  isNull = false, attributes = Nil
                ),
                StraightMappingContext(
                  path = MapFunctionJsonPathContext(
                    funcName = "TO_UUID",
                    functionParams = List(SimpleJsonPathContext(List(PathName("gateResultValue"))))
                  ),
                  desiredColumnName = "gateResult", dataType = "VARCHAR", precision = List("105"),
                  isNull = false, attributes = Nil
                )
              )
            )
          ),
          children = List(
            MapperContext(
              topicName = "childTable",
              fromField = Some(SimpleJsonPathContext(List(PathName("someProperty")))),
              filter = None,
              broadcast = BroadCast(Map()),
              mappings = List(
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                  desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                  isNull = false, attributes = Nil
                ),
                ExplodeMappingContext(
                  path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
                  broadcast = BroadCast(
                    Map(
                      "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                      "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription"))))
                  ),
                  mappings = List(
                    StraightMappingContext(
                      path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                      desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                      isNull = false, attributes = Nil
                    ),
                    StraightMappingContext(
                      path = SimpleJsonPathContext(List(PathName("ruleResultValue"))),
                      desiredColumnName = "ruleResult", dataType = "VARCHAR", precision = List("101"),
                      isNull = false, attributes = Nil
                    ),
                    StraightMappingContext(
                      path = MapFunctionJsonPathContext(
                        funcName = "TO_UUID",
                        functionParams = List(SimpleJsonPathContext(List(PathName("gateResultValue"))))
                      ),
                      desiredColumnName = "gateResult", dataType = "VARCHAR", precision = List("105"),
                      isNull = false, attributes = Nil
                    )
                  )
                )
              ),
              children = Nil
            )
          )
        )

        val diff = parse(MapperContext.toJSON(actual)).diff(parse(MapperContext.toJSON(expected)))

        assert(actual == expected, diff)

      }
    }

    describe("with a child table where user forgot to define 'from' field") {

      val config =

        """
          |
          |TOPIC dim_rules_result FROM rulesResult (
          |    MAPPING (
          |        (ruleId = suitabilityRuleId                                VARCHAR (100)   NOT NULL
          |        EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |           (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |           (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |           (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
          |        )
          |    )
          |    TOPIC childTable (
          |       MAPPING (
          |           (ruleId = suitabilityRuleId)                                VARCHAR (100)   NOT NULL
          |           EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |              (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |              (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |              (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
          |           )
          |       )
          |    )
          |)
          |
          |
        """.stripMargin

      it("should throw an error") {

        intercept[ParseCancellationException](MapperContext.getMappers(config) head)

      }
    }

    describe("with a multiple table definitions as siblings") {

      val config =

        """
          |
          |TOPIC dim_rules_result FROM rulesResult (
          |    MAPPING (
          |        EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |           suitabilityRuleId        = ruleId                VARCHAR (100)   NOT NULL
          |           ruleResultValue          = ruleResult           VARCHAR (101)   NOT NULL
          |           TO_UUID(gateResultValue) = gateResult            VARCHAR (105)   NOT NULL
          |        )
          |    )
          |)
          |
          |TOPIC anotherTable FROM rulesResult (
          |    MAPPING (
          |        EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |           suitabilityRuleId        = ruleId                VARCHAR (100)   NOT NULL
          |           ruleResultValue          = ruleResult           VARCHAR (101)   NOT NULL
          |           TO_UUID(gateResultValue) = gateResult            VARCHAR (105)   NOT NULL
          |        )
          |    )
          |)
          |
          |
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config)

        val expected = List(
          MapperContext(
            topicName = "dim_rules_result",
            fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
            filter = None,
            broadcast = BroadCast(Map()),
            mappings = List(
              ExplodeMappingContext(
                path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
                broadcast = BroadCast(
                  Map(
                    "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                    "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription"))))
                ),
                mappings = List(
                  StraightMappingContext(
                    path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                    desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                    isNull = false, attributes = Nil
                  ),
                  StraightMappingContext(
                    path = SimpleJsonPathContext(List(PathName("ruleResultValue"))),
                    desiredColumnName = "ruleResult", dataType = "VARCHAR", precision = List("101"),
                    isNull = false, attributes = Nil
                  ),
                  StraightMappingContext(
                    path = MapFunctionJsonPathContext(
                      funcName = "TO_UUID",
                      functionParams = List(SimpleJsonPathContext(List(PathName("gateResultValue"))))
                    ),
                    desiredColumnName = "gateResult", dataType = "VARCHAR", precision = List("105"),
                    isNull = false, attributes = Nil
                  )
                )
              )
            ),
            children = Nil
          ),
          MapperContext(
            topicName = "anotherTable",
            fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
            filter = None,
            broadcast = BroadCast(Map()),
            mappings = List(
              ExplodeMappingContext(
                path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
                broadcast = BroadCast(
                  Map(
                    "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                    "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription"))))
                ),
                mappings = List(
                  StraightMappingContext(
                    path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                    desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                    isNull = false, attributes = Nil
                  ),
                  StraightMappingContext(
                    path = SimpleJsonPathContext(List(PathName("ruleResultValue"))),
                    desiredColumnName = "ruleResult", dataType = "VARCHAR", precision = List("101"),
                    isNull = false, attributes = Nil
                  ),
                  StraightMappingContext(
                    path = MapFunctionJsonPathContext(
                      funcName = "TO_UUID",
                      functionParams = List(SimpleJsonPathContext(List(PathName("gateResultValue"))))
                    ),
                    desiredColumnName = "gateResult", dataType = "VARCHAR", precision = List("105"),
                    isNull = false, attributes = Nil
                  )
                )
              )
            ),
            children = Nil
          )
        )

        assert(actual == expected)

      }
    }

    describe("with values being projected from outside the table should be parseable") {

      val config =

        """
          |
          |TOPIC dim_rules_result FROM rulesResult BROADCAST (func(some) AS someValue) (
          |    MAPPING (
          |        EXPLODE suitabilityRuleResults BROADCAST (gateResultValue AS gateResultValue, gateTypeDescription AS gateTypeDescription) (
          |           suitabilityRuleId        = ruleId                VARCHAR (100)   NOT NULL
          |           ruleResultValue          = ruleResult           VARCHAR (101)   NOT NULL
          |           TO_UUID(gateResultValue) = gateResult            VARCHAR (105)   NOT NULL
          |        )
          |    )
          |)
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config)

        val expected = List(
          MapperContext(
            topicName = "dim_rules_result",
            fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
            filter = None,
            broadcast = BroadCast(
              Map(
                "someValue" -> MapFunctionJsonPathContext("func", List(SimpleJsonPathContext(List(PathName("some")))))
              )
            ),
            mappings = List(
              ExplodeMappingContext(
                path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
                broadcast = BroadCast(
                  Map(
                    "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                    "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription"))))
                ),
                mappings = List(
                  StraightMappingContext(
                    path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                    desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                    isNull = false, attributes = Nil
                  ),
                  StraightMappingContext(
                    path = SimpleJsonPathContext(List(PathName("ruleResultValue"))),
                    desiredColumnName = "ruleResult", dataType = "VARCHAR", precision = List("101"),
                    isNull = false, attributes = Nil
                  ),
                  StraightMappingContext(
                    path = MapFunctionJsonPathContext(
                      funcName = "TO_UUID",
                      functionParams = List(SimpleJsonPathContext(List(PathName("gateResultValue"))))
                    ),
                    desiredColumnName = "gateResult", dataType = "VARCHAR", precision = List("105"),
                    isNull = false, attributes = Nil
                  )
                )
              )
            ),
            children = Nil
          )
        )

        assert(actual == expected)

      }
    }

    describe("Table with INTERNAL") {

      val config =

        """
          |TOPIC Sample (
          |    MAPPING (
          |        eventBody.policy.policyNumber                                =   policyNumber          VARCHAR   NOT NULL
          |        LIST advisors FROM eventBody.advisors BROADCAST (eventBody.policy.policyNumber AS pNumber) (
          |            advisorId                                   = advisorId             VARCHAR     NOT NULL
          |            pNumber                                     = policyNumber          VARCHAR     NOT NULL
          |            OBJECT foo FROM (number.foo AS someAlias) (
          |               someAlias                   = someAliasColumn             VARCHAR     NOT NULL
          |            )
          |        )
          |    )
          |)
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        println(actual)

        val expected = MapperContext(
          topicName = "Sample",
          fromField = None,
          filter = None,
          broadcast = BroadCast(Map()),
          mappings = List(
            StraightMappingContext(
              SimpleJsonPathContext(
                List(PathName("eventBody"), PathName("policy"), PathName("policyNumber"))
              ),
              "policyNumber",
              "VARCHAR",
              Nil,
              isNull = false,
              Nil
            ),
            ListMappingContext(
              SimpleJsonPathContext(
                List(
                  PathName("eventBody"),
                  PathName("advisors")
                )
              ),
              "advisors",
              BroadCast(Map(
                "pNumber" ->
                  SimpleJsonPathContext(List(PathName("eventBody"), PathName("policy"), PathName("policyNumber")))
              )),
              List(
                StraightMappingContext(
                  SimpleJsonPathContext(
                    List(PathName("advisorId"))
                  ),
                  "advisorId",
                  "VARCHAR",
                  Nil,
                  isNull = false,
                  Nil
                ),
                StraightMappingContext(
                  SimpleJsonPathContext(
                    List(PathName("pNumber"))
                  ),
                  "policyNumber",
                  "VARCHAR",
                  Nil,
                  isNull = false,
                  Nil
                ),
                ObjectMappingContext(
                  "foo",
                  BroadCast(Map("someAlias" -> SimpleJsonPathContext(List(PathName("number"), PathName("foo"))))),
                  List(
                    StraightMappingContext(
                      SimpleJsonPathContext(
                        List(PathName("someAlias"))
                      ),
                      "someAliasColumn",
                      "VARCHAR",
                      Nil,
                      isNull = false,
                      Nil
                    )
                  )
                )
              )
            )
          ),
          children = Nil
        )

        val diff = parse(MapperContext.toJSON(actual)).diff(parse(MapperContext.toJSON(expected)))

        assert(actual == expected, diff)

      }
    }

  }

}
