package CollectionDemo

object OptionDemo {
  def test()={
    val myMap : Map[String,String] = Map("key1"->"val1")
    val value2 : Option[String] = myMap.get("key1")
    val value3 : Option[String] = myMap.get("key2")
    println(value2) //存在值
    println(value3) //不存在值
  }

  def test2 = {
    val sites = Map("taobao" -> "www.taobao.com", "google"->"www.google.com")
    println("sites.get(\"taobao\"):" + sites.get("taobao"))
    println("sites.get(\"baidu\"):"+sites.get("baidu"))

  }

  //模式匹配
  def test3()={
    val sites =Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")
    println("show(sites.get( \"runoob\")) : " +
      show(sites.get( "runoob")))

    println("show(sites.get(\"baidu\")): "+
      show(sites.get("baidu")))
  }

  def show(x: Option[String]) = x match{
    case Some(s) => s
    case None => "?"
  }

  def getval()={
    val a : Option[Int] = Some(5)
    val b : Option[Int] = None
    println("a.getOrElse(0): "+ a.getOrElse(0))
    println("b.getOrElse(01): " + b.getOrElse(2))
    println("a.isEmpty: " + a.isEmpty )
    println("b.isEmpty: " + b.isEmpty )
  }

  def main(args: Array[String]): Unit = {
    /*test()
    test2
    test3()*/
    getval()

  }
}
