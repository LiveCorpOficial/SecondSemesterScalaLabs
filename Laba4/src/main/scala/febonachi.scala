class febonachi(j: Int) {
    var a4: Array[Int] = new Array[Int](j)
    a4(0)=0
    a4(1)=0
    def start(n: Int): Unit =  n match {
      case n if a4(0)==0 && a4(1)==0 => a4(0)=1; a4(1)=1; print(a4(0)+" "+a4(1)); start(n)
      case n if a4(0)!=0 && a4(1)!=0 =>
        for( i <- 2 until n )
        {
          a4(i) = a4(i-1) + a4(i-2)
          print(" "+a4(i)+" ")
        }
      case _ => println("ошибка")
    }
}

object Start2 {
  def main(args: Array[String]): Unit = {
    val feb = new febonachi(100)
      feb.start(50)
  }
}