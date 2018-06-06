package CaiNiaoLearn

object WhileTest {
  def main(args: Array[String]) {
    // 局部变量
    var a = 10;

    // while 循环执行
    while( a < 20 ){
      println( "Value of a: " + a );
      a = a + 1;
    }
  }
}
