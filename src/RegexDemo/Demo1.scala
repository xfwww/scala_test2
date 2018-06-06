package RegexDemo

object Demo1 {
  def main(args: Array[String]): Unit = {
    test3
    test4
    //test1
    //test2
  }

  def test1: Unit ={
    val pattern = "is Scala".r
    val str = "Scala is Scalable and cool"
    println(pattern findAllIn str)
    println(pattern findFirstIn str)
  }

  import scala.util.matching.Regex

  def test2: Unit ={
    val pattern = new Regex("(S|s)cala")
    val str = "scala is Scalable and cool"
    //val str1 = "scala is Scalable and cool"
    println(pattern findFirstIn str)
    //println(pattern findFirstIn str1)
    println((pattern findAllIn str ).mkString(","))
    // 使用逗号 , 连接返回结果
  }

  //使用 replaceFirstIn( ) 方法来替换第一个匹配项，
  // 使用 replaceAllIn( ) 方法替换所有匹配项
  def test3: Unit ={
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"
    println(pattern replaceFirstIn(str, "Java"))
  }

  def test4: Unit ={
    val pattern = new Regex("abl[ae]\\d+")
    //[ae] : abla或者able
    //\\d+ \\d代表数字 +代表加一个或多个

    val str = "ablaw is able1 and cool"

    println((pattern findAllIn str).mkString(","))
  }
}
