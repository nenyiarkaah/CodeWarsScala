import SumStringsasNumbers._

var s = new SumStringsasNumbers

//s sumStrings("124","456")
//s sumStrings("712569312664357328695151392","8100824045303269669937")
s sumStrings("8797", "45")
s sumStrings("00103", "08567") //shouldBe "8670"
//val comb = "8797".reverse.split("").zipAll("45".reverse.split(""), "0", "0")
//  .map(c => c._1.toInt + c._2.toInt)
//
//comb.foldLeft(List[Int]())((acc, x) =>
//  acc match { case Nil => List(x)
//  case y =>
//    println("acc " + acc)
//    println("x " + x)
//    println("y " + y)
//    val prev = y.lastOption.get
//    if (prev >= 10) y.dropRight(1) :+ prev -10 :+ x+1 else y :+ x  })