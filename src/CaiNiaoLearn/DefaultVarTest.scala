package CaiNiaoLearn

object DefaultVarTest {
  def main(args: Array[String]): Unit = {
    println("return value:"+addInt())
  }

  def addInt(a:Int=5,b:Int=7):Int ={
    var sum:Int = 0
    sum = a+b
    return sum
  }
}
