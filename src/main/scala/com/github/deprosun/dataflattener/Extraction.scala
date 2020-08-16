package com.github.deprosun.dataflattener

import com.bettercloud.vault.VaultConfig
import com.github.deprosun.dataflattener.model.StraightMappingContext
import org.json4s.JsonAST._

trait Extraction {

  val vaultAddress: String
  val vaultToken: String

  lazy val config: VaultConfig = new VaultConfig()
    .address(vaultAddress)
    .token(vaultToken)
    .build()

  // You may choose not to provide a root token initially, if you plan to use
  // the Vault driver to retrieve one programmatically from an auth backend.
  // final VaultConfig config = new VaultConfig().address("http://127.0.0.1:8200").build();

  val VARCHAR = "VARCHAR"
  val CHAR = "CHAR"
  val INT = "INT"
  val LONG = "LONG"
  val FLOAT = "FLOAT"
  val DOUBLE = "DOUBLE"

  val supportedDataTypes: Map[String, JValue => Option[Any]] = Map(
    VARCHAR -> extractVarchar,
    CHAR -> extractVarchar,
    INT -> extractInt,
    LONG -> extractLong,
    FLOAT -> extractFloat,
    DOUBLE -> extractDouble
  )

  val customDataType: Map[String, JValue => Option[Any]]

  /**
    * todo: Add more data type support
    */

  def extractData(json: JValue, mappingContext: StraightMappingContext): Option[Any] = {
    val dataType = mappingContext.dataType

    val allDataTypes = supportedDataTypes ++ customDataType

    allDataTypes.get(dataType.trim.toUpperCase) match {
      case None => throw new UnsupportedOperationException(s"Unknown data type ${dataType.trim.toUpperCase}")
      case Some(func) => func(json)
    }
  }

  def extractVarchar(json: JValue): Option[String] = json match {
    case JNull | JNothing => None
    case JString(s) => Some(s)
    case x => throw new IllegalArgumentException(s"Cannot convert $x to varchar")
  }

  def extractChar(json: JValue): Option[String] = json match {
    case JNull | JNothing => None
    case JString(s) => Some(s)
    case x => throw new IllegalArgumentException(s"Cannot convert $x to char")
  }

  def extractLong(json: JValue): Option[Long] = json match {
    case JNull | JNothing => None
    case JInt(num) => Some(num.toLong)
    case x => throw new IllegalArgumentException(s"Cannot convert $x to Long")
  }

  def extractFloat(json: JValue): Option[Float] = json match {
    case JNull | JNothing => None
    case JInt(num) => Some(num.toFloat)
    case x => throw new IllegalArgumentException(s"Cannot convert $x to Float")
  }

  def extractDouble(json: JValue): Option[Double] = json match {
    case JNull | JNothing => None
    case JDouble(num) => Some(num)
    case x => throw new IllegalArgumentException(s"Cannot convert $x to Double")
  }

  def extractInt(json: JValue): Option[Int] = json match {
    case JNull | JNothing => None
    case JInt(num) => Some(num.toInt)
    case x => throw new IllegalArgumentException(s"Cannot convert $x to Int")
  }

}
