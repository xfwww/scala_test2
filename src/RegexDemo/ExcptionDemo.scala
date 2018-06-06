package RegexDemo
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object ExcptionDemo {
  def test1: Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>{
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }

  def test2: Unit ={
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }

  }

  def main(args: Array[String]) {
    test1
    test2
  }
}
