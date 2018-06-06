package class_object

object person_em {
  val fred = new Employee
  fred.name = "mary"
  fred.salary = 40000
  def main(args: Array[String]): Unit = {
    println(fred)
  }


}
