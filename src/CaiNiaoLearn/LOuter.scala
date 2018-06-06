package CaiNiaoLearn

class LOuter {
  class Inner{
    private def f(): Unit = {
      println("inner class")
    }
    class InnerMost{
      f() //正确
    }
  }
  //(new Inner).f() // 错误
}
