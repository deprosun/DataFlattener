import Library._

name := "DataFlattener"

version := "0.1"

scalaVersion := "2.11.11"

organization := "com.deprosun.dataflattener"

resolvers ++= repositories

libraryDependencies ++= scalaTestDep ++ antlrDep ++ spark

// POM settings for Sonatype
organization := "com.deprosun"
homepage := Some(url("https://github.com/deprosun/DataFlattener"))
scmInfo := Some(ScmInfo(url("https://github.com/deprosun/DataFlattener"),
"https://github.com/deprosun/DataFlattener.git"))
developers := List(Developer("deprosun",
  "deprosun",
  "karang90@gmail.com",
  url("https://github.com/deprosun")))
licenses += ("MIT", url("https://opensource.org/licenses/MIT"))
publishMavenStyle := true

// Add sonatype repository settings
publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)