// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/admin/Bulletinboard/conf/routes
// @DATE:Mon Aug 19 13:56:36 JST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  HomeController_1: controllers.HomeController,
  // @LINE:17
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_1: controllers.HomeController,
    // @LINE:17
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

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
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
  
    // @LINE:17
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
