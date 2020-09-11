import sbt._

object Dependencies {

  object Versions {
    lazy val zioV = "1.0.1"
  }; import Versions._

  lazy val zio = "dev.zio" %% "zio" % zioV
  
}
