package SumStringsasNumbers

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 13/02/2017.
  */
class SumStringsasNumbersTest extends FlatSpec with BeforeAndAfter {

  var s: SumStringsasNumbers = _
  before {
    s = new SumStringsasNumbers
  }

  "sumStrings" should "Hanlde Basic Tests" in {
    s sumStrings("123", "456") shouldBe "579"
  }
  it should "Hanlde Random Tests" in {
    s sumStrings("123", "456") shouldBe "579"
    s sumStrings("8797", "45") shouldBe "8842"
    s sumStrings("800", "9567") shouldBe "10367"
    s sumStrings("99", "1") shouldBe "100"
    s sumStrings("00103", "08567") shouldBe "8670"
  }
  it should "Hanlde Large Numbers Tests" in {
    s sumStrings("712569312664357328695151392", "8100824045303269669937") shouldBe "712577413488402631964821329"
    s sumStrings("50095301248058391139327916261", "81055900096023504197206408605") shouldBe "131151201344081895336534324866"
  }
  it should "Hanlde Empty String Test" in {
    s sumStrings("", "5") shouldBe "5"
  }
}
