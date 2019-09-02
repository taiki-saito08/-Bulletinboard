
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("ログイン","ログイン画面","copyright 2019.")/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""
    """),format.raw/*4.5*/("""<form action="/login" method="POST">
        <table border="1">
            <tr>
                <td>メールアドレス</td><td><input type="mail" name="mail" required></td>
            </tr>
            <tr>
                <td>パスワード</td><td><input type="password" name="pass" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="ログイン"></td>
            </tr>
        </table>
    </form>
    <a href="/rootSignUp">登録していない方はこちら</a>
    """),_display_(/*18.6*/message),format.raw/*18.13*/("""
    """),format.raw/*19.5*/("""<a href="/">topへ</a>
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
                  DATE: 2019-08-30T19:54:06.247
                  SOURCE: C:/Users/admin/ScalaBulletinBoard/-Bulletinboard/app/views/login.scala.html
                  HASH: 478fa205428b0cda3a0747a531a5065fa6175ae1
                  MATRIX: 729->1|840->17|870->22|917->61|956->63|988->69|1512->567|1540->574|1573->580
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|43->18|43->18|44->19
                  -- GENERATED --
              */
          