
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
            """),format.raw/*15.13*/("""</header>
        

        <article>
            <div>
            """),_display_(/*20.14*/content),format.raw/*20.21*/("""
            """),format.raw/*21.13*/("""</div>
        </article>
        <footer>
            <p>"""),_display_(/*24.17*/footer),format.raw/*24.23*/("""</p>
        </footer>

      <script src=""""),_display_(/*27.21*/routes/*27.27*/.Assets.versioned("javascripts/main.js")),format.raw/*27.67*/("""" type="text/javascript"></script>
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
                  DATE: 2019-08-19T13:56:37.191
                  SOURCE: C:/Users/admin/Bulletinboard/app/views/main.scala.html
                  HASH: 0b591142d88c01a136d836c193476a811ee93a91
                  MATRIX: 747->1|904->63|934->67|1016->175|1052->185|1086->193|1111->198|1200->261|1214->267|1276->308|1364->370|1378->376|1438->415|1535->485|1562->491|1604->505|1705->579|1733->586|1775->600|1864->662|1891->668|1965->715|1980->721|2041->761
                  LINES: 21->1|26->1|28->3|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|39->14|39->14|40->15|45->20|45->20|46->21|49->24|49->24|52->27|52->27|52->27
                  -- GENERATED --
              */
          