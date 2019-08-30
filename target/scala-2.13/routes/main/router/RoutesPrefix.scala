// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/conf/routes
// @DATE:Mon Aug 26 19:45:31 JST 2019


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
