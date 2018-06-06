package CaiNiaoLearn

object ArrayTest {
  def main(args: Array[String]): Unit = {
    //array2()
    //arrayconcat()
    //array1()
    arrayRange()
  }

  def array1()={
    //创建一个list
    var myList = Array(1.9, 2.9, 8.0, 3.5)
    //循环所有数组中元素
    for(x <- myList){
      println( x )
    }

    //计算数组所有元素的总和
    var total = 0.0
    for( i <- 0 to (myList.length - 1)){
      total += myList(i)
    }
    println("list总和为："+total)

    //查找数组中的最大元素
    var max = myList(0)
    for(i <- 1 to (myList.length-1)){
      if(myList(i) > max)
        max  = myList(i)
    }
    println("数组元素最大值： "+max)
  }

  import Array._
  //多维数组
  def array2()={
    //创建一个2维数组
    var myMatrix = ofDim[Int](3,3)

    //创建矩阵
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        myMatrix(i)(j) = j
      }
    }

    //打印二维阵列
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        print(" "+ myMatrix(i)(j))
      }
      println()
    }
  }

  //合并数组
  def arrayconcat()={
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = concat(myList1,myList2)

    //输出所有数组元素
    for(m <- myList3){
      println("合并后数组元素：" + m)
    }
  }

  //创建区间数组
  def arrayRange(): Unit ={
    var myList1 = range(10,20,2)
    var myList2 = range(10,20)

    for(x <- myList1){
      print (" "+ x)
    }
    println(" ")
    for(y <- myList2){
      print (" "+ y)
    }
  }
}
