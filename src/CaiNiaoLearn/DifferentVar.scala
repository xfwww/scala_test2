package CaiNiaoLearn

object DifferentVar {
  def main(args: Array[String]): Unit = {
    printStrings(2737,"Java", "Scala", "Python")

    printINT(b=10 ,a=9)
  }

  def printStrings( a:Int,args:String* ) ={
    var i:Int = 0
    for(arg <- args){
      println("Arg value["+ i +"]= "+a +":"+arg )
      i = i + 1
    }
  }

  def printINT(a:Int,b:Int)={
    println(a+" is a")
    println(b+" is b")
  }
}
