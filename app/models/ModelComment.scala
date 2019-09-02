package models;

import java.sql._
import play.api.data._

import play.api.db._
import play.api.data.Forms._
import org.joda.time.DateTime
import org.joda.time.format._

class ModelComment(db:Database) {
    def getComment(id:Int) :java.util.ArrayList[Comment] ={
        var comment:Comment = null
        var commentList=new java.util.ArrayList[Comment]()
        val sql="""Select comment.userName,comment.comment,comment.date from comment
                    Inner Join room on comment.roomId = room.id
                    Where comment.roomId=room.id
                    AND room.id = ?1 Order by comment.date desc"""
        var msg=""

        try {
            db.withConnection { con =>
                var stmt = con.prepareStatement(sql)
                stmt.setInt(1,id)
                val rs1 = stmt.executeQuery()
                
                while(rs1.next){
                    comment=new Comment(rs1.getString("comment.userName"),rs1.getString("comment.comment"),rs1.getString("comment.date"))
                    commentList.add(comment)
                }
            
            }
        } catch {
            case e:SQLException =>
                throw new SQLException
            
        }

        return commentList
    }

    def createComment(id:Int,name:String,comment:String){
        val sql="insert into comment values (default,?,?,?,?)"

        

        try 
            db.withConnection { conn =>
                val ps = conn.prepareStatement(sql)
                ps.setInt (1,id)
                ps.setString (2,name)
                ps.setString (3,comment)
                ps.setString (4,DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(new DateTime()))
                ps.executeUpdate
            }
        catch {
            case e: SQLException =>
                throw new SQLException
        }
    }
}