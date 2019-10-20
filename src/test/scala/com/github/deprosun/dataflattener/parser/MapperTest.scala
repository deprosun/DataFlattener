package com.github.deprosun.dataflattener.parser

import com.deprosun.dataflattener.TestStyle
import org.apache.spark.sql.DataFrame

class MapperTest extends TestStyle {

  describe("A mapper") {

    describe("when the configuration is valid") {

      val config =

        """
          |SOURCE tableA (
          | MAPPING (
          |   a = b VARCHAR (255) NOT NULL (PK)
          | )
          |
          | SOURCE tableB FROM c (
          |   MAPPING (
          |     d = e INT NOT NULL (PK ConcatBy[,] Reference[TableX])
          |   )
          | )
          |)
        """.stripMargin

      it("should produce a valid mapper object") {

        val actual = Mapper.getMapper(config)

        val expected = Mapper(
          tableName = "tableA",
          fromField = Seq(),
          mappings = Seq(
            Mapping(
              path = Seq(PathName("a")),
              column = "b",
              dataType = "VARCHAR",
              precision = List("255"),
              isNull = false,
              attr = Seq(PK_FK("PK"))
            )
          ),
          children = Seq(
            Mapper(
              tableName = "tableB",
              fromField = Seq(PathName("c")),
              mappings = Seq(
                Mapping(
                  path = Seq(PathName("d")),
                  column = "e",
                  dataType = "INT",
                  precision = Nil,
                  isNull = false,
                  attr = Seq(PK_FK("PK"), Separator(","), Reference("TableX"))
                )
              )
            )
          )
        )

        assert(actual == expected)

      }
    }

    describe("when configuration has syntax issues") {

      val config =
        """ ,cmx c,v
          |SOURCE tableA (
          | MAPPING (
          |   a = b VARCHAdfkghver fR (255) NOT NULL (PK)
          | )
          |
          | SOURCE tableB FROM c (
          |   MAPPING (
          |     d = e INT NOT NULL (PK ConcatBy[,] Reference[TableX])
          |   )
          | )
          |)
        """.stripMargin

      it("should throw an error") {
        intercept[Exception](Mapper.getMapper(config))
      }
    }

  }

}
