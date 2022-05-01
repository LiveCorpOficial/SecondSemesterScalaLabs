import scala.annotation.tailrec

object Main extends App {
  @tailrec
  def each(cond: => Boolean)(body: => Unit): Unit = {
    if (!cond) {
      println("nil")
    } else {
      body
      each(cond)(body)
    }
  }
  var mass = Array(1, 2, 3, 5, 6, 7, 10, 111)
  each(!mass.isEmpty) {
    if(mass.last % 2 == 0){
      println(math.pow(mass.last,2))
    } else {
    println("mass[" + (mass.length-1) + "] " + mass.last)}
    mass = mass.dropRight(1)
  }
}