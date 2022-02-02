import java.io._
import scala.io.Source
import scala.util.matching.Regex
object file {
  def main(args: Array[String]): Unit = {
    var s1="divya"
    var s2="rama"
    println(s1.diff(s2))
    var l:List[Int]=List(1,2,3,4)
    println(l.foldLeft(List[Int]()) ( (z,i) => i::z ) )
    val numbers: List[Int] = List(5, 4, 8, 6, 2)
    println(numbers.foldLeft(List[Int]()) ( (z, i) => i::z ) )
    val fw = new FileWriter("test.txt", true)
    fw.write("This line appended to file!")
    fw.close()
    var i=new File(getClass.getResource("a.txt").getPath)
    var j=new File(getClass.getResource("q.csv").getPath)
    var kk=new File("/Users/divyad/Documents/sample.csv")
    var k1=Source.fromFile(j)
    var k2=Source.fromFile(j)
    var x=""
    for(i<-k2.getLines()){
      println(i)
    }
    while(k1.hasNext){
      var a=k1.next
      //println(a)
      if(a!=',') {
        x+=a
      }
      if(a==','){
        println(x)
        x=""
      }
    }
    println(x)
    var kx=Source.fromFile(kk)
    //kx.foreach(println)
    for(i<-kx.getLines()){
      var a:Array[String]=i.split(",")
      a.foreach(println)
      //println(i)
    }
//    var p=new PrintWriter(i)
//    p.write("This is divya")
//    p.close()
    var k=Source.fromFile(i)
    //k.foreach(println)
    var a="[0-9]".r
    var res:Any=" "
   for(i<-k.getLines()) {
     //println(i)
     if(i.contains("[0|8|9]")){
       println(i)
     }
//     res=a.findFirstIn(i)
//     if(res!=None) {
//       println(i)
//     }
//     if(i.startsWith("b") | i.startsWith("B"))
//    println(i)
   }
  }

}
