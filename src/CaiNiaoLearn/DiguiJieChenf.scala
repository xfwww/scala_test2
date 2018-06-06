package CaiNiaoLearn

object DiguiJieChenf {
  def factorial(n:BigInt):BigInt={
    if(n<1)
      1
    else
      n*factorial(n-1)
  }

  def main(args: Array[String]): Unit = {
    for(i<-1 to 10)
      println(i + "的阶乘值为 = "+factorial(i))

  }
}
