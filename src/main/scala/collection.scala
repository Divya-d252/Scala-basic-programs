//import sun.misc.Queue
import scala.collection.immutable._
//import scala.collection.mutable._
object coll {

  def main(args: Array[String]): Unit = {
    var ttt=(1,2,8,9)
    println(ttt._3)
    ttt.productIterator.foreach(println)
    var mm=Map(1->"divya")
    var mm1=Map((1,"divya"),(2,"ramya"))
    var mm2=mm1+(7->"gsgxh")
    var mm4=mm2-(7)
    println(mm4)
    println(mm1.keysIterator.max)
    println(mm4(1))
    var a=Array(1,2,3)
    var b=new Array[Int](5)
    var n=9.98776
    val st=(1 to 10).toStream
    println(st)
    var ll=Queue(1,2,3)
    var pp=ll.enqueue(7)
    var tt=pp.dequeue
    pp.foreach(println)
    println(tt)
    var s="agdvhcaehfch adhf"
    println(s"This \nis =${1+1} $s")
    println(f"$n%.2f")
    println(raw"This \nis =(1+1) $s")
    println(s.substring(0,8))
    a.foreach(println)
    b.foreach(println)
    var c=Array.ofDim[Int](3,3)
    for(i<-c){
      for(j<-i){
        print(j)
      }
    }
    var d=Array.ofDim[Int](3,3)
    c=Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
    d(0)=Array(1,4,1)
    d(1)=Array(5,2,8)
    d(2)=Array(7,0,3)
    for(i<-d) {
      for (j <- i) {
        print(j)
      }
    }
    var e=Array.ofDim[Int](3,3)

    //d.foreach(println)
    for(i<-0 to 2){
      for(j<-0 to 2){
        e(i)(j)=0
        for(k<-0 to 2) {
          e(i)(j) = e(i)(j)+(c(i)(k) * d(k)(j))
          print(e(i)(j),  " ")
        }
      }
      println()
    }
    for(i<-e) {
      for (j <- i) {
        print(j+" ")
      }
    }
  }

}
