package class_object

class Employee extends Person{
  var salary = 0.0
  override def toString = super.toString +"[Salary="+salary+"]"

}
