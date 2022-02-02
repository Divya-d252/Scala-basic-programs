case class divyaa(s:String) extends Exception
class m{
  @throws(classOf[divyaa])
  def validate(age:Int){
    if(age<18){
      throw new divyaa("Invalid")
    }
    else{
      println("divya")
    }
  }
}
object except {
  def main(args: Array[String]): Unit = {
    var k=new m()
    try{
      k.validate(9)
    }
    catch {
      case e:Throwable => println("edghh"+e)
    }
  }
}
