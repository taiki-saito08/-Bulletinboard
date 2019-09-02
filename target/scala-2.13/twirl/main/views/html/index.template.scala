
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[java.util.ArrayList[Room],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(rooms:java.util.ArrayList[Room],msg:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.46*/("""

"""),_display_(/*4.2*/main("TOP","掲示板一覧","copyright 2019.")/*4.39*/ {_display_(Seq[Any](format.raw/*4.41*/("""
    """),format.raw/*5.5*/("""<h1>msg</h1>
    """),_display_(/*6.6*/for(room <- rooms) yield /*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
        """),format.raw/*7.9*/("""<table>
            <tr>
                <td><a href='/board?id="""),_display_(/*9.41*/room/*9.45*/.id),format.raw/*9.48*/("""'>"""),_display_(/*9.51*/room/*9.55*/.name),format.raw/*9.60*/("""</a></td>
                <td>"""),_display_(/*10.22*/room/*10.26*/.createDate),format.raw/*10.37*/(""" """),format.raw/*10.38*/("""作成</td>
            </tr>
        </table>
    """)))}),format.raw/*13.6*/("""
        

    """),format.raw/*16.5*/("""<a href="/createRoom">部屋を作る</a>
        
  
""")))}))
      }
    }
  }

  def render(rooms:java.util.ArrayList[Room],msg:String): play.twirl.api.HtmlFormat.Appendable = apply(rooms,msg)

  def f:((java.util.ArrayList[Room],String) => play.twirl.api.HtmlFormat.Appendable) = (rooms,msg) => apply(rooms,msg)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-30T19:40:06.353
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/index.scala.html
                  HASH: e6e86450e77b6bfef0889579bb2f3a38d9c64da9
                  MATRIX: 755->7|894->51|924->56|969->93|1008->95|1040->101|1084->120|1117->138|1155->139|1191->149|1284->216|1296->220|1319->223|1348->226|1360->230|1385->235|1444->267|1457->271|1489->282|1518->283|1599->334|1644->352
                  LINES: 21->2|26->2|28->4|28->4|28->4|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|37->13|40->16
                  -- GENERATED --
              */
          