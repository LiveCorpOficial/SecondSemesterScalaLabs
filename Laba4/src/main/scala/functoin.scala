class functoin {
  def print_y(x1: Double): Double = x1 match {
    case x1 if x1 >= 0 && x1 <= 0.99 => 2*x1
    case x1 if x1 >= 1 && x1 <= 1.99 => 2
    case x1 if x1 >= 2 && x1 <= 3.0 => -2*(x1-3)
    case _ => println("Нет графика")
      404
  }
}

object Start {
  def main(args: Array[String]): Unit = {
    val fx = new functoin
    println(fx.print_y(0.92))
    println(fx.print_y(1.24))
    println(fx.print_y(2.11))
  }
}