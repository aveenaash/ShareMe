package code.snippet


import code.model._
import net.liftweb.util.Helpers._


class Login
//  extends DispatchSnippet
{
  val albumsList:List[Album]  = Album.findAll()

  //S.addCookie(HTTPCookie("user", "cookie Value").setDomain(S.hostName).setPath("/"))
  def render = {
    "a"        #> albumsList.map( c =>
      "* [href]" #> "/index" &
        "* *"      #> (c.albumname.get)
    )
  }
//  def dispatch: DispatchIt = {
//    case "index" => index
//  }
//  def index(in: NodeSeq): NodeSeq = {
//    if ( User.loggedIn_? )
//    {
//      S.redirectTo("/user_mgt/login")
////     val albums: List[Album]= Album.findAll
//////      for(var a <- albums)
//////      {
////        <span>Hello World</span>
//////      }
//    }
//    else    S.redirectTo("/user_mgt/login")
//  }
}