package PerimeterOfSquaresInaRectangle

/**
  * Created by Nenyi on 14/02/2017.
  */
class PerimeterOfSquaresInaRectangle {
  def perimeter(n: Int): BigInt = {
    println("n " + n)
    val f = fib.take(n + 2).toList
    return 4 * f.sum
  }

  val fib: Stream[BigInt] = 0 #:: 1 #:: (fib zip fib.tail).map { t => t._1 + t._2 }
}
