package PerimeterOfSquaresInaRectangle

/**
  * Created by Nenyi on 14/02/2017.
  */
class PerimeterOfSquaresInaRectangle {
  def perimeter(n: Int): BigInt = {
    val f = fib.take(n + 2).toList
    return 4 * f.sum
  }

  val fib: Stream[BigInt] = 0 #:: 1 #:: (fib zip fib.tail).map { t => t._1 + t._2 }

  //recursive old way
  def fib2(n: BigInt): List[BigInt] = {
    def fibHelper(n: BigInt, prev: BigInt = 0, next: BigInt = 1): List[BigInt] = {
      n match {
        case x if (x == 0) => List[BigInt](prev)
        case _ => prev :: fibHelper(n - 1, next + prev, prev)
      }
    }

    fibHelper(n)
  }
}
