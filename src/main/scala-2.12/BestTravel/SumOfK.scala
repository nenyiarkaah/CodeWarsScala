package BestTravel

/**
  * Created by Nenyi on 28/01/2017.
  */
class SumOfK {

  def chooseBestSum(t: Int, k: Int, ls: List[Int]): Option[Int] = {
    val lsCombinations: List[List[Int]] = ls.combinations(k).toList
    val sumOfLs = lsCombinations.map(l => if (l.foldLeft(0)(_ + _) <= t) l.foldLeft(0)(_ + _)) filter (_ != ())
    sumOfLs.asInstanceOf[List[Int]].sorted.lastOption
  }

}
