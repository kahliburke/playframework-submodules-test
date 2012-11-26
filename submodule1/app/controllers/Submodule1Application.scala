package controllers

import play.api._
import play.api.mvc._

object Submodule1Application extends Controller {
  
  def route = Action {
    Ok("route in submodule1")
  }
  
}