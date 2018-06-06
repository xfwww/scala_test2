package IODemo

import scala.io.Source

object Readfromfile {
  def main(args: Array[String]): Unit = {
    println("文件内容为：")

    Source.fromFile("text.txt").foreach{
      print
    }
  }
}
