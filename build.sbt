name := "packman-project"

version := "0.1"

scalaVersion := "2.12.14"

lazy val root = (project in file("."))
  .enablePlugins(PackmanPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "ru.sberbank.xops.packman" % "packman" % "0.1-SNAPSHOT"
    )
  )