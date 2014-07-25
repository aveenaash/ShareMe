package code.snippet

import code.model.{Album, User}
import net.liftweb.mapper.By
import net.liftweb.common.Loggable
import scala.xml.NodeSeq
import net.liftweb.common.Full
import net.liftweb.http.S
import net.liftweb.util.PassThru
import net.liftweb._
import http._
import util.Helpers._

object AlbumCreator{

  def render = {
    var albumname = ""
    var albumDesc = ""
    def process() {
      val album : Album= Album.create
      album.albumname(albumname)
      val saved : Boolean = album.save
      if(saved) {
        S.redirectTo("/index")
      }
    }

    def uploadPhoto() {
      val album : Album= Album.create
      album.albumname(albumname)
      val saved : Boolean = album.save
      if(saved) {
        S.redirectTo("/index")
      }
    }

    "name=albumname" #> SHtml.text(albumname, albumname = _) &
      "name=albumDesc" #> SHtml.text(albumDesc, albumDesc = _) &
    // when the form is submitted, process the variable
    "name=addPhoto" #> SHtml.onSubmitUnit(uploadPhoto)
    "type=submit" #> SHtml.onSubmitUnit(process)
  }

    }