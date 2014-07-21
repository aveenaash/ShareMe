package code.snippet

import net.liftweb.http._
import code.model._
import scala.xml._
//import util.Helpers._

class Login extends DispatchSnippet
{
  def dispatch: DispatchIt = {
    case "index" => index
  }
  def index(in: NodeSeq): NodeSeq = {
    if ( User.loggedIn_? )
    {
     val albums: List[Album]= Album.findAll
//      for(var a <- albums)
//      {
        <span>Hello World</span>
//      }
    }
    else    S.redirectTo("/user_mgt/login")
  }
}