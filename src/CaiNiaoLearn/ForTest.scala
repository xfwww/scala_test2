package CaiNiaoLearn

object ForTest {
  def main(args: Array[String]) {
    var a = 0;
    // for 循环
    for( a <- 1 to 10){
      println( "Value of b: " + a );
    }


    var c = 0;
    // for 循环
    for( c <- 1 until 10){
      println( "Value of c: " + c );
    }


    var x1 = 0;
    var x2 = 0;
    // for 循环
    for( x1 <- 1 to 3; x2 <- 1 to 3){ //以；分割不同范围
      println( "Value of x1: " + x1 );
      println( "Value of x2: " + x2 );
    }

    var m = 0;
    val numList = List(1,2,3,4,5,6);

    // for 循环
    for( m <- numList ){
      println( "Value of m: " + m );
    }

    for( m <- numList
         if m != 3; if m < 5 ){
      println( "Value of m2: " + m );
    }

  }
}
