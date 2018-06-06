package CaiNiaoLearn

object Currying {
  def main(args: Array[String]): Unit = {
    val str1:String = "Hello,"
    val str2:String = "World!"
    println("str1+str2: " +strcat(str1)(str2))

    val str3 = strcat2(str1)
    val str4 = str3(str2)
    println("strcat2: "+str4)
  }

  def strcat (s1:String) (s2:String) = {
    s1+s2
  }

  def strcat2 (s1:String)=(s2:String) =>s1+s2
}
