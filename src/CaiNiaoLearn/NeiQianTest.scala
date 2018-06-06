package CaiNiaoLearn

//用内嵌函数实现阶乘
object NeiQianTest {
  def main(args: Array[String]): Unit = {

  }

  def factorial (i :Int ): Int ={
    def fact(i:Int, accumulator:Int):Int ={
      if(i <= 1)
        accumulator
      else
        fact(i-1,i*accumulator)
    }
    fact(i,1)
  }
}
