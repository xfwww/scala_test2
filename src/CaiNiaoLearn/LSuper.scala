package CaiNiaoLearn

class LSuper {
  protected def f(){
    println("f")
  }
  class Sub extends LSuper{
    f()
  }
  class Other{
    (new LSuper).f() //错误？
  }
}
