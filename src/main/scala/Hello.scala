trait Divya
case class x(a:Int,b:Int) extends Divya
case class y(a:Int) extends Divya
case object z extends Divya
import scala.util.control.Breaks._
object Hello {
  def main(args: Array[String]): Unit = {
    /**fun1("di")
    *fun(x(4, 5))
    fun(y(4))*/
    fun(y(5))
    fun(z)
    var a=6
    while(a>0) {
      println(a)
      a-=1
    }
    breakable {
      for (i <- 10 to 1 by -1) {
        if(i==3)
          break
        print(i)
      }
    }
    var arr=Array(7,8,9)
    arr.foreach(x => print(x))
    for(i<-arr if i%2==0)
      println(i)
    var p=for(i<-1 to 10 if i%3==0) yield "h"
    println(p)
  }

  def fun(f: Divya) = f match {
    case x(a, b) => print(a + " " + b)
    case y(a) => print(a)
    case z => print("No data found")

  }

  def fun1(a: Any): Any = a match {
    case "di" => println("dd")
    case "r" => println("h")
  }



}
