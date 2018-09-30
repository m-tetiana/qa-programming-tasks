package task_5_words_count


import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._

object WordsCount extends App {

  val config = ConfigFactory.load()

  val sentence = config.as[String]("task5.sentence")
  val word = config.as[String]("task5.word")

  val wordLowerCase = word.toLowerCase
  val wordLength = word.length

  val count = sentence.toLowerCase.sliding(wordLength).count(_ == wordLowerCase)

  println(s"Кількість входжень слова $word в реченні: $count")

}
