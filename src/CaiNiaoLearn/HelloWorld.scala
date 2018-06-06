package CaiNiaoLearn

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("This is the first scala object~")
    val s = "wwwww"; println(s)
    val s1 = "www,\nww"; println(s1)
    val foo = """菜鸟教程
              www.runoob.com
              www.w3cschool.cc
              www.runnoob.com
              以上三个地址都能访问"""
    //println(foo)
    var myFirstVar : String = "scala"
    val myFirstVal : String = "scala1"

    val myVar = 10
    val myVal = "Hello, Scala!"

    println(myVar)
    println(myVal)

    println(myFirstVar)
    println(myFirstVal)

    val xmax , ymax = 100
    println(xmax + "kkkk"+ymax)

    val pa = (200,"KKKK") //元组
    println(pa)
  }

  /*
   *这是一个多行注释
   *
   */

  //这是一个单行注释
}
