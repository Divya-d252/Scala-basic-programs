object Dora {
  def main(args: Array[String]): Unit = {
    println("call by value")
    println(q(w(5)))
    println("call by name")
    println(a(b(5)))
    println(fun1(5,c(2)))
    println(xx(1,2,3))
    println("Named")
    println(name(y=5,x=2))
    println("default")
    println(defa(5))
    println(rec(8))
    var aa= scala.math.pow((_:Double),(_:Double))
    println(aa(4,3))
    var bb=(x:Int,y:Int) => x+(y*2)
    println(bb(6,7))
    println(ww(3)(4))
    var e=ww(5)_
    println(e(2))
    println(ss(4,5,6,7))
    println(ee(3)(4))
  }
  def ww(a:Int)(b:Int):Int={
    a*b
  }
  def ss(a:Int*):Int={
    var s=0
    for(i<-a)
      s=s+i
    s
  }
  def ee(a:Int)=(b:Int) =>  {
  a*b
  }
  def rec(x:Int):Int ={
    if(x==0)
      1
    else
      x*rec(x-1)
  }
  def defa(a:Int,b:Int=9):Int ={
    a*b
  }
  def name(x:Int,y:Int): Int ={
    x-y
  }
  def xx(x:Int,y:Int,z:Int): Int ={
    def yy(y:Int,z:Int):Int={
      y*z
    }
    yy(x,yy(y,z))
  }
  def q(y:Int):Int={
    print("ramya")
    y*3


  }
  def w(x:Int):Int={
    print("divya")
    x*x
  }
  def a(y: =>Int):Int={
    print("ramya")
    y*3


  }
  def b(x:Int):Int={
    print("divya")
    x*x
  }
  def c(x:Int):Int={
    x*4
  }
  def fun1(x:Int,y: => Int): Int ={
    x*y
  }


}
