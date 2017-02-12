package GapinPrimes

import scala.collection.immutable.Stream.Empty

/**
  * Created by Nenyi on 01/02/2017.
  */


class GapinPrimes {

  def gap(g: Int, m: Int, n: Int, l: Option[Int]): Array[Int] = {
    //    println("g " + g + " m " + m + " n " + n + " lastPrime " + lastPrime)
    val lastPrime = l match {
      case Some(x: Int) => x
      case None => 0
    }
    if (m >= n) null

    isPrime(m) match {
      case true => if (m - lastPrime == g) Array(lastPrime, m) else gap(g, m + 1, n, Some(m))
      case false => gap(g, m + 1, n, Some(lastPrime))
    }
  }

  //Java way
  def gap2(g: Int, m: Int, n: Int): Array[Int] = {
    var lastPrime = 0
    for (i <- m to n) {
      if (isPrime(i)) {
        if (i - lastPrime == g) {
          println("g " + g + " m " + m + " n " + n)
          println(lastPrime + ", " + i)
          return Array(lastPrime, i)
        }
        else lastPrime = i
      }
    }
    null
  }

  def isPrime(n: Int): Boolean = !((2 until n - 1) exists (n % _ == 0))
}
