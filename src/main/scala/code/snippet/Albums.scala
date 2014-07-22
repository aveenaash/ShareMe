package code.snippet

import code.model.Album
import net.liftweb.util.Helpers._
object Albums {

    val albumsList:List[Album]  = Album.findAll()

  def render = {
    "a"        #> albumsList.map( c =>
      "* [href]" #> "/index" &
        "* *"      #> (c.albumname.get)
    )
  }

}