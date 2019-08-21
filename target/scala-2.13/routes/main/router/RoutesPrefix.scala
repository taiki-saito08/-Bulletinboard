// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/conf/routes
// @DATE:Wed Aug 21 19:28:03 JST 2019


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
