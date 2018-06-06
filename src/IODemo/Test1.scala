package IODemo

import java.io._

object Test1 {
  def main(args: Array[String]): Unit = {
    val write = new PrintWriter(new File("text.txt"))
    write.write("sdaf")
    write.close()
  }
}
