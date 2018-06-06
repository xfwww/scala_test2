package MatchDemo

object DiffDataTypeMatch {
  def matchDataType(x : Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int" //对应类型模式
    case _ => "many"
  }

  def main(args: Array[String]): Unit = {
    println(matchDataType("two"))
    println(matchDataType(5))
    println(matchDataType("test"))
    println(matchDataType(1))
  }
}
