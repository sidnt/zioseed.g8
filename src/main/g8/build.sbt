import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.0.1"
// ThisBuild / organization     := "com.example"
// ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++= Seq(
      zio
    )
  )
