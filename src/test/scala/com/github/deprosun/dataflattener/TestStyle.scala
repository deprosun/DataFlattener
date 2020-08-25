package com.github.deprosun.dataflattener

import org.json4s.DefaultFormats
import org.scalatest.FunSpec

class TestStyle extends FunSpec {
  implicit val formats = DefaultFormats // Brings in default date formats etc.


  val sourceJSON: String = """{
    |	"donutUniqueId": "0001",
    |	"type": "donut",
    |	"name": "Cake",
    |	"ppu": 0.55,
    |	"batters": {
    |			"batter": [
    |					{ "id": "1001", "type": "Regular" },
    |					{ "id": "1002", "type": "Chocolate" },
    |					{ "id": "1003", "type": "Blueberry" },
    |					{ "id": "1004", "type": "Devil's Food" }
    |				]
    |		},
    |	"topping":
    |		[
    |			{ "id": "5001", "type": "None" },
    |			{ "id": "5002", "type": "Glazed" },
    |			{ "id": "5005", "type": "Sugar" },
    |			{ "id": "5007", "type": "Powdered Sugar" },
    |			{ "id": "5006", "type": "Chocolate with Sprinkles" },
    |			{ "id": "5003", "type": "Chocolate" },
    |			{ "id": "5004", "type": "Maple" }
    |		]
    |}""".stripMargin

}
