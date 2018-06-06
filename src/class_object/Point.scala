package class_object

class Point(xc :Int ,yc :Int) {
  //类参数xc yc，类参数在整个类中都可以访问

  var x : Int = xc
  var y : Int = yc

  def move ( dx :Int ,dy :Int ): Int ={
    x  = x + dx
    y  = y + dy
    println("x 坐标点："+x)
    println("y 坐标点："+y)

    var dist = x*x + y*y
    return dist
  }
  //定义了两个变量x,y 一个方法：move(),方法没有返回值

}
