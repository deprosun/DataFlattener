# DataFlattener

![Scala Test](https://github.com/deprosun/DataFlattener/workflows/Scala%20Test/badge.svg?branch=master) ![Version](https://github.com/deprosun/DataFlattener/workflows/Bump%20version/badge.svg)

This project allows us to transform a JSON record into one or more records using a simple mapping configuration DLS called "mapper" file. This project provides the parser for files with `.mapper` extension.  Following is the data flow - given a source JSON and mapping configuration, *Data Flattener* produces a list of `Table` object records.

![readme](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuTBGqbJGrRLJK0hEBorAJbNm2lRtKmXAJSulIb52IFec5XIa5Yauv-UbPQOhSQ7n8MfS4aiI5Tno4ajAKlDIYu2Ai9Y8GoMQ04HLI69IJgg28Nvf8_pInlYbJN19wocWGVpc-2bnEQJcfG334m00 "")

* `Table`: `Table` is a scala case class that holds `tableName` for name of the table and `rows` for list of `Row` objects.
```scala
case class Table(tableName: String, rows: List[Row])
```
* `Row` : `Row` contains a list `Column`.
```scala
case class Row(columns: List[Column])
```

* `Column` : `Column` contains the name of the column and value associated with it.

```scala
case class Column(mappingContext: StraightMappingContext, value: JValue])
```

## Inspiration
Before we aggregate a single record, we often times have to apply some transformation logic of following types:
* normalize/clean, 
* encrypt some field (PII or PHI security concerns), 
* shrink the size of the record by only selecting fields required downstream, or
* we need to "flatten" the JSON structure into relational tables so that they can be inserted into a database downstream.

All of these transformations can be _communicated_ using some sort of language mechanism.

## Example 1
Create a FoodDetail table such `description` field is lower cased and rename the field name `fdcId` to `id`.

```JSON
{
    "fdcId": 563346,
    "description": "BAKING POWDER"
}
```

```scala
Table FoodDetail (
    Mapping (
        fdcId                 = id             INT          NOT NULL             
        lower(description)    = description    VARCHAR      NULL
    )
)
```

In the above configuration language we have defined the table called `FoodDetail` which contains two columns:
1. `id` of type `INT`, which gets the value from `fdcId` field in JSON. This field cannot be `null`.
2. `description` of type `VARCHAR` which gets the value from applying a function `lower` on `description` field in JSON. This field can be `null`.

## Example 1 Output

![readme](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuTBGqbJGrRLJK0hEBorAJbNm2lRtKmXAJSulIb52IFec5XIa5Yauv-UbPQOhSQ7n8MfS4aiI5Tno4ajAKlDIYu2Ai9Y8GoMQ04HLI69IJgg2Mtv-YajgIM9cZXANGsfU2j3D0000)

## Example 2
	
I'd like to create two tables - one table called `Donut` and a child table called `Batter`. `Donut` table will have two columns `id` and `donutName` where the value is retrieved from `donutUniqueId` and `name` fields in the JSON, respectively.  The child table `Batter` will be created from `batters.batter` array field in the JSON. `Batter` table will contain columns `id`, and `batterType` where values come from each element in `batters.batter`.  We also want to add `donutId` so that the table has a foreign key referencing the parent id.  Therefore, in this case the value of `donutId` should be `0001`.

```JSON
{
	"donutUniqueId": "0001",
	"type": "donut",
	"name": "Cake",
	"ppu": 0.55,
	"batters": {
			"batter": [
					{ "id": "1001", "type": "Regular" },
					{ "id": "1002", "type": "Chocolate" },
					{ "id": "1003", "type": "Blueberry" },
					{ "id": "1004", "type": "Devil's Food" }
				]
		},
	"topping":
		[
			{ "id": "5001", "type": "None" },
			{ "id": "5002", "type": "Glazed" },
			{ "id": "5005", "type": "Sugar" },
			{ "id": "5007", "type": "Powdered Sugar" },
			{ "id": "5006", "type": "Chocolate with Sprinkles" },
			{ "id": "5003", "type": "Chocolate" },
			{ "id": "5004", "type": "Maple" }
		]
}
```

```scala
TABLE Donut (

	MAPPING (
		donutUniqueId      = donutUID   VARCHAR    NOT NULL  PK
		name               = donutName  VARCHAR    NOT NULL
	)

	TABLE Batter FROM batters.batter WITH (donutUniqueId = donutId) (
		MAPPING (
			id        = batterUID      		VARCHAR    NOT NULL  PK
			donutId   = donutParentId  		VARCHAR    NOT NULL  FK
			type      = batterType     		VARCHAR    NOT NULL
		)
	)
)
```

```scala
/* 
--Parent/Child Table--

you can create child tables simply by adding another TABLE inside the parent TABLE clause by telling which field you want to create rows FROM.  Sometimes we need to add extra information (or rather need extra values) needed to generate child rows.  We depict such language with `WITH (donutUniqueId = donutId)` where `donutUniqueId` is a field key that evaluate the value of it in the parent JSON and `donutId` is a variable name holding the value for it.  This value is then accessed using the variable you defined, here variable is `donutId`.  As we can the second mapping using `donutId` as a mapping rule for column name `donutParentId`. 

--Why is it not "batters.batter.id"?--

when we say "FROM batters.batter", in our mapping we use the array's element's JSON schema as the root for each row.  In other words, that is why you don't see `batters.batter.id` - simply `id` will result in access the value.
*/
```

## Example 2 Output

![readme-1](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuTBGqbJGrRLJK0hEBorAJbNm2lRtKmXAJSulIb52IFec5XIa5Yauv-UbPQOhSQ7n8MfS4aiI5Tno4ajAKlDIYu2Ai9Y8GoMQ04HLI69IJgg2ItvUQGb-9KuWGQ0n3gbvAK0l0G00)


In this case, `Donut` table will yield 1 row with `id` = "0001".  Table `Batter` will yield 4 rows referring to "0001" in `donutId` column

```log

//Donut Table
| id   | donutName |
|------|-----------|
| 0001 | Cake      |


//Batter Table
| id   | donutId | batterType   |
|------|---------|--------------|
| 1001 | 0001    | Regular      |
| 1002 | 0001    | Chocolate    |
| 1003 | 0001    | Blueberry    |
| 1004 | 0001    | Devil's Food |
```

![readme-2](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuSfFoafDBb5moSyhBL6evb80WimK1Ik5CCSWPm_78B102aZIBp4t5KcybWkcrIcnf2Ir2AzUpnHKmIImbf3A0ZGJ8QxGrQs66ihba9gN0dGb0000)

## Example 3
I'd like to create a Table `Topping` from the `topping` field.  Moreover, I'd like to create a "flat" topping and donut info where each row contains a unique topping along side the name of the donut that topping is used on.  The table should end up looking like:

![readme-3](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuSfFoafDBb48oIyeoCnBLwZcKW22p1G5AuKmno1d3ySW1Gr30mDDi71UOcugLecK_BpI4Z-WB5oIgvRB8JKl1MW30000)

```log
//Topping Table
| id   | name                     | donutName |
|------|--------------------------|-----------|
| 5001 | None                     | Cake      |
| 5002 | Glazed                   | Cake      |
| 5005 | Sugar                    | Cake      |
| 5007 | Powdered Sugar           | Cake      |
| 5006 | Chocolate with Sprinkles | Cake      |
| 5003 | Chocolate                | Cake      |
| 5004 | Maple                    | Cake      |
```

```JSON
{
	"donutUniqueId": "0001",
	"type": "donut",
	"name": "Cake",
	"ppu": 0.55,
	"batters": {
			"batter": [
					{ "id": "1001", "type": "Regular" },
					{ "id": "1002", "type": "Chocolate" },
					{ "id": "1003", "type": "Blueberry" },
					{ "id": "1004", "type": "Devil's Food" }
				]
		},
	"topping": [
			{ "id": "5001", "type": "None" },
			{ "id": "5002", "type": "Glazed" },
			{ "id": "5005", "type": "Sugar" },
			{ "id": "5007", "type": "Powdered Sugar" },
			{ "id": "5006", "type": "Chocolate with Sprinkles" },
			{ "id": "5003", "type": "Chocolate" },
			{ "id": "5004", "type": "Maple" }
		]
}
```

```scala
TABLE Topping (
    MAPPING (
        type              = donutName           VARCHAR   NOT NULL
        explode(topping) (
            id              = id           VARCHAR (100)   NOT NULL
            type            = toppingName  VARCHAR (101)   NOT NULL
        )
    )
)
```

## Example 3 Output

![readme-4](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuTBGqbJGrRLJK0hEBorAJbNm2lRtKmXAJSulIb52IFec5XIa5Yauv-UbPQOhSQ7n8MfS4aiI5Tno4ajAKlDIYu2Ai9Y8GoMQ04HLI69IJgf2I7v1GMOUq4w7rBmKe8C1 "readme-4")

Let's look at `explode`. So far we have only seen 1 row getting created in the above example for the parent table.  Sometimes,  there are requirements, like above, where 1 row actually yield multiple.  `explode` tells DataFlattener exactly just that.  It says:
> _the total number of rows yielded in Topping table will be the number of rows in `topping` fields._

Any mappings defined outside of `explode` clause, simply "get added" to each row came by "exploding" the `topping` field.  That is why you see "Cake" multiple times in the final output. 

```log
//Topping Table
| id   | name                     | donutName |
|------|--------------------------|-----------|
| 5001 | None                     | Cake      |
| 5002 | Glazed                   | Cake      |
| 5005 | Sugar                    | Cake      |
| 5007 | Powdered Sugar           | Cake      |
| 5006 | Chocolate with Sprinkles | Cake      |
| 5003 | Chocolate                | Cake      |
| 5004 | Maple                    | Cake      |
```

## Let's try it out!
There is nothing better than the actual demo to learn how DataFlattener behaves in the actual environment.  Since this is JVM based library, you can add the code dependency based on your language from [maven](https://mvnrepository.com/artifact/com.github.deprosun/dataflattener_2.11/). Use version `6.0`.  DataFlattener is leveraging Scala as the language so we will perform a demo using `sbt` REPL - specifically, `sbt console`.  If you do not want to use SBT, you can simply write this piece of code in a test!

1. Go ahead and start up a `sbt shell` from the project root directory.

```scala
$ sbt console
scala> 
```

2. Let's create our source JSON from above.  Imports some stuff and create your sample json

```scala
import com.github.deprosun.dataflattener.Transformer
import com.github.deprosun.dataflattener.model.MapperContext
import org.json4s
import org.json4s.JValue
import org.json4s.JsonAST.{JNothing, JNull, JString}
import org.json4s.native.JsonMethods._
import org.slf4j.{Logger, LoggerFactory}

val sourceJSON: String =
  """{
    	"donutUniqueId": "0001",
    	"type": "donut",
    	"name": "Cake",
    	"ppu": 0.55,
    	"batters": {
    			"batter": [
    					{ "id": "1001", "type": "Regular" },
    					{ "id": "1002", "type": "Chocolate" },
    					{ "id": "1003", "type": "Blueberry" },
    					{ "id": "1004", "type": "Devil's Food" }
    				]
    		},
    	"topping":
    		[
    			{ "id": "5001", "type": "None" },
    			{ "id": "5002", "type": "Glazed" },
    			{ "id": "5005", "type": "Sugar" },
    			{ "id": "5007", "type": "Powdered Sugar" },
    			{ "id": "5006", "type": "Chocolate with Sprinkles" },
    			{ "id": "5003", "type": "Chocolate" },
    			{ "id": "5004", "type": "Maple" }
    		]
    }""".stripMargin
```

3. We will be performing Example 2.  Lets create our mapper config:
```scala
val mapperConfig =
  """
    TABLE Donut (
    
        MAPPING (
            donutUniqueId      = donutUID   VARCHAR    NOT NULL  PK
            name               = donutName  VARCHAR    NOT NULL
        )
    
        TABLE Batter FROM batters.batter (
            MAPPING (
                		id        = batterUID    VARCHAR    NOT NULL  PK
                        donutId   = donutId      VARCHAR    NOT NULL  FK
                        type      = batterType   VARCHAR    NOT NULL
            )
        )
    )
  """.stripMargin
```

4. Since this project also provides a function to read the `mapper` configuration, let's use it. import `import com.github.deprosun.dataflattener.model.MapperContext`.  Then create a mapper object using `mapperConfig`.

```scala
val mappers: List[MapperContext] = MapperContext.getMappers(mapperConfig) //get mapper objects that holds the above configuration information
```

5. We use [Json4s](https://github.com/json4s/json4s) for parsing JSON string into an object called `JValue` from Json4s for parsing.  Let's create `JValue` object from our source JSON.

```scala
val record: JValue = parse(sourceJSON)
```

6. When we define a mapper we also define a set of "business" rules and function that are sometimes referred to as UDF in sql world. Lets defined (or rather implements) these rules so that transformation only adheres only _businesse's_ definition of transformation.  For now, please ignore the variables: `logger`, `toLowerCase`, and `udfMap`.  We will go over them later.  Simply copy and paste the following and create your transformer:

```scala
import com.github.deprosun.dataflattener.Transformer
import org.slf4j.{Logger, LoggerFactory}

val transformer: Transformer = new Transformer {
  override val logger: Logger = LoggerFactory.getLogger("demo")

  //convert a string to lowercase
  def toLowerCase(json: List[JValue]): JValue = {
    json match {
      case (JNothing | JNull) :: Nil => JNothing //if the value as null, then just resort to null
      case JString(x) :: Nil => JString(x.toLowerCase) //perform lowercase function
      case (_: JValue) :: xs =>
        throw new RuntimeException("You cannot supply more than 1 argument to function toLowerCase")

    }
  }

  //a set of internal business modification value function
  override val udfMap: Map[String, MapFunc] = Map(
    "toLowerCase" -> toLowerCase
  )
}
```

7. Let run it by executing function `transformer.transform`.  `mapper` is a list of `MapperContext`.

```
val tranformed = mappers map { mapper =>
  transformer.transform(record, mapper)
}
```

8. Oops! We got an error.

```scala
java.lang.IllegalArgumentException: Column donutId cannot be null.
  at com.github.deprosun.dataflattener.Transformer$class.getValueFromStraight(Transformer.scala:67)
  at $anon$1.getValueFromStraight(<console>:34)
```

9. Something went wrong. Hmm, seems like we we mentioned `donutId` as "not null". Also, it is defined to be `FK`.  As per defintion, `donutId` is coming `donutUniqueId` in the mapper configuration.  But if you look at the source json the schema of `batters.batter` does not contain `donutUniqueId` field.  Since the value of this column comes from the parent primary key column, we need to somehow "push" the value down to child table `Batter`.  This is where we use `WITH (x.y = someAlias)`. 

10. Lets look at the new mapper.  Then lets reload it to the same `mapper` object.

```scala
val mapperConfig =
  """
    TABLE Donut (
		
		MAPPING (
			donutUniqueId      = donutUID   VARCHAR    NOT NULL  PK
			name               = donutName  VARCHAR    NOT NULL
		)

		TABLE Batter FROM batters.batter WITH (donutUniqueId = donutId) (
			MAPPING (
				id        = batterUID    	VARCHAR    NOT NULL  PK
				donutId   = donutParentId  	VARCHAR    NOT NULL  FK
				type      = batterType   	VARCHAR    NOT NULL
			)
		)
	)
  """.stripMargin

val mapper: List[MapperContext] = MapperContext.getMappers(mapperConfig)
```

11. Lets run the code again

```scala
// initiate transformation for each mapper/table
mappers foreach { x =>
	//get all the transformed tables
	val tables = transformer.transform(json, x)

	//print each table in json format
	tables foreach { table =>
		println(table.toJsonString)
	}
}
```

12. Result!  Each line shows you a json representation of the table.
```scala
{"Donut":[{"donutUID":"0001","donutName":"Cake"}]}
{"Batter":[{"batterUID":"1001","donutParentId":"0001","batterType":"Regular"},{"batterUID":"1002","donutParentId":"0001","batterType":"Chocolate"},{"batterUID":"1003","donutParentId":"0001","batterType":"Blueberry"},{"batterUID":"1004","donutParentId":"0001","batterType":"Devil's Food"}]}
```