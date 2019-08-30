
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

object board extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[java.util.ArrayList[models.Comment],Form[CommentForm.Data],String,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages:java.util.ArrayList[models.Comment],form:Form[CommentForm.Data],id:String)(implicit
    requerst: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.37*/("""

"""),_display_(/*4.2*/main("掲示板","掲示板","copyright 2019.")/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""
    """),_display_(/*5.6*/for(message <- messages) yield /*5.30*/{_display_(Seq[Any](format.raw/*5.31*/("""
        """),format.raw/*6.9*/("""<table>
            <tr>
                <td>"""),_display_(/*8.22*/message/*8.29*/.userName),format.raw/*8.38*/("""</td>
                <td>"""),_display_(/*9.22*/message/*9.29*/.date),format.raw/*9.34*/("""</td>
            </tr>
            <tr>
                <td colspan='2'><textarea rows='4' cols='40' disabled>"""),_display_(/*12.72*/message/*12.79*/.comment),format.raw/*12.87*/("""</textarea></td>
            </tr>
        </table>
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""<br>
    <br>
    <h2>コメントを書く</h2>
    <form action="/create?id="""),_display_(/*19.31*/id),format.raw/*19.33*/("""" method="POST">
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

  def render(messages:java.util.ArrayList[models.Comment],form:Form[CommentForm.Data],id:String,requerst:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(messages,form,id)(requerst)

  def f:((java.util.ArrayList[models.Comment],Form[CommentForm.Data],String) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (messages,form,id) => (requerst) => apply(messages,form,id)(requerst)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-30T13:27:15.047
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/board.scala.html
                  HASH: b0a1f8c2081f5c11ad7c7284dee8dbd5a89af66e
                  MATRIX: 810->1|1036->132|1066->137|1109->172|1148->174|1180->181|1219->205|1257->206|1293->216|1367->264|1382->271|1411->280|1465->308|1480->315|1505->320|1647->435|1663->442|1692->450|1782->510|1815->516|1910->584|1933->586
                  LINES: 21->1|27->2|29->4|29->4|29->4|30->5|30->5|30->5|31->6|33->8|33->8|33->8|34->9|34->9|34->9|37->12|37->12|37->12|40->15|41->16|44->19|44->19
                  -- GENERATED --
              */
          