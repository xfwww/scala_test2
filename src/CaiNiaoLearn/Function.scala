package CaiNiaoLearn

object Function {
  def addInt (a:Int,b:Int): Int ={
    var sum:Int = 0
    sum = a + b
    return sum
  }

  def printResult(sum:Int): Unit = {
    println("The Result is:"+sum)
  }

  def time()={
    println("获得时间，单位为纳秒：")
    System.nanoTime()
  }

  def delayed (t: =>Long) = { //传名调用方法
    println("在delayed方法中")
    println("参数： "+t)
    t
  }

  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 2
    var sum = 0
    sum = addInt(a,b)
    printResult(sum)

    delayed(time())
  }
}
