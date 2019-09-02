package models;

import java.sql._
import play.api.data._

import play.api.db._
import play.api.data.Forms._
import org.joda.time.DateTime
import org.joda.time.format._

class ModelRoom(db:Database) {
    def searchRoom():java.util.ArrayList[Room]={
        var roomList=new java.util.ArrayList[Room]()
        val sql="Select * from room Order By createDate desc"
        var room:Room=null
        try {
            db.withConnection { con =>
                var stmt = con.prepareStatement(sql)
                val rs = stmt.executeQuery()


                while(rs.next){
                    room=new Room(rs.getInt("id"),rs.getString("name"),rs.getString("createDate"))
                    roomList.add(room)
                    
                }
            
            }
        } catch {
            case e:SQLException =>
                throw new SQLException
        }

        return roomList

    }

    def createRoom(name:String){
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
                throw new SQLException
        }
    }
}