package class_object

object PointTest {
  def main(args: Array[String]): Unit = {
    val pt = new Point(10,20)
    //移动到一个新的位置
    val dist: Int = pt.move(10,10)
    println(dist)
  }
}
