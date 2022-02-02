class divya(x:Int){
  var y=0
  def this(x:Int,y:Int){
    this(x)
    this.y=y
  }
  //println(y)
  def show(): Unit ={
    println("di",x,y)
  }
}

object divya {
  def main(args: Array[String]): Unit = {
    var k=new divya(5,6)
    var m=new divya(9)
    k.show()
    m.show()
    r(6.0)


//    divya
//    //divya.d()
//    //println(k.j+k.i)
//    //k.show()
  }
  def r(a:Double): Unit ={
    println("k")
  }
  def r(a:Int): Unit ={
    println("d")
  }
  def r(): Unit ={
    println("r")
  }

}
