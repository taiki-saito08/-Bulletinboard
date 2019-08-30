
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.ArrayList[Room],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(rooms:java.util.ArrayList[Room]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.35*/("""

"""),_display_(/*4.2*/main("TOP","掲示板一覧","copyright 2019.")/*4.39*/ {_display_(Seq[Any](format.raw/*4.41*/("""
    """),_display_(/*5.6*/for(room <- rooms) yield /*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
        """),format.raw/*6.9*/("""<table>
            <tr>
                <td><a href='/board?id="""),_display_(/*8.41*/room/*8.45*/.id),format.raw/*8.48*/("""'>"""),_display_(/*8.51*/room/*8.55*/.name),format.raw/*8.60*/("""</a></td>
                <td>"""),_display_(/*9.22*/room/*9.26*/.createDate),format.raw/*9.37*/(""" """),format.raw/*9.38*/("""作成</td>
            </tr>
        </table>
    """)))}),format.raw/*12.6*/("""
        

    """),format.raw/*15.5*/("""<a href="/createRoom">部屋を作る</a>
        
  
""")))}))
      }
    }
  }

  def render(rooms:java.util.ArrayList[Room]): play.twirl.api.HtmlFormat.Appendable = apply(rooms)

  def f:((java.util.ArrayList[Room]) => play.twirl.api.HtmlFormat.Appendable) = (rooms) => apply(rooms)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-30T11:34:27.942
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/index.scala.html
                  HASH: 47df23da1e4ae9046977a3f1a884ebbf37a43c91
                  MATRIX: 748->7|876->40|906->45|951->82|990->84|1022->91|1055->109|1093->110|1129->120|1222->187|1234->191|1257->194|1286->197|1298->201|1323->206|1381->238|1393->242|1424->253|1452->254|1533->305|1578->323
                  LINES: 21->2|26->2|28->4|28->4|28->4|29->5|29->5|29->5|30->6|32->8|32->8|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|36->12|39->15
                  -- GENERATED --
              */
          