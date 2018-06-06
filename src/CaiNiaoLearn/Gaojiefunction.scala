package CaiNiaoLearn

object Gaojiefunction {
/*
Scala 中允许使用高阶函数,
 高阶函数可以使用其他函数作为参数，
 或者使用函数作为输出结果。
以下实例中，
apply() 函数使用了另外一个函数
 f 和 值 v 作为参数，而函数 f 又调用了参数 v：
 */

  def main(args: Array[String]): Unit = {
    println( apply1(layout,10))

    println(multiplier(4)+multiplier(5))
  }
  def apply1(f: Int => String, v: Int)= f(v)

  def layout[A](x:A) = "["+x.toString()+"]"

  //匿名函数
  var factor = 3
  val multiplier = (i:Int) => i * factor
}
