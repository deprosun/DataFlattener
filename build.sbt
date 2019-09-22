import Library._

name := "DataFlattener"

version := "0.1"

scalaVersion := "2.11.11"

organization := "com.deprosun.dataflattener"

resolvers ++= repositories

libraryDependencies ++= scalaTestDep ++ antlrDep ++ spark