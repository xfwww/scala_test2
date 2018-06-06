package CollectionDemo

object MapDemo {
  def basic_operation(): Unit ={
    val colors = Map("red" -> "#FF0000",
                     "azure" -> "#F0FFFF",
                     "peru" -> "#CD853F")
    var nums : Map[Int,Int] = Map()

    println("colors 中的键为："+colors.keys)
    println("colors 中的值为："+colors.values)
    println("检测colors是否为空："+colors.isEmpty)
    println("检测nums是否为空："+nums.isEmpty)

    nums += (12 -> 22)
    nums += (12 -> 22)
    nums += (10 -> 2)
    println(nums)
    println("检测nums是否为空："+nums.isEmpty)
  }

  def mergeMap(): Unit ={
    val colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

    //++作为运算符
    var colors = colors1 ++ colors2
    println("colors1++colors2:"+colors)

    //++作为方法
    colors= colors1.++(colors2)
    println("colors1.++(colors2) :"+colors)
  }

  def getkeyandvalue(): Unit ={
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    sites.keys.foreach{
      i=> print("Key = "+i)
        println("value = "+sites(i))
    }
  }

  def iskey(): Unit ={
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    var key1 = "runoob"
    if( sites.contains( key1 )){
      println(key1+" 键存在，对应的值为 :"  + sites(key1))
    }else{
      println("runoob 键不存在")
    }
    key1= "baidu"
    if( sites.contains( key1 )){
      println("baidu 键存在，对应的值为 :"  + sites(key1))
    }else{
      println("baidu 键不存在")
    }
    key1= "google"
    if( sites.contains( key1)){
      println("google 键存在，对应的值为 :"  + sites(key1))
    }else{
      println("google 键不存在")
    }
  }
  def main(args: Array[String]): Unit = {
    //basic_operation()
    //mergeMap()
    //getkeyandvalue()
    iskey()
  }
}
