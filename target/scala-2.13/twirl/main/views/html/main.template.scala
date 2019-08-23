
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, header: String, footer: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">

    </head>
    <body>
            <header>
                """),_display_(/*14.18*/header),format.raw/*14.24*/("""
                """),format.raw/*15.17*/("""<a href='/rootLogin'>ログイン</a>
            </header>
        

        <article>
            <div>
            """),_display_(/*21.14*/content),format.raw/*21.21*/("""
            """),format.raw/*22.13*/("""</div>
        </article>
        <footer>
            <p>"""),_display_(/*25.17*/footer),format.raw/*25.23*/("""</p>
        </footer>

      <script src=""""),_display_(/*28.21*/routes/*28.27*/.Assets.versioned("javascripts/main.js")),format.raw/*28.67*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,header:String,footer:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,header,footer)(content)

  def f:((String,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,header,footer) => (content) => apply(title,header,footer)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-23T18:44:14.094
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/main.scala.html
                  HASH: 18486fdc3107a293a51dc1525493df949af156c3
                  MATRIX: 747->1|904->63|934->67|1016->175|1052->185|1086->193|1111->198|1200->261|1214->267|1276->308|1364->370|1378->376|1438->415|1535->485|1562->491|1608->509|1752->626|1780->633|1822->647|1911->709|1938->715|2012->762|2027->768|2088->808
                  LINES: 21->1|26->1|28->3|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|39->14|39->14|40->15|46->21|46->21|47->22|50->25|50->25|53->28|53->28|53->28
                  -- GENERATED --
              */
          