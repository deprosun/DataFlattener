package com.github.deprosun.dataflattener

import com.github.deprosun.dataflattener.model.{ExplodeMappingContext, MapFunctionJsonPathContext, MapperContext, PathName, SimpleJsonPathContext, StraightMappingContext}
import org.antlr.v4.runtime.misc.ParseCancellationException

import scala.language.postfixOps

class MapperTest extends TestStyle {

  describe("A mapper") {

    describe("with root table definition with no 'from' field column") {

      val config =

        """
          |
          |TABLE dim_rules_result (
          |    MAPPING (
          |        [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
          |           (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |           (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |           (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
          |        )
          |    )
          |)
          |
          |
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        val expected = MapperContext(
          tableName = "dim_rules_result",
          fromField = None,
          mappings = List(
            ExplodeMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
              copiedKeys = Map(
                "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription")))),
              mappingContext = List(
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

        assert(actual == expected)

      }
    }

    describe("with an explode type mapping") {

      val config =

        """
          |
          |TABLE dim_rules_result FROM rulesResult (
          |  MAPPING (
          |      [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
          |         (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |         (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |         (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
          |      )
          |  )
          |)
          |
          |
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        val expected = MapperContext(
          tableName = "dim_rules_result",
          fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
          mappings = List(
            ExplodeMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
              copiedKeys = Map(
                "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription")))),
              mappingContext = List(
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

        assert(actual == expected)

      }
    }

    describe("with an explode type mapping and straight type mapping as siblings") {

      val config =

        """
          |
          |TABLE dim_rules_result FROM rulesResult (
          |    MAPPING (
          |        (ruleId = suitabilityRuleId)                                VARCHAR (100)   NOT NULL
          |        [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
          |           (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |           (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |           (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
          |        )
          |    )
          |)
          |
          |
        """.stripMargin

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        val expected = MapperContext(
          tableName = "dim_rules_result",
          fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
          mappings = List(
            StraightMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
              desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
              isNull = false, attributes = Nil
            ),
            ExplodeMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
              copiedKeys = Map(
                "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription")))),
              mappingContext = List(
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

        assert(actual == expected)

      }
    }

    describe("with a child table") {

      val config =

        """
          |
          |TABLE dim_rules_result FROM rulesResult (
          |    MAPPING (
          |        (ruleId = suitabilityRuleId)                                VARCHAR (100)   NOT NULL
          |        [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
          |           (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |           (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |           (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
          |        )
          |    )
          |    TABLE childTable FROM someProperty (
          |       MAPPING (
          |           (ruleId = suitabilityRuleId)                                VARCHAR (100)   NOT NULL
          |           [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
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

      it("should be parsable") {

        val actual = MapperContext.getMappers(config) head

        val expected = MapperContext(
          tableName = "dim_rules_result",
          fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
          mappings = List(
            StraightMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
              desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
              isNull = false, attributes = Nil
            ),
            ExplodeMappingContext(
              path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
              copiedKeys = Map(
                "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription")))),
              mappingContext = List(
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
              tableName = "childTable",
              fromField = Some(SimpleJsonPathContext(List(PathName("someProperty")))),
              mappings = List(
                StraightMappingContext(
                  path = SimpleJsonPathContext(List(PathName("suitabilityRuleId"))),
                  desiredColumnName = "ruleId", dataType = "VARCHAR", precision = List("100"),
                  isNull = false, attributes = Nil
                ),
                ExplodeMappingContext(
                  path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
                  copiedKeys = Map(
                    "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                    "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription")))),
                  mappingContext = List(
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

        assert(actual == expected)

      }
    }

    describe("with a child table where user forgot to define 'from' field") {

      val config =

        """
          |
          |TABLE dim_rules_result FROM rulesResult (
          |    MAPPING (
          |        (ruleId = suitabilityRuleId)                                VARCHAR (100)   NOT NULL
          |        [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
          |           (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |           (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |           (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
          |        )
          |    )
          |    TABLE childTable (
          |       MAPPING (
          |           (ruleId = suitabilityRuleId)                                VARCHAR (100)   NOT NULL
          |           [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
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
          |TABLE dim_rules_result FROM rulesResult (
          |    MAPPING (
          |        [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
          |           (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |           (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |           (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
          |        )
          |    )
          |)
          |
          |TABLE anotherTable FROM rulesResult (
          |    MAPPING (
          |        [suitabilityRuleResults] WITH (gateResultValue = gateResultValue) (gateTypeDescription = gateTypeDescription) (
          |           (ruleId = suitabilityRuleId)                        VARCHAR (100)   NOT NULL
          |           (ruleResult = ruleResultValue)                      VARCHAR (101)   NOT NULL
          |           (gateResult = TO_UUID(gateResultValue))             VARCHAR (105)   NOT NULL
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
            tableName = "dim_rules_result",
            fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
            mappings = List(
              ExplodeMappingContext(
                path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
                copiedKeys = Map(
                  "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                  "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription")))),
                mappingContext = List(
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
            tableName = "anotherTable",
            fromField = Some(SimpleJsonPathContext(List(PathName("rulesResult")))),
            mappings = List(
              ExplodeMappingContext(
                path = SimpleJsonPathContext(List(PathName("suitabilityRuleResults"))),
                copiedKeys = Map(
                  "gateResultValue" -> SimpleJsonPathContext(List(PathName("gateResultValue"))),
                  "gateTypeDescription" -> SimpleJsonPathContext(List(PathName("gateTypeDescription")))),
                mappingContext = List(
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

  }

}
