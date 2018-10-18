package task_8_password_regex

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._

import scala.util.matching.Regex

object PasswordRegex extends App {

  val config = ConfigFactory.load()
  val password = config.as[String]("password")

  val PasswordRegex: Regex = "^(?=[a-zA-Z0-9_]*[0-9])(?=[a-zA-Z0-9_]*[a-z])(?=[a-zA-Z0-9_]*[A-Z])(?=[a-zA-Z0-9_]+$).{8,}$".r

  checkPassword(password)

  def checkPassword(password: String): Unit = {
    PasswordRegex.findFirstMatchIn(password) match {
      case Some(p) if p.toString() == password => println("Password is valid")
      case _ => println("Password is not valid")
    }
  }

}
