package task_7_polindrom

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._

object Palindrome extends App {

  val config = ConfigFactory.load()

  val word = config.as[String]("word")

  val isPalindrome = word.toLowerCase == word.toLowerCase.reverse

  if(isPalindrome) {
    println(s"$word є паліндромом")
  } else {
    println(s"$word не є паліндромом")
  }
}
