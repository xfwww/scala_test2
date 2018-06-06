package CaiNiaoLearn

object StringBuilderTest {
  def main(args: Array[String]): Unit = {
    val buf = new StringBuilder;
    buf += 'a'
    buf ++="sfhjs"
    println("buf is :"+buf.toString())
  }
}
