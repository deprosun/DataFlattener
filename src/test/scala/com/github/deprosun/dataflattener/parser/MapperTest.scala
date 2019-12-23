package com.github.deprosun.dataflattener.parser

import com.deprosun.dataflattener.TestStyle

class MapperTest extends TestStyle {

  describe("A mapper") {

    describe("when the configuration is valid") {

      val config =

        """
          |
          |TABLE dim_rules_result FROM rulesResult (
          |    MAPPING (
          |        gateTypeId                                               = gateId                                VARCHAR (100)   NOT NULL
          |        gateTypeDescription                                      = gateDescription                       VARCHAR (100)   NOT NULL
          |        TO_UUID(gateResultValue)                                 = gateResult                            VARCHAR (100)   NOT NULL
          |        c.dim_suitability_case_product_natural_uuid              = dim_suitability_case_natural_uuid     UUID            NOT NULL PK FK Reference(edw_suitability.dim_suitabiltity_case_detail,dim_suitability_case_natural_uuid)
          |        explode(suitabilityRuleResults) (
          |            explode(suitabilityRuleResults) (
          |                suitabilityRuleId                                    = ruleId                                VARCHAR (100)   NOT NULL
          |                ruleResultValue                                      = ruleResult                            VARCHAR (100)   NOT NULL
          |            )
          |        )
          |    )
          |)
          |
          |
        """.stripMargin

      it("should produce a valid mapper object") {

        val actual = MapperContext.getMapper(config)

        println(actual)


      }
    }

  }

}
