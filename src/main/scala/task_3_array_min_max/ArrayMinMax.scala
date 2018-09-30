package task_3_array_min_max

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._

object ArrayMinMax extends App {


  val config = ConfigFactory.load()

  val array = config.as[Seq[Int]]("array")

  val maxImpl1 = array.max
  val maxImpl2 = array.reduce((a, b) => math.max(a, b))
  println("Максимальний елемент")
  println("вбудована функція '.max': " + maxImpl1)
  println("ручний перебір : " + maxImpl2)

  val minImpl1 = array.min
  val minImpl2 = array.reduce((a, b) => math.min(a, b))
  println("Мінімальний елемент")
  println("вбудована функція '.min': " + minImpl1)
  println("ручний перебір : " + minImpl2)

}
