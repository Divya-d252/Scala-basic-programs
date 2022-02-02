trait a
{
  protected val x=8
  def show()
}
abstract class c{
  def show()
}
class b extends c with a{
  override val x=9
  override def show(): Unit ={
    print("ramya")
  }
}
object inher {
  def main(args: Array[String]): Unit = {
    var k=new b()
    print(k.x)
    k.show()
  }
}
