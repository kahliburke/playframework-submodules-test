import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "core"
  val appVersion = "1.0-SNAPSHOT"

  // Bringing in the libraries these ways will work for the submodules, but the core routes hang?!
  val appDependencies = Seq(
    // Add your project dependencies here,
    //"submodule2" %% "submodule2" % "1.0-SNAPSHOT",
    "submodule1" %% "submodule1" % "1.0-SNAPSHOT")


  // If I comment out the submodules above and bring in the submodule from underneath the modules directory (SBT constrains them to be in a subdir)
  // then all the routes work.
  //val sub1 = play.Project("sub1", appVersion, Nil, path=file("modules/submodule1"))
  val main = play.Project(appName, appVersion, appDependencies).settings( // Add your own project settings here      
  )//.dependsOn(sub1)

}
