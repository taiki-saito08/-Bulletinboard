
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

object board extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Form[CommentForm.Data],String,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String,form:Form[CommentForm.Data],id:String)(implicit
    requerst: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.37*/("""

"""),_display_(/*4.2*/main("掲示板","掲示板","copyright 2019.")/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""
    """),format.raw/*5.5*/("""<table>
        """),_display_(/*6.10*/Html(message)),format.raw/*6.23*/("""
    """),format.raw/*7.5*/("""</table>
    <br>
    <br>
    <h2>コメントを書く</h2>
    <form action="/create?id="""),_display_(/*11.31*/id),format.raw/*11.33*/("""" method="POST">
        <table>
            <tr>
                <td>名前</td><td><input type="text" name="name" value="匿名さん"></td>
            </tr>
            <tr>
                <td>コメント</td><td><textarea name="comment" rows="4" cols="40" required></textarea></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"></td>
            </tr>
        </table>
    </form>

    <a href="/">topへ</a>
        
""")))}))
      }
    }
  }

  def render(message:String,form:Form[CommentForm.Data],id:String,requerst:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,form,id)(requerst)

  def f:((String,Form[CommentForm.Data],String) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,form,id) => (requerst) => apply(message,form,id)(requerst)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-19T13:56:37.163
                  SOURCE: C:/Users/admin/Bulletinboard/app/views/board.scala.html
                  HASH: 7ee541686f1d82a34209e990d1f2c775da0352b6
                  MATRIX: 781->1|977->102|1007->107|1050->142|1089->144|1121->150|1165->168|1198->181|1230->187|1339->269|1362->271
                  LINES: 21->1|27->2|29->4|29->4|29->4|30->5|31->6|31->6|32->7|36->11|36->11
                  -- GENERATED --
              */
          