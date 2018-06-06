package CollectionDemo

import scala.collection.mutable.Set

object SetDemo {
  def test(): Unit ={
    val mutableSet = Set(1,2,3) //可变集合
    println(mutableSet.getClass.getName)

    mutableSet.add(4)
    println(mutableSet)
    mutableSet.remove(1)
    println(mutableSet)
    mutableSet += 5
    println(mutableSet)
    mutableSet -= 2
    println(mutableSet)

    val another = mutableSet.toSet
    println(another.getClass.getName)
    println(another)
  }

  def  basic_operation()={
    val site = Set("Python","Java","Scala")
    val nums : Set[Int] = Set()

    println(site)
    println("第一个字符是："+site.head)
    println("最后一个字符是："+site.tail)
    println("查看列表site是否为空："+site.isEmpty)
    println("查看nums是否为空："+nums.isEmpty)

  }

  //连接集合
  def concatSet()={
    val site1 = Set("Runoob", "Google", "Baidu")
    val site2 = Set("Faceboook", "Taobao")

    //++作为运算符使用
    var site = site1++site2
    println("site1++site2 : "+site)

    //++ 作为方法使用
    site  = site1.++(site2)
    println("site1.++(site2):"+site)
  }

  def min_max_Set()={
    val num = Set(5,6,9,20,30,45)
    println("Set(5, 6, 9, 20, 30, 45)集合中的最小元素是 :"+num.min)
    println("Set(5, 6, 9, 20, 30, 45)集合中的最小元素是 :"+num.max)
  }

  def  intersection={
    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)
    println("num1.&(num2) : "+num1.&(num2))
    println("num1.intersect(num2) : "+num1.intersect(num2))
  }

  def main(args: Array[String]): Unit = {
    //test()
    //basic_operation()
    //concatSet()
    //min_max_Set()
    intersection
  }
}
