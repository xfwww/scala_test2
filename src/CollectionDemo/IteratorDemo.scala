package CollectionDemo

object IteratorDemo {
  def test()={
    val it = Iterator("a","b","c","d","e")
    while(it.hasNext){
      println(it.next())
    }
  }

  def min_max_length ()={
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)
    println("ita.size 的值: " + ita.size )
    println("itb.length 的值: " + itb.length )

    val ita1 = Iterator(20,40,2,50,69, 90)
    val itb1 = Iterator(20,40,2,50,69, 90)
    println("最大元素是：" + ita1.max )
    println("最小元素是：" + itb1.min )

  }


  def main(args: Array[String]): Unit = {
    //test()
    min_max_length()
  }
}
