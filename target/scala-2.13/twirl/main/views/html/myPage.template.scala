
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object myPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/main("新規登録","新規登録画面","copyright 2019.")/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""
    """),format.raw/*4.5*/("""ようこそ！
    """),_display_(/*5.6*/message/*5.13*/.name),format.raw/*5.18*/("""　さん!
    <a href="/">topへ</a>
""")))}))
      }
    }
  }

  def render(message:User): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-30T16:52:05.503
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/myPage.scala.html
                  HASH: c157b5b7ff891cc065317b48fa07de6b731a38e5
                  MATRIX: 728->1|837->15|867->20|914->59|953->61|985->67|1022->79|1037->86|1062->91
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5|30->5|30->5
                  -- GENERATED --
              */
          