package CollectionDemo

object TupleDemo {
  def test (): Unit ={
    val t = (4,3,2,1)

    val sum = t._1+t._2+t._3+t._4
    println("元组和："+sum)
  }

  def iteratorTest(): Unit ={
    val t = (4,3,2,1)
    t.productIterator.foreach{
      i => println("Value = "+i)
    }
  }

  def tupletostring(): Unit ={
    val t = new Tuple3(1, ".Scala", Console)
    println("连接后的字符串为："+t.toString())
  }

  def swapstring(): Unit ={
    val t = new Tuple2("www.baidu.com", "www.tobao.com")
    val tnew = t.swap
    println("交换后的元组：" + tnew)
  }

  def main(args: Array[String]): Unit = {
    test()
    iteratorTest()
    tupletostring()
    swapstring()
  }
}
