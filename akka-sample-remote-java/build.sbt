organization := "com.typesafe.akka.samples"
name := "akka-sample-remote-java"

scalaVersion := "2.12.1"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.14",
  "com.typesafe.akka" %% "akka-remote" % "2.4.14"
)

licenses := Seq(("CC0", url("http://creativecommons.org/publicdomain/zero/1.0")))
