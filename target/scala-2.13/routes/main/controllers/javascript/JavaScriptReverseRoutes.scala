// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/conf/routes
// @DATE:Mon Aug 26 19:45:31 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
    // @LINE:15
    def rootLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.rootLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rootLogin"})
        }
      """
    )
  
    // @LINE:10
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
        }
      """
    )
  
    // @LINE:13
    def createRoom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createRoom",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createRoom"})
        }
      """
    )
  
    // @LINE:17
    def rootSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.rootSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rootSignUp"})
        }
      """
    )
  
    // @LINE:14
    def roomCreate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.roomCreate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "roomCreate"})
        }
      """
    )
  
    // @LINE:11
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.message",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "board" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
          }
        
        }
      """
    )
  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:16
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
