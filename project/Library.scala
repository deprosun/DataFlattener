import sbt._

object Library {

  val antlrVersion = "4.7.2"
  val scalatestVersion = "3.0.1"
  val json4sNativeVersion = "3.2.11"

  val scalaTest = "org.scalatest" %% "scalatest" % scalatestVersion
  val scalaTestDep: Seq[ModuleID] = Seq(scalaTest % Test)

  val antlr: ModuleID = "org.antlr" % "antlr4-runtime" % antlrVersion

  val json4s = "org.json4s" %% "json4s-native" % json4sNativeVersion

  val vault = "com.bettercloud" % "vault-java-driver" % "5.1.0"

  val vaultTest = "com.github.golovnin" % "embedded-vault" % "0.11.1.0" % Test

  val slf4j = "org.slf4j" % "slf4j-api" % "1.7.25"

  // If you are developing Cobalt SDK locally.
  val repositories: Seq[MavenRepository] = Seq(
    //    "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
    "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
    "JCenter" at "https://jcenter.bintray.com/"
    //    "spray repo" at "http://repo.spray.io",
  )
}
