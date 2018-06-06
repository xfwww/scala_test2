package CollectionDemo

object ListDemo {
  def list1(): Unit ={
    //字符串列表
    val site : List[String] = List("java", "scala", "python") //val 不能改变 var 可以改变的变量

    val site1 = "Java" :: ("scala"::("python"::Nil))


    //整型列表
    val nums : List[Int] = List(1,5,18,20)

    val nums1  = 1::(5::(18::(20::Nil)))

    //空列表
    val empty : List[Nothing] = List()
    val empty1  = Nil

    //二维列表
    val dim : List[List[Int]] =
      List(
        List(1,0,0),
        List(0,1,0),
        List(0,0,1)
      )

    val dim1 = (1::(0::(0::Nil)))::
      (0::(1::(0::Nil)))::
      (0::(0::(1::Nil)))::Nil


    println("字符串列表 :"+site(0))
    println("整型列表："+ nums)
    println("空列表: "+empty)
    println("二维列表："+dim)

    println("字符串列表1 :"+site1)
    println("整型列表1："+ nums1)
    println("空列表1: "+empty1)
    println("二维列表1："+dim1)
  }

  def todoList(): Unit ={
    val site1 = "Java" :: ("scala"::("python"::Nil))
    val nums = Nil
    println("第一个字符是:"+site1.head)
    println( "最后一个网站是 : " + site1.tail )
    println( "查看列表 site 是否为空 : " + site1.isEmpty )
    println( "查看 nums 是否为空 : " + nums.isEmpty )

  }

  def concatlist(): Unit ={
    val site1 = "Java"::("Scala"::("Python"::Nil))
    val site2 = "C"::("C++"::("C#"::Nil))

    //使用:::运算符连接
    var site = site1:::site2
    println("使用:::运算符连接="+site )

    //使用List.:::()方法
    site = site1.:::(site2)
    println("使用List.:::()方法="+site)

    //使用concat方法
    site = List.concat(site1,site2)
    println("使用concat方法="+site)

  }

  //可以使用 List.fill() 方法来创建一个指定重复数量的元素列表
  def filltest(): Unit ={
    val site = List.fill(3)("Scala")
    println("triple site:"+site )

    val num = List.fill(10)(2)
    println("num:"+num)
  }

  //List.tabulate() 方法是通过给定的函数来创建列表。
  def  tabulatetest(): Unit ={
    val squares = List.tabulate(6)(n => n*n)
    println("一维列表："+squares)

    val mul = List.tabulate(4,5)( _ * _ )
    println("二维列表："+mul)
  }

  //List.reverse 用于将列表的顺序反转
  def reversetest(): Unit ={
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    println( "site 反转前 : " + site )

    println( "site 反转后 : " + site.reverse )
  }

  def main(args: Array[String]): Unit = {
    //list1()
    //todoList()
    //concatlist()
    //filltest()
    //tabulatetest()
    reversetest()

  }
}
