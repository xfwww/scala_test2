package MatchDemo

object MatchMain {
  def matchDemo(x :Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def main(args: Array[String]): Unit = {
    println(matchDemo(4))
    println(matchDemo(2))
  }
}
