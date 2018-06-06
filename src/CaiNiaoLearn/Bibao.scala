package CaiNiaoLearn

object Bibao {
/*
 *这里我们引入一个自由变量 factor，
 * 这个变量定义在函数外面。
 * 这样定义的函数变量 multiplier 成为一个"闭包"，
 * 因为它引用到函数外面定义的变量，
 * 定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
 */

  def main(args: Array[String]): Unit = {
    println("1:"+multiplier(2))
    println("2:"+multiplier(3))
  }

  var factor =3
  val multiplier = (i:Int) => i*factor

}
