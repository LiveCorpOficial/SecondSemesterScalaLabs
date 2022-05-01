import scala.collection.mutable.ArrayBuffer

class Passenger(growth: Int, years:Int, names: String, surname: String){
  def tell_about(): Unit ={
    println("Growth: " + growth + ". Year: " + years + ". Name: " + names + ". Surname: " + surname)
  }
}

class Transport(description: String = "nothing", human: Passenger){
  var gruz = ArrayBuffer[String]()
  def tell(): Unit = println("What do you know about him? " + " - " + description)
  def who_is_he(): Unit = println(human.tell_about())
  def add(new_gruz: String = new String): Unit = {
    gruz += new_gruz
    println("New add")
  }
  def list_gruz(): Unit ={
    println("List: ")
    for(i<-gruz.indices){
      println(gruz(i))
    }
  }
}

class Child(growth: Int, years:Int, names: String, surname: String) extends Passenger(growth: Int, years:Int, names: String, surname: String){
  override def tell_about(): Unit={
    println("Child growth: " + growth + ". Years of the child: " + years + ". Child's name: " + names + ". Surname of the child: " + surname)
  }
}

class Car(brand: String, car_class: String, human: Passenger) extends Transport(brand, human){
  override def tell(): Unit = {
    println("Machine brand: " + brand + ". Class: " + car_class)
  }
  override def who_is_he(): Unit = println("Driver: " + human.tell_about())
}

class Train(train_type: String, number_of_wagons: Int, human:Passenger) extends Transport(train_type,human){
  override def tell(): Unit ={
    println("Train type: " + train_type + ". Number of wagons: " + number_of_wagons)
  }
  override def who_is_he(): Unit = println("Driver: " + human.tell_about())
}

class Space_rocket(brand: String, total_launches: Int, human:Passenger) extends Transport(brand, human){
  override def tell(): Unit ={
    var height = 9000
    if(height>=8000) println("Vi v kocmose") else print("Vi ne v kosmose")
    println("Rocket name: " + brand + ". Total rocket launches: " + total_launches)
  }
  override def who_is_he(): Unit = println("Driver: " + human.tell_about())
}
class Airpane(brand: String, total_flights: Int, human:Passenger) extends Transport(brand, human){
  override def tell(): Unit = {
    println("Aircraft name: " + brand + ". Total flights: " + total_flights)
  }
  override def who_is_he(): Unit = println("Driver: " + human.tell_about())
}


val Pilot = new Passenger(174,54,"Yuri", "Gagarin")
val Human = new Space_rocket("Big rocket", 324, Pilot)
Human.tell()