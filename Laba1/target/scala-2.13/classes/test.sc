def lol(a:List[Int]):Int = { var i: Int = 0
  var pop = a
  while (pop.nonEmpty) { pop = pop.tail
    i += 1 }
  a(i-1) }
  lol(List(32,24,5,7,8,9))