package CaiNiaoLearn

class LPublic {
  def f(){
    println("f")
  }
  class Other {
    f()
  }
  (new LPublic).f()
}
