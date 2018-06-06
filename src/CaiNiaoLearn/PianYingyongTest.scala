package CaiNiaoLearn
import java.util.Date

object PianYingyongTest {
  def main(args: Array[String]) {
    val date = new Date
    log(date, "message1" )
    Thread.sleep(1000)
    log(date, "message2" )
    Thread.sleep(1000)
    log(date, "message3" )

    val logWithBound = log(date,_:String)
    logWithBound("information1")
    Thread.sleep(1000)
    logWithBound("information2")
    Thread.sleep(1000)
    logWithBound("information3")
    Thread.sleep(1000)

  }

  def log(date: Date, message: String)  = {
    println(date + "----" + message)
  }

}
