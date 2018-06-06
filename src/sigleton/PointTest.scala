package sigleton

object PointTest {
  def main(args: Array[String]): Unit = {
    val point = new Point(10,20)
    point.move(10,10)

    printPoint

    def printPoint: Unit ={
      println("x的坐标："+point.x)
      println("y的坐标："+point.y)
    }
  }
}
