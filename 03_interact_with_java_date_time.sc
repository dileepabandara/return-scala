import java.util.{Date, Locale}
import java.text.DateFormat._

object USDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val df = getDateInstance(LONG, Locale.US)
    println(df format now)
  }
}