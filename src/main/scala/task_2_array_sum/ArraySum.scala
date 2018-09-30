package task_2_array_sum

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._

object ArraySum extends App {

  val config = ConfigFactory.load()

  val array = config.as[Seq[Int]]("array")

  val sumImpl1 = array.sum
  val sumImpl2 = array.fold(0)((acc, e) => acc + e)

  println("Сума елементів масиву: ")
  println("вбудована функція '.sum': " + sumImpl1)
  println("ручний перебір : " + sumImpl2)

}
