import Library._

name := "DataFlattener"

version := "1.0"

scalaVersion := "2.11.11"

resolvers ++= repositories

libraryDependencies ++=
  scalaTestDep ++
    antlrDep

organization := "com.github.deprosun"

homepage := Some(url("https://github.com/deprosun/DataFlattener"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/deprosun/DataFlattener"),
    "https://github.com/deprosun/DataFlattener.git"
  )
)

developers := List(
  Developer(
    "deprosun",
    "Karan Gupta",
    "karang90@gmail.com",
    url("https://github.com/deprosun")
  )
)

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

publishMavenStyle := true


publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
