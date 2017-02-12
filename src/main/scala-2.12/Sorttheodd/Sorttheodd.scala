package Sorttheodd

/**
  * Created by Nenyi on 12/02/2017.
  */
class Sorttheodd {

  def sortArray(array: Array[Int]) = {
    var odds = array.filter(n => n % 2 != 0).sorted
    array.zipWithIndex.foreach { case (e, i) => if (e % 2 == 0) odds = odds.patch(i, Seq(e), 0) }
    odds
  }

}
