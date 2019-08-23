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
import models.User
import models.Comment

@Singleton
class HomeController @Inject()(db: Database,
    cc: MessagesControllerComponents) 
        extends MessagesAbstractController(cc) {
    
    //トップページへ
    def index() = Action { implicit request =>
        var msg = ""
        try {
            db.withConnection { con =>
                var stmt = con.createStatement
                val rs = stmt.executeQuery("Select * from room Order By createDate desc")


                while(rs.next){
                    msg += "<table><tr><td><a href='/board?id="+rs.getInt("id")+"'>" + rs.getString("name") +"</a></td><td>" +
                        rs.getString("createDate") + "作成</td></tr></table>"
                }
            
            }
        } catch {
            case e:SQLException =>
                msg = "<li>no record...</li>"
        }
        Ok(views.html.index(
            msg
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
        
        try 
            db.withConnection { conn =>
                val ps = conn.prepareStatement(
                    "insert into comment values (default,?,?,?,?)")
                ps.setInt (1,id)
                ps.setString (2,name)
                ps.setString (3,comment)
                ps.setString (4,DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(new DateTime()))
                ps.executeUpdate
            }
        catch {
            case e: SQLException =>
                
        }
        Redirect("/board?id="+id)
    }

    //掲示板の部屋に入る
    def message(id:Int) = Action { implicit request =>
        var id=request.getQueryString("id").getOrElse("")
        var comment:Comment = null
        var commentList=new java.util.ArrayList[Comment]()
        
        var msg = ""

        try {
            db.withConnection { con =>
                var stmt = con.createStatement
                val rs1 = stmt.executeQuery("""Select comment.userName,comment.comment,comment.date from comment
                    Inner Join room on comment.roomId = room.id
                    Where comment.roomId=room.id
                    AND room.id = """+id+
                    """Order by comment.date desc""")

                while(rs1.next){
                    comment=new Comment(rs1.getString("comment.userName"),rs1.getString("comment.comment"),rs1.getString("comment.date"))
                    commentList.add(comment)
                }
            
            }
        } catch {
            case e:SQLException =>
                msg = "<li>no record...</li>"
        }
        
        Ok(views.html.board(
            commentList,commentForm,id
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

        try 
            db.withConnection { con =>
                val ps = con.prepareStatement(
                    "insert into room values (default,?,?)")
                ps.setString (1,name)
                ps.setString (2,DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(new DateTime()))
                
                ps.executeUpdate
            }
        catch {
            case e: SQLException =>
                Ok(views.html.createRoom(
                    "フォームを入力してください",
    
                ))
        }
        Redirect("/")
    }

    //ログイン画面へ遷移
    def rootLogin() = Action { implicit request =>
        Ok(views.html.login("入力してください"))
    }

    //ログイン処理
    def login() = Action { implicit request =>
        
        val form:Option[Map[String,Seq[String]]]=
            request.body.asFormUrlEncoded
        val param:Map[String,Seq[String]] = form.getOrElse(Map())
        //var loginUser=null
        val session = request.session.get("user")
        var mail:String = param.get("mail").get(0)
        var pass:String = param.get("pass").get(0)
        
        try 
             db.withConnection { con =>
                var stmt = con.createStatement
                val rs = stmt.executeQuery(
                    "Select * From user Where mail="+mail+",pass="+pass)

                while(rs.next){
                    var loginUser=new User(rs.getInt("id"),rs.getString("name"),rs.getString("mail"),rs.getString("pass"),rs.getString("date"),rs.getString("comment"))
                    

                }
            }
        catch {
            case e: SQLException =>
                Ok(views.html.login(
                    "フォームを入力してください",
                ))
        }
        Redirect("/")
    }
/*
    //新規登録画面へ遷移
    def rootSignUp() = Action { implicit request =>
        Ok(views.html.signUp())
    }

    //新規登録処理
    def signUp() = Action { implicit request =>
        

        val form:Option[Map[String,Seq[String]]]=
            request.body.asFormUrlEncoded
        val param:Map[String,Seq[String]] = form.getOrElse(Map())
        
        var mail:String = param.get("name").get(0)
        var pass:String = param.get("mail").get(0)
        var pass:String = param.get("pass").get(0)
        var pass:String = param.get("comment").get(0)
        
        try 
            db.withConnection { conn =>
                val ps = conn.prepareStatement(
                    "insert into userAccount values (default,?,?,?,?,?)")
                ps.setString (1,name)
                ps.setString (2,mail)
                ps.setString (3,pass)
                ps.setString (4,DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(new DateTime()))
                ps.setString (5,comment)
                
                ps.executeUpdate
            }
        catch {
            case e: SQLException =>
                Ok(views.html.signUp(
                    "フォームを入力してください",
    
                ))
        }
        Redirect("/rootLogin")
    }

    //プロフィール変更へ遷移
    def rootUpdate() = Action { implicit request =>
        Ok(views.html.update())
    }

    //変更処理
    def update() = Action { implicit request =>
        

        val form:Option[Map[String,Seq[String]]]=
            request.body.asFormUrlEncoded
        val param:Map[String,Seq[String]] = form.getOrElse(Map())
        var msg = ""
        var mail:String=param.get("name").get(0)
        var pass:String=param.get("mail").get(0)
        var pass:String=param.get("pass").get(0)
        var pass:String=param.get("comment").get(0)
        
        try 
            db.withConnection { conn =>
                val ps = conn.prepareStatement(
                    "insert into userAccount values (default,?,?,?,?,?)")
                ps.setString (1,name)
                ps.setString (2,mail)
                ps.setString (3,pass)
                ps.setString (4,DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(new DateTime()))
                ps.setString (5,comment)
                
                ps.executeUpdate
            }
        catch {
            case e: SQLException =>
                Ok(views.html.update(
                    "フォームを入力してください",
    
                ))
        }
        Redirect("/myPage")
    }*/
}
