package controllers

import java.sql._
import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.db._
import PersonForm._
import CommentForm._
import org.joda.time.DateTime
import org.joda.time.format._
import models._

@Singleton
class HomeController @Inject()(db: Database,
    cc: MessagesControllerComponents) 
        extends MessagesAbstractController(cc) {
    
    //トップページへ
    def index() = Action { implicit request =>
        var msg = ""
        var roomList:java.util.ArrayList[Room]=null
        var room:Room=null
        try {
            val modelRoom:ModelRoom = new ModelRoom(db)
            roomList = modelRoom.searchRoom()
            
        } catch {
            case e:SQLException =>
                Ok(views.html.index(null,"管理者に連絡してください"))
        }
        Ok(views.html.index(
            roomList,msg
        ))
    }

    
    //コメントの送信
    def create() = Action { implicit request =>
        
        val form:Option[Map[String,Seq[String]]]=
            request.body.asFormUrlEncoded
        val param:Map[String,Seq[String]] = form.getOrElse(Map())
        var id:Int=request.getQueryString("id").getOrElse("").toInt
        var name:String=param.get("name").get(0)
        var comment:String=param.get("comment").get(0)
        
        if(name==""){
            name="匿名さん"
        }

        try {
                val modelComment:ModelComment = new ModelComment(db)
                modelComment.createComment(id.toInt,name,comment)
            
            }
        catch {
            case e: SQLException =>
               Ok(views.html.errorPage())
        }
        Redirect("/board?id="+id)
    }

    //掲示板の部屋に入る
    def message(id:Int) = Action { implicit request =>
        var id=request.getQueryString("id").getOrElse("")
        var commentList:java.util.ArrayList[models.Comment]=null
        var msg = ""
        
        try{
            val modelComment:ModelComment = new ModelComment(db)
            commentList = modelComment.getComment(id.toInt)
        }catch{
            case e:SQLException =>
                
            msg = "エラーが発生しました"
        }
        Ok(views.html.board(
            commentList,commentForm,id,msg
        ))
    }

    //掲示板の部屋作成画面へ遷移
    def createRoom() = Action { implicit request =>
        Ok(views.html.createRoom("フォームを入力してください"))
    }

    //掲示板の部屋作成
    def roomCreate() = Action { implicit request =>
        

        val form:Option[Map[String,Seq[String]]]=
            request.body.asFormUrlEncoded
        val param:Map[String,Seq[String]] = form.getOrElse(Map())

        var name:String=param.get("roomName").get(0)
        if(name==""){
            name="雑談版"
        }

        try {
            val modelRoom:ModelRoom = new ModelRoom(db)
            modelRoom.createRoom(name)
            }
        catch {
            case e: SQLException =>
                Ok(views.html.errorPage())
        }
        Redirect("/")
    }

    //ログイン画面へ遷移
    def rootLogin() = Action { implicit request =>
        Ok(views.html.login("入力してください"))
    }

    //ログイン処理
    def login() = Action { implicit request =>
        var loginUser:User=null
        val form:Option[Map[String,Seq[String]]]=
            request.body.asFormUrlEncoded
        val param:Map[String,Seq[String]] = form.getOrElse(Map())
        //var loginUser=null
        val session = request.session.get("user")
        var mail:String = param.get("mail").get(0)
        var pass:String = param.get("pass").get(0)
        
        try {
                val modelUser:ModelUser = new ModelUser(db)
                loginUser=modelUser.loginUser(mail,pass)
                 
            }
        catch {
            case e: SQLException =>
                Ok(views.html.errorPage())
        }
         Ok(views.html.myPage(
            loginUser
        ))
    }

    //新規登録画面へ遷移
    def rootSignUp() = Action { implicit request =>
        Ok(views.html.signUp("フォームを入力してください"))
    }

    //新規登録処理
    def signUp() = Action { implicit request =>
        

        val form:Option[Map[String,Seq[String]]]=
            request.body.asFormUrlEncoded
        val param:Map[String,Seq[String]] = form.getOrElse(Map())
        
        var name:String = param.get("name").get(0)
        var mail:String = param.get("mail").get(0)
        var pass:String = param.get("pass").get(0)
        var comment:String = param.get("comment").get(0)
        
        try{ 
                val modelUser:ModelUser = new ModelUser(db)
                modelUser.createUser(name,mail,pass,comment)
                
            }
        catch {
            case e: SQLException =>
                Ok(views.html.errorPage())
        }
        Redirect("/rootLogin")
    }

    //プロフィール変更へ遷移
    def rootUpdate() = Action { implicit request =>
        Ok(views.html.update("フォームを入力してください"))
    }

    //変更処理
    def update() = Action { implicit request =>
        

        val form:Option[Map[String,Seq[String]]]=
            request.body.asFormUrlEncoded
        val param:Map[String,Seq[String]] = form.getOrElse(Map())
        var msg = ""
        var name:String=param.get("name").get(0)
        var mail:String=param.get("mail").get(0)
        var comment:String=param.get("comment").get(0)
        
        try {
                val modelUser:ModelUser = new ModelUser(db)
                modelUser.updateUser(name,mail,comment)
            }
        catch {
            case e: SQLException =>
                Ok(views.html.errorPage())
        }
        Redirect("/myPage")
    }
}
