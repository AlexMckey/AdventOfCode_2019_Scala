ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.AlexMckey"

lazy val AOC2019 = (project in file("."))
  .settings(
    name := "AOC2019"
  )