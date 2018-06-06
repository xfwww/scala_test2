package MatchDemo

object CaseClazz {
  //样例类
  case class Person (name : String ,age :Int)

  def main(args: Array[String]): Unit = {
    val alic = new Person("Alic",25)
    val bob = new Person("Bob",26)
    val kk = new Person("KK",34)

    for (person <- List(alic,bob,kk)){
      person match {
        case Person("Alic",25) => println("HI Alic!")
        case Person("Bob",26) => println("Hi,Bob!")
        case Person(name , age ) =>
          println("Age:"+age+" year,Name:"+name+"?")
      }
    }
  }
}
