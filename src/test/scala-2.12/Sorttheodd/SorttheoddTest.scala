package Sorttheodd

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 12/02/2017.
  */
class SorttheoddTest extends FlatSpec with BeforeAndAfter {

  var s: Sorttheodd = _
  before {
    s = new Sorttheodd
  }

  "sortArray" should
    "Handle Example Tests" in {
    s sortArray (Array(5, 3, 2, 8, 1, 4)) shouldBe Array(1, 3, 2, 8, 5, 4)
    s sortArray (Array(5, 3, 1, 8, 0)) shouldBe Array(1, 3, 5, 8, 0)
    s sortArray (Array()) shouldBe Array()
  }
  it should "Handle Random Tests" in {
    s sortArray (Array(2, 22, 37, 11, 4, 1, 5, 0)) shouldBe Array(2, 22, 1, 5, 4, 11, 37, 0)
    s sortArray (Array(1, 111, 11, 11, 2, 1, 5, 0)) shouldBe Array(1, 1, 5, 11, 2, 11, 111, 0)
    s sortArray (Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) shouldBe Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    s sortArray (Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldBe Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    s sortArray (Array(0, 1, 2, 3, 4, 9, 8, 7, 6, 5)) shouldBe Array(0, 1, 2, 3, 4, 5, 8, 7, 6, 9)
    s sortArray (Array(79, 62, 51, 43, 76, 36, 67, 9, 96)) shouldBe Array(9, 62, 43, 51, 76, 36, 67, 79, 96)
    s sortArray (Array(6, 75, 41, 18)) shouldBe Array(6, 41, 75, 18)
    s sortArray (Array(52, 67, 72, 17, 38, 63, 31, 5, 82, 55, 21, 60, 58, 72, 48)) shouldBe Array(52, 5, 72, 17, 38, 21, 31, 55, 82, 63, 67, 60, 58, 72, 48)
  }
}
