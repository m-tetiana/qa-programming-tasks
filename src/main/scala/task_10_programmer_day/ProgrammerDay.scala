package task_10_programmer_day

import java.time.LocalDate

object ProgrammerDay extends App {

  def programmerDayOfWeek(year: Int) = {
    val date = LocalDate.ofYearDay(year, 255)
    date.getDayOfWeek.toString.toLowerCase.capitalize
  }

  println(s"Programmer day in 2018 is ${programmerDayOfWeek(2018)}")

}
