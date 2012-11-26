import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "core"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "submodule2" % "submodule2_2.10" % "1.0-SNAPSHOT",
    "submodule1" % "submodule1_2.10" % "1.0-SNAPSHOT")

  val main = play.Project(appName, appVersion, appDependencies).settings( // Add your own project settings here      
  )

}
