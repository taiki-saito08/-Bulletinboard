package controllers

object CommentForm {
    import play.api.data._
    import play.api.data.Forms._

    case class Data(name:String, comment:String)

    val commentForm = Form(
        mapping(
            "name"->text,
            "comment"->text
        )(Data.apply)(Data.unapply)
    )
}