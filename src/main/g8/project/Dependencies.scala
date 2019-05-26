import sbt._

object Dependencies {

  lazy val scalaTestVersion = "3.0.5"
  lazy val zioVersion = "1.0-RC4"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion
  lazy val zio = "org.scalaz" %% "scalaz-zio" % zioVersion
  
}
