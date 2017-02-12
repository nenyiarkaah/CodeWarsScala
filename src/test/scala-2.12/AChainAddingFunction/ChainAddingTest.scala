package AChainAddingFunction

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 08/02/2017.
  */
class ChainAddingTest extends FlatSpec with BeforeAndAfter {

  var c: ChainAdding = _
  before {
    c = new ChainAdding
  }
  "add" should
    "Handle Example Tests" in {
    c add (1) shouldBe 1
    c add(1, 2) shouldBe 3
    c add(1, 2, 3) shouldBe 6
  }
  it should "Handle Basic Tests" in {
    c add(1, 2, 3, 4); // 10
    c add(1, 2, 3, 4, 5); // 15
  }

  it should "be able to store the returned values and reuse them 1" in {
    val addTwo = c add (2)
    addTwo + 5 shouldBe 7
  }

  it should "be able to store the returned values and reuse them 2" in {
    val addTwo = (n: Int) => c add (n) + 2
    addTwo(3) shouldBe 5
  }

  it should "be able to store the returned values and reuse them 3" in {
    val addTwo = (n: Int) => c add(2, n)
    addTwo(4) shouldBe 6
  }

  it should "be able to store the returned values and reuse them 4" in {
    val addTwo = (n: Int, m: Int) => c add(2, n, m)
    addTwo(4, 5) shouldBe 11
  }

  it should "be able to store the returned values and reuse them 5" in {
    val addTwo = (n: Seq[Int]) => c add(2, n.sum)
    addTwo(Seq(4, 4, 5, 10)) shouldBe 25
  }

}
