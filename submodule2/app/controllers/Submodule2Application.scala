package controllers

import play.api._
import play.api.mvc._

object Submodule2Application extends Controller {
  
  def route = Action {
    Ok("route in submodule2")
  }
  
}