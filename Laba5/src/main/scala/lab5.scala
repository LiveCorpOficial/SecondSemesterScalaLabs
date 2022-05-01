trait inf {
  def matherFunc(obj:Any=this):Unit = obj match {
    case Account(account:String)=>
      println(account)

    case User(name:String,email:String,admin:String)=>
      println(name + " " + email+ " " + "Role: " + admin )

    case SuperUser(name:String,email:String,opportunities:String) =>
      println(name + " " + email + " " + opportunities)

    case SomthingStrage(strange:String,strange1:String)=>
    println(strange+" "+ strange1)

  }
}

  case class Account(account:String) extends inf
  case class User(name:String,email:String,admin:String) extends inf
  case class SuperUser(name:String,email:String,opportunities:String) extends inf
  case class SomthingStrage(strange:String,strange1:String) extends inf

object Start {
  def main(args: Array[String]): Unit = {
    val Acc = Account("MeAccount")
    val User1 = User("Vadim","abc@mail.ru","RandomRole")
    val SupUser = SuperUser("Vadim","bcd@mail.ru","word")
    val SmSr = SomthingStrage("VeryStrange","VeryVeryStrange")
    Acc.matherFunc()
    User1.matherFunc()
    SupUser.matherFunc()
    SmSr.matherFunc()
  }
}