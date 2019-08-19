// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/admin/Bulletinboard/conf/routes
// @DATE:Mon Aug 19 13:56:36 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:13
    def createRoom(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createRoom")
    }
  
    // @LINE:14
    def roomCreate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "roomCreate")
    }
  
    // @LINE:11
    def message(id:Int): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:11
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "board" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
      
      }
    
    }
  
    // @LINE:8
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}