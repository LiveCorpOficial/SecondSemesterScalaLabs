import scala.annotation.tailrec
import scala.math.abs
import scala.util.Random

  // Нахождение последнего эл. списка
  // Задание 1 (рекурсия)
  @tailrec
  def zd1(x: List[Int]): Int = {
  if (x.tail.nonEmpty) zd1(x.tail)
  else x.head
  }
val Stack = List(1, 1, 2, 3, 5, 8)
print(zd1(Stack))

  // Задание 1.1 (цикл)
def zd1_1(a:List[Int]):Int = {
  var i: Int = 0
  var list = a
  while (list.nonEmpty) {
    list = list.tail
    i += 1 }
  a(i-1) }
  val Stack = List(1,1,2,3,5,8)
print (zd1_1(Stack))

  // Нахождение кол-ва эл. списка
  // Задание 2 (рекурсия)
  @tailrec
  def zd2(a:List[Int], i:Int=0): Int = {
    if (a.nonEmpty)
      zd2(a.tail, i + 1) else i
  }
val Stack = List(1, 1, 2, 3, 5, 8)
print(zd2(Stack))

  // Задание 2.1 (цикл)
def zd2_1(a:List[Int]):Int = {
var i: Int = 0
  var list = a
  while(list.nonEmpty){
    list=list.tail
    i+=1
  }
  i
}
val Stack = List(1,1,2,3,5,8)
print(zd2_1(Stack))

  // Является ли список палиндромом
  // Задание 3 (рекурсия)
  def lol(a:List[Int]):Boolean = {
    var i: Int = 0
    var pop = a
    while (pop.nonEmpty) {
      pop = pop.tail
      i += 1
    }
    i -= 1
    var LastValue = a(i)
    if(LastValue==a.head) {
      var b:List[Int] = a.patch(i, Nil, 1)
      b=b.patch(0, Nil, 1)
      if(b.nonEmpty) {
        lol(b)
        1==1 } else {2==1} }
    else {2==1} }
lol(List(1, 2, 3, 2, 1))

  // Задание 3.1 (цикл)
  def zd3_1(a: List[Int]):Boolean = {
    a == a.reverse }
val Stack = List(1, 2, 3, 2, 1)
  print(zd3_1(Stack))

  // Удаление k-го эл. списка
  // Задание 4 (рекурсия)
  @tailrec
  def zd4(n: Int, a: List[Char], b: List[Char] = List(), i:Int=0): (List[Char], Char) = {
    //узнаем длину списка
    var dl = 0
    var s = a
    while (s.nonEmpty) {
      s = s.tail
      dl += 1 }
    //удаляем элемент
    if (i < dl)
      if (i != n)
        zd4(n, a, b:+a(i), i+1)
      else
        zd4(n, a, b, i+1)
      else
        (b, a(n))
  }
val Stack = List('a', 'b', 'c', 'd')
print(zd4(1, Stack))

  // Задание 4.1 (цикл)
  def zd4_1(n:Int,a:List[Char]):(List[Char],Char) = {
    (a.patch(n, Nil, 1),a(n))
  }
  val Stack = List('a', 'b', 'c', 'd')
  print(zd4_1(2,Stack))

  // Извлечь заданное кол-во эл.
  // Задание 5 (рекурсия)
  @tailrec
  def zd5(n:Int, x:List[Char], b:List[Char]=List(), i:Int=0):List[Char]= {
    //узнаем длину списка
    var dl = 0
    var a = x
    while (a.nonEmpty) {
      a = a.tail
      dl += 1 }
    //берем случайные элементы
    if (i<n)
      zd5(n, x, b:+x(Random.between(0,dl)), i+1)
    else
      b
  }
    val Stack = List('a', 'b', 'c', 'd', 'f', 'g', 'h')
    print(zd5(3, Stack))

  // Задание 5.1 (цикл)
  def zd5_1(n:Int, a:List[Symbol]):List[Symbol] = {
    var num: Int = 0
    var i: Int = 1
    var dl = a
    var b:List[Symbol] = List()
    while (dl.nonEmpty) {
      dl = dl.tail
      num += 1 }
    num -= 1
    while(i<=n) {
      print(num)
      val c = Random.between(0, num)
      b = b :+ a(c)
      i+= 1 }
    b
  }
val Stack = List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"))
print(zd5_1(3, Stack))

  // Определить является ли заданное число простым
  // Задание 6 (рекурсия)
  @tailrec
  def zd6(a :Int, b:Int=2) : Boolean = {
    if(a == 1 || a == 2)
      return true
    if (b < a - 1)
      if(a % b == 0)
        false else
        zd6(a,b+1)
    else true
  }
print(zd6(7))

  // Задание 6.1 (цикл)
  def zd6_1(i :Int) : Boolean = {
    if (i <= 1) 2==1
    else if
    (i == 2) 1==1
    else
      !(2 until i).exists(x => i % x == 0)
  }
print(zd6_1(7))

  // Реализовать метод Ньютона
  // x^3+18x-83=0
// Задание 7 (рекурсия)
@tailrec
def zd7(x: Double, eps: Double, iter:Int=0): Double = {
  var a = .0
  var b = .0
  var res = .0
  if (iter < 20000) {
    a = (x * x * x) + 18 * x - 83
    b = 3 * (x * x) + 18
    res = x - a / b
    if (abs(a) > eps)
      res
    else {
      zd7(x, eps, iter + 1)
    }
  } else
    res
}
print(zd7(83, 0.00001))

  // Задание 7.1 (цикл)
  def zd7_1(x: Double, eps: Double): Unit = {
    var a = .0
    var b = .0
    var iter = 0
    var res:Double = 0
    println("x = " + x)
    do { a = (x * x * x) + 18*x-83
      b = 3*(x * x) + 18
      res = x - a / b
      iter += 1 }
    while
    ( { abs(a) > eps && iter < 2000000 })
    print("Final: "+ iter + " "+ "iterations" + " " )
    print("Result: "+res) }
    print(zd7_1(2.9, 0.04405))