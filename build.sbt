import sbt._
import Library._

name := "DataFlattener"

version := "8.0"

scalaVersion := "2.11.11"

resolvers ++= repositories

libraryDependencies ++=
  scalaTestDep :+
    antlr :+ json4s :+ slf4j :+ vaultTest

homepage := Some(url("https://github.com/deprosun/DataFlattener"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/deprosun/DataFlattener"),
    "https://github.com/deprosun/DataFlattener.git" //skdjhsd
  )
)

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))