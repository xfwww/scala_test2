package IODemo

object ReadFromScreen {
  def main(args: Array[String]) {
    print("请输入菜鸟教程官网 : " )
    val line = Console.readLine

    println("谢谢，你输入的是: " + line)


  }
}
