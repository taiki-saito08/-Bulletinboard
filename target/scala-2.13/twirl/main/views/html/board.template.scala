
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

object board extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[java.util.ArrayList[models.Comment],Form[CommentForm.Data],String,String,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages:java.util.ArrayList[models.Comment],form:Form[CommentForm.Data],id:String,msg:String)(implicit
    requerst: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.37*/("""

"""),_display_(/*4.2*/main("掲示板","掲示板","copyright 2019.")/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""
    """),format.raw/*5.5*/("""<h1>msg</h1>

    """),_display_(/*7.6*/for(message <- messages) yield /*7.30*/{_display_(Seq[Any](format.raw/*7.31*/("""
        """),format.raw/*8.9*/("""<table>
            <tr>
                <td>"""),_display_(/*10.22*/message/*10.29*/.userName),format.raw/*10.38*/("""</td>
                <td>"""),_display_(/*11.22*/message/*11.29*/.date),format.raw/*11.34*/("""</td>
            </tr>
            <tr>
                <td colspan='2'><textarea rows='4' cols='40' disabled>"""),_display_(/*14.72*/message/*14.79*/.comment),format.raw/*14.87*/("""</textarea></td>
            </tr>
        </table>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""<br>
    <br>
    <h2>コメントを書く</h2>
    <form action="/create?id="""),_display_(/*21.31*/id),format.raw/*21.33*/("""" method="POST">
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

  def render(messages:java.util.ArrayList[models.Comment],form:Form[CommentForm.Data],id:String,msg:String,requerst:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(messages,form,id,msg)(requerst)

  def f:((java.util.ArrayList[models.Comment],Form[CommentForm.Data],String,String) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (messages,form,id,msg) => (requerst) => apply(messages,form,id,msg)(requerst)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-30T19:40:06.343
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/board.scala.html
                  HASH: 8857c7804fd04f49a7296e6dbd458905848bebde
                  MATRIX: 817->1|1054->143|1084->148|1127->183|1166->185|1198->191|1244->212|1283->236|1321->237|1357->247|1432->295|1448->302|1478->311|1533->339|1549->346|1575->351|1717->466|1733->473|1762->481|1852->541|1885->547|1980->615|2003->617
                  LINES: 21->1|27->2|29->4|29->4|29->4|30->5|32->7|32->7|32->7|33->8|35->10|35->10|35->10|36->11|36->11|36->11|39->14|39->14|39->14|42->17|43->18|46->21|46->21
                  -- GENERATED --
              */
          