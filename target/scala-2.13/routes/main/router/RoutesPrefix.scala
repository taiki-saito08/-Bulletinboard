// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/admin/Bulletinboard/conf/routes
// @DATE:Mon Aug 19 13:56:36 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
