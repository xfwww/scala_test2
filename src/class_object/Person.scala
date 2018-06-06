package class_object

class Person {
  var name = ""

  override def toString = getClass.getName + "[name=" +name+"]"
}

