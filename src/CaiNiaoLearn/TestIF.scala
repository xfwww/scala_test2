package CaiNiaoLearn

object TestIF {
  def main(args: Array[String]): Unit = {
    var x = 40;
    if(x < 20){
      println("x < 20")
    }else if(x < 30){
      println("x < 30")
    }else if(x < 40){
      println("x < 40")
    }else {
      println("x > 40")
    }

    var y = 30
    var z = 19

    if(y == 30){
      if(z == 19){
        println("ssssssss")
      }
    }
  }


}
