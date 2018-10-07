package task_6_space_deleting

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._

object SpaceDeleting extends App {

  val config = ConfigFactory.load()

  val sentence = config.as[String]("sentence")

  val stringWithoutSpacesImpl1 = sentence.replaceAll(" ", "")
  val stringWithoutSpacesImpl2 = sentence.map {
    case ' ' => ""
    case letter => letter
  }.mkString("")

  println("Стрічка без пропусків")
  println("вбудована функція '.replaceAll': " + stringWithoutSpacesImpl1)
  println("ручний перебір : " + stringWithoutSpacesImpl2)
}
