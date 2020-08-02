import Library._

name := "DataFlattener"

version := "4.3"

scalaVersion := "2.11.11"

resolvers ++= repositories

libraryDependencies ++=
  scalaTestDep :+
    antlrDep :+ json4s

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
