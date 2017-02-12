package FindTheMissingLetter

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 11/02/2017.
  */
class FindMissingLetterTest extends FlatSpec with BeforeAndAfter {

  var f: FindMissingLetter = _
  before {
    f = new FindMissingLetter
  }
  "findMissingLetter" should
    "Handle Example Tests" in {
    f findMissingLetter (Array('a', 'b', 'c', 'd', 'f')) shouldBe "e"
    f findMissingLetter (Array('O', 'Q', 'R', 'S')) shouldBe "P"
  }
  it should "Handle Random Tests" in {
    f findMissingLetter (Array('I', 'J', 'L', 'M', 'N', 'O')) shouldBe "K"
    f findMissingLetter (Array('s', 'u', 'v', 'w', 'x')) shouldBe "t"
    f findMissingLetter (Array('b', 'd', 'e', 'f', 'g', 'h', 'i')) shouldBe "c"
    f findMissingLetter (Array('a', 'b', 'c', 'd', 'e', 'g')) shouldBe "f"
    f findMissingLetter (Array('c', 'd', 'e', 'f', 'g', 'h', 'j', 'k')) shouldBe "i"
    f findMissingLetter (Array('M', 'N', 'O', 'P', 'Q', 'S', 'T', 'U')) shouldBe "R"
    f findMissingLetter (Array('g', 'h', 'i', 'k')) shouldBe "j"
    f findMissingLetter (Array('G', 'H', 'I', 'K', 'L', 'M', 'N')) shouldBe "J"
    f findMissingLetter (Array('D', 'E', 'G', 'H', 'I', 'J', 'K', 'L')) shouldBe "F"
    f findMissingLetter (Array('d', 'e', 'g', 'h')) shouldBe "f"
    f findMissingLetter (Array('c', 'd', 'e', 'f', 'h', 'i')) shouldBe "g"
    f findMissingLetter (Array('G', 'I', 'J')) shouldBe "H"
    f findMissingLetter (Array('d', 'f', 'g', 'h', 'i')) shouldBe "e"
    f findMissingLetter (Array('H', 'I', 'J', 'K', 'L', 'N', 'O')) shouldBe "M"
    f findMissingLetter (Array('D', 'E', 'F', 'G', 'H', 'J', 'K')) shouldBe "I"
    f findMissingLetter (Array('P', 'R', 'S')) shouldBe "Q"
    f findMissingLetter (Array('I', 'K', 'L', 'M', 'N')) shouldBe "J"
    f findMissingLetter (Array('o', 'p', 'r', 's', 't')) shouldBe "q"
    f findMissingLetter (Array('q', 'r', 's', 'u', 'v', 'w')) shouldBe "t"
    f findMissingLetter (Array('Q', 'R', 'S', 'T', 'V')) shouldBe "U"
    f findMissingLetter (Array('r', 't', 'u', 'v', 'w')) shouldBe "s"
    f findMissingLetter (Array('d', 'e', 'f', 'h')) shouldBe "g"
    f findMissingLetter (Array('D', 'E', 'F', 'G', 'I', 'J')) shouldBe "H"
    f findMissingLetter (Array('O', 'P', 'R', 'S', 'T', 'U')) shouldBe "Q"
    f findMissingLetter (Array('j', 'k', 'm')) shouldBe "l"
    f findMissingLetter (Array('o', 'q', 'r', 's', 't', 'u')) shouldBe "p"
    f findMissingLetter (Array('B', 'C', 'D', 'E', 'G', 'H', 'I', 'J')) shouldBe "F"
    f findMissingLetter (Array('f', 'g', 'i', 'j', 'k', 'l')) shouldBe "h"
    f findMissingLetter (Array('H', 'J', 'K', 'L', 'M')) shouldBe "I"
    f findMissingLetter (Array('O', 'Q', 'R')) shouldBe "P"
  }

}
