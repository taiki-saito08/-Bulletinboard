package models;

@Singleton
class User(var id:Int, var name:String, var mail:String, var pass:String, var date:String, var comment:String) {
  var id:Int=id
  var userName:String=name
  var userMail:String=mail
  var userPass:String=pass
  var createDate:String=date
  var userComment:String=comment
}