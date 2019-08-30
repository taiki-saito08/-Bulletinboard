
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

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("新規登録","新規登録画面","copyright 2019.")/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""
    """),format.raw/*4.5*/("""<form action="/signUp" method="POST">
        <table border="1">
            <tr>
                <td>NAME</td><td><input type="text" name="roomName"></td>
            </tr>
            <tr>
                <td>MAIL</td><td><input type="mail" name="mail"></td>
            </tr>
            <tr>
                <td>PASS</td><td><input type="password" name="pass"></td>
            </tr>
            <tr>
                <td>COMMENT</td><td><input type="text" name="comment"></td>
            </tr>
            
            <tr>
                <td colspan="2"><input type="submit"></td>
            </tr>
        </table>
    </form>
    """),_display_(/*24.6*/message),format.raw/*24.13*/("""
    """),format.raw/*25.5*/("""<a href="/">topへ</a>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-26T19:18:29.270
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/signUp.scala.html
                  HASH: 06ef6ba45adce0919cd9d3bfcc2d51def9c5da46
                  MATRIX: 730->1|841->17|871->22|918->61|957->63|989->69|1675->729|1703->736|1736->742
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|49->24|49->24|50->25
                  -- GENERATED --
              */
          