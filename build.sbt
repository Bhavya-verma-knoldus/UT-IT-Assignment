name := "UT-IT-Assignment"

version := "0.1"

scalaVersion := "2.13.4"

lazy val UT = project.in(file("UT"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % Test
  )

lazy val UT_IT = project.in(file("UT-IT"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.3" % Test,
      "org.mockito" %% "mockito-scala" % "1.5.12" % Test
    )
  )

lazy val root = project.in(file(".")).aggregate(UT,UT_IT)