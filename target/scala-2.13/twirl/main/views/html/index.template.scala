
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.18*/("""

"""),_display_(/*4.2*/main("TOP","掲示板一覧","copyright 2019.")/*4.39*/ {_display_(Seq[Any](format.raw/*4.41*/("""
    """),format.raw/*5.5*/("""<p>"""),_display_(/*5.9*/Html(message)),format.raw/*5.22*/("""</p>

    <a href="/createRoom">部屋を作る</a>
        
  
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
                  DATE: 2019-08-19T13:56:37.181
                  SOURCE: C:/Users/admin/Bulletinboard/app/views/index.scala.html
                  HASH: 8b3a4d0776bb3191fdc79415a8810aefafe03634
                  MATRIX: 729->7|840->23|870->28|915->65|954->67|986->73|1015->77|1048->90
                  LINES: 21->2|26->2|28->4|28->4|28->4|29->5|29->5|29->5
                  -- GENERATED --
              */
          