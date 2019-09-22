import sbt._

object Library {

  val sparkVersion = "2.3.0"


  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
  val scalaTestDep: Seq[ModuleID] = Seq(scalaTest % Test)

  val antlrDep: Seq[ModuleID] = Seq(
    "org.antlr" % "antlr4-runtime" % "4.7",
    "org.antlr" % "antlr4-maven-plugin" % "4.7"
  )

  // If you are developing Cobalt SDK locally.
  val repositories: Seq[MavenRepository] = Seq(
    "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
    "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
    "spray repo" at "http://repo.spray.io",
  )

  val spark: Seq[ModuleID] = Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion
  )
}
