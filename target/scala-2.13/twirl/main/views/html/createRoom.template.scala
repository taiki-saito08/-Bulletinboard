
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

object createRoom extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("部屋作成","掲示板作成画面","copyright 2019.")/*3.42*/ {_display_(Seq[Any](format.raw/*3.44*/("""
    """),format.raw/*4.5*/("""<form action="/roomCreate" method="POST">
        <table border="1">
            <tr>
                <td>ルーム名</td><td><input type="text" name="roomName"></td>
            </tr>
            
            <tr>
                <td colspan="2"><input type="submit"></td>
            </tr>
        </table>
    </form>
    """),_display_(/*15.6*/message),format.raw/*15.13*/("""
    """),format.raw/*16.5*/("""<a href="/">topへ</a>
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
                  DATE: 2019-08-19T13:56:37.172
                  SOURCE: C:/Users/admin/Bulletinboard/app/views/createRoom.scala.html
                  HASH: 0e46a78db3dcddcaa16e671ff8c90bb267fdf711
                  MATRIX: 734->1|845->17|875->22|923->62|962->64|994->70|1350->400|1378->407|1411->413
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|40->15|40->15|41->16
                  -- GENERATED --
              */
          