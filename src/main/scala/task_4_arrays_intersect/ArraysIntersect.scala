package task_4_arrays_intersect

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._

object ArraysIntersect extends App {

  val config = ConfigFactory.load()

  val array = config.as[Seq[Int]]("array")
  val array2 = config.as[Seq[Int]]("array2")

  val intersectImpl1 = array.intersect(array2)
  val intersectImpl2 = array.flatMap(e => array2.find(_ == e)).distinct

  println("Спільні елементи двох масивів: ")
  println("вбудована функція '.intersect': " + intersectImpl1.mkString("[", ", ", "]"))
  println("ручний перебір : " + intersectImpl2.mkString("[", ", ", "]"))

}
