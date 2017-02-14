package PerimeterOfSquaresInaRectangle

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 14/02/2017.
  */
class PerimeterOfSquaresInaRectangleTest extends FlatSpec with BeforeAndAfter {

  var f: PerimeterOfSquaresInaRectangle = _
  before {
    f = new PerimeterOfSquaresInaRectangle
  }
  "perimeter" should "Hanlde Basic Tests" in {
    f perimeter (5) shouldBe 80
    f perimeter (7) shouldBe 216
    f perimeter (20) shouldBe 114624
    f perimeter (30) shouldBe 14098308
  }
  it should "Hanlde Random Tests" in {
    f perimeter (8) shouldBe 352
    f perimeter (64) shouldBe 179782280851408L
    f perimeter (16) shouldBe 16720
    f perimeter (44) shouldBe 11884860288L
    f perimeter (51) shouldBe 345070285084L
    f perimeter (39) shouldBe 1071657180
    f perimeter (19) shouldBe 70840
    f perimeter (18) shouldBe 43780
    f perimeter (4) shouldBe 48
    f perimeter (67) shouldBe 761569962836536L
    f perimeter (40) shouldBe 1733977744
    f perimeter (36) shouldBe 252983940
    f perimeter (20) shouldBe 114624
    f perimeter (21) shouldBe 185468
    f perimeter (53) shouldBe 903405734864L
    f perimeter (56) shouldBe 3826888104160L
    f perimeter (3) shouldBe 28
    f perimeter (25) shouldBe 1271240
    f perimeter (14) shouldBe 6384
    f perimeter (7) shouldBe 216
    f perimeter (66) shouldBe 470676121843972L
    f perimeter (17) shouldBe 27056
    f perimeter (26) shouldBe 2056912
    f perimeter (16) shouldBe 16720
    f perimeter (37) shouldBe 409336616
    f perimeter (64) shouldBe 179782280851408L
    f perimeter (30) shouldBe 14098308
    f perimeter (15) shouldBe 10332
    f perimeter (26) shouldBe 2056912
    f perimeter (50) shouldBe 213265164688L
    f perimeter (40) shouldBe 1733977744
    f perimeter (22) shouldBe 300096
    f perimeter (7) shouldBe 216
    f perimeter (15) shouldBe 10332
    f perimeter (55) shouldBe 2365146919512L
    f perimeter (48) shouldBe 81460044292L
    f perimeter (46) shouldBe 31114968192L
    f perimeter (36) shouldBe 252983940
    f perimeter (51) shouldBe 345070285084L
    f perimeter (26) shouldBe 2056912
  }
}
