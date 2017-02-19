package IsThisATriangle

import org.scalatest.{BeforeAndAfter, FlatSpec, FunSuite}
import org.scalatest.Matchers._

/**
  * Created by Nenyi on 19/02/2017.
  */
class IsThisATriangleTest extends FlatSpec with BeforeAndAfter {
  var i: IsThisATriangle = _
  before {
    i = new IsThisATriangle
  }
  "isTriangle" should
    "Handle Example Tests" in {
    i isTriangle(1, 2, 2) shouldBe true
    i isTriangle(7, 2, 2) shouldBe false
  }
  it should "Handle Public Test" in {
    i isTriangle(1, 2, 2) shouldBe true
    i isTriangle(7, 2, 2) shouldBe false
  }
  it should "Handle Test 1" in {
    i isTriangle(1, 2, 3) shouldBe false
    i isTriangle(1, 3, 2) shouldBe false
    i isTriangle(3, 1, 2) shouldBe false
    i isTriangle(5, 1, 2) shouldBe false
    i isTriangle(1, 2, 5) shouldBe false
    i isTriangle(2, 5, 1) shouldBe false
  }
  it should "Handle Test 2" in {
    i isTriangle(4, 2, 3) shouldBe true
    i isTriangle(5, 1, 5) shouldBe true
    i isTriangle(2, 2, 2) shouldBe true
  }
  it should "Handle Test for negative values" in {
    i isTriangle(-1, 2, 3) shouldBe false
    i isTriangle(1, -2, 3) shouldBe false
    i isTriangle(1, 2, -3) shouldBe false
    i isTriangle(-5, 1, 3) shouldBe false
    i isTriangle(0, 2, 3) shouldBe false
  }
}
