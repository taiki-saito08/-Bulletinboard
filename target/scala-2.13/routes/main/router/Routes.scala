// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/conf/routes
// @DATE:Mon Aug 26 19:45:31 JST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  HomeController_1: controllers.HomeController,
  // @LINE:21
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_1: controllers.HomeController,
    // @LINE:21
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.HomeController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """board""", """controllers.HomeController.message(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """board""", """controllers.HomeController.message(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createRoom""", """controllers.HomeController.createRoom()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """roomCreate""", """controllers.HomeController.roomCreate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rootLogin""", """controllers.HomeController.rootLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rootSignUp""", """controllers.HomeController.rootSignUp()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.HomeController.signUp()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_create1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_HomeController_create1_invoker = createInvoker(
    HomeController_1.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Nil,
      "POST",
      this.prefix + """create""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("board")))
  )
  private[this] lazy val controllers_HomeController_message2_invoker = createInvoker(
    HomeController_1.message(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "message",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """board""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_message3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("board")))
  )
  private[this] lazy val controllers_HomeController_message3_invoker = createInvoker(
    HomeController_1.message(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "message",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """board""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_createRoom4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createRoom")))
  )
  private[this] lazy val controllers_HomeController_createRoom4_invoker = createInvoker(
    HomeController_1.createRoom(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createRoom",
      Nil,
      "GET",
      this.prefix + """createRoom""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_roomCreate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roomCreate")))
  )
  private[this] lazy val controllers_HomeController_roomCreate5_invoker = createInvoker(
    HomeController_1.roomCreate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "roomCreate",
      Nil,
      "POST",
      this.prefix + """roomCreate""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_rootLogin6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rootLogin")))
  )
  private[this] lazy val controllers_HomeController_rootLogin6_invoker = createInvoker(
    HomeController_1.rootLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "rootLogin",
      Nil,
      "GET",
      this.prefix + """rootLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_login7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login7_invoker = createInvoker(
    HomeController_1.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_rootSignUp8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rootSignUp")))
  )
  private[this] lazy val controllers_HomeController_rootSignUp8_invoker = createInvoker(
    HomeController_1.rootSignUp(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "rootSignUp",
      Nil,
      "GET",
      this.prefix + """rootSignUp""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_signUp9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_HomeController_signUp9_invoker = createInvoker(
    HomeController_1.signUp(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signUp",
      Nil,
      "POST",
      this.prefix + """signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:10
    case controllers_HomeController_create1_route(params@_) =>
      call { 
        controllers_HomeController_create1_invoker.call(HomeController_1.create())
      }
  
    // @LINE:11
    case controllers_HomeController_message2_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_HomeController_message2_invoker.call(HomeController_1.message(id))
      }
  
    // @LINE:12
    case controllers_HomeController_message3_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_HomeController_message3_invoker.call(HomeController_1.message(id))
      }
  
    // @LINE:13
    case controllers_HomeController_createRoom4_route(params@_) =>
      call { 
        controllers_HomeController_createRoom4_invoker.call(HomeController_1.createRoom())
      }
  
    // @LINE:14
    case controllers_HomeController_roomCreate5_route(params@_) =>
      call { 
        controllers_HomeController_roomCreate5_invoker.call(HomeController_1.roomCreate())
      }
  
    // @LINE:15
    case controllers_HomeController_rootLogin6_route(params@_) =>
      call { 
        controllers_HomeController_rootLogin6_invoker.call(HomeController_1.rootLogin())
      }
  
    // @LINE:16
    case controllers_HomeController_login7_route(params@_) =>
      call { 
        controllers_HomeController_login7_invoker.call(HomeController_1.login())
      }
  
    // @LINE:17
    case controllers_HomeController_rootSignUp8_route(params@_) =>
      call { 
        controllers_HomeController_rootSignUp8_invoker.call(HomeController_1.rootSignUp())
      }
  
    // @LINE:18
    case controllers_HomeController_signUp9_route(params@_) =>
      call { 
        controllers_HomeController_signUp9_invoker.call(HomeController_1.signUp())
      }
  
    // @LINE:21
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
