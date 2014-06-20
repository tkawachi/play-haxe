sbtPlugin := true

name := "play-haxe"

organization := "com.github.tkawachi"

version := "0.0.1"

scalaVersion := "2.10.3"

scalacOptions := Seq("-deprecation", "-unchecked")

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.0")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
