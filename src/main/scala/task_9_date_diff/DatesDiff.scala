package task_9_date_diff

import java.time.{LocalDate, Period}
import scala.collection.JavaConverters._

object DatesDiff extends App {

  val date1 = LocalDate.of(2018, 8, 18)
  val date2 = LocalDate.of(2018, 10, 5)

  val duration = Period.between(date1, date2)

  val durationString = duration.getUnits.asScala.map {
    case unit if duration.get(unit) > 1 => s"${duration.get(unit)} ${unit.toString.toLowerCase}"
    case unit if duration.get(unit) == 1 => s"${duration.get(unit)} ${unit.toString.toLowerCase.dropRight(1)}"
    case _ => ""
  }.filter(_.nonEmpty).mkString(" ")

  println(s"Duration between $date1 and $date2 is $durationString")

}
