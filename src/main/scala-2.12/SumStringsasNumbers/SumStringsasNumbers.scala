package SumStringsasNumbers

/**
  * Created by Nenyi on 13/02/2017.
  */
class SumStringsasNumbers {
  def sumStrings(a: String, b: String) = {
    val c = if (a != "") a else "0"
    val d = if (b != "") b else "0"
    val comb = c.reverse.split("").zipAll(d.reverse.split(""), "0", "0")
      .map(e => e._1.toInt + e._2.toInt)
    val combined = comb.foldLeft(List[Int]())((acc, x) =>
      acc match {
        case Nil => List(x)
        case y =>
          val prev = y.lastOption.get
          if (prev >= 10) y.dropRight(1) :+ prev - 10 :+ x + 1 else y :+ x
      })
    combined.reverse.mkString("").replaceFirst("^0*", "")
  }
}
