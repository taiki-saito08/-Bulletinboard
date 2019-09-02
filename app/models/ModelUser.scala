package models;

import java.sql._
import play.api.data._

import play.api.db._
import play.api.data.Forms._
import org.joda.time.DateTime
import org.joda.time.format._

class ModelUser(db:Database) {
    def loginUser(mail:String,pass:String): User={
        val sql="Select * From user Where mail = ?1 , pass = ?2"
        var loginUser:User=null
        try 
             db.withConnection { con =>
                var stmt = con.prepareStatement(sql)
                stmt.setString(1,mail)
                stmt.setString(2,pass) 
                val rs = stmt.executeQuery()

                while(rs.next){
                    loginUser=new User(rs.getInt("id"),rs.getString("name"),rs.getString("mail"),rs.getString("pass"),rs.getString("date"),rs.getString("comment"))

                }
            }
        catch {
            case e: SQLException =>
                throw new SQLException
        }
        return loginUser
    }

    def createUser(name:String,mail:String,pass:String,comment:String){
        val sql= "insert into userAccount values (default,?,?,?,?,?)"
         try 
            db.withConnection { conn =>
                val ps = conn.prepareStatement(sql)
                ps.setString (1,name)
                ps.setString (2,mail)
                ps.setString (3,pass)
                ps.setString (4,DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(new DateTime()))
                ps.setString (5,comment)
                
                ps.executeUpdate
            }
        catch {
            case e: SQLException =>
                throw new SQLException
        }
    }

    def updateUser(name:String,mail:String,comment:String){
        val sql= "UPDATE userAccount set name=?1,mail=?2,comment=?3"
         try 
            db.withConnection { conn =>
                val ps = conn.prepareStatement(sql)
                ps.setString (1,name)
                ps.setString (2,mail)
                ps.setString (3,comment)
                
                ps.executeUpdate
            }
        catch {
            case e: SQLException =>
                throw new SQLException
        }
    }
}