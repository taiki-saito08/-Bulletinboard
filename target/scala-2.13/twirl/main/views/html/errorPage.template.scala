
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

object errorPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("掲示板","掲示板","copyright 2019.")/*1.37*/ {_display_(Seq[Any](format.raw/*1.39*/("""
    """),format.raw/*2.5*/("""<h1>エラーが発生しました</h1>
        
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-30T19:40:06.347
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/errorPage.scala.html
                  HASH: 5b9137a02fe1802ddfe1995640c42799d8bb4d5d
                  MATRIX: 815->1|858->36|897->38|929->44
                  LINES: 26->1|26->1|26->1|27->2
                  -- GENERATED --
              */
          