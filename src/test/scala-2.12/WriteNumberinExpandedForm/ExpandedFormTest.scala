package WriteNumberinExpandedForm

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 09/02/2017.
  */
class ExpandedFormTest extends FlatSpec with BeforeAndAfter {

  var e: ExpandedForm = _
  before {
    e = new ExpandedForm
  }
  "add" should
    "Handle Example Tests" in {
    e expandedForm (12) shouldBe "10 + 2"
    e expandedForm (42) shouldBe "40 + 2"
    e expandedForm (70304) shouldBe "70000 + 300 + 4"
  }

  it should "Handle Basic Tests" in {
    e expandedForm (2) shouldBe "2"
    e expandedForm (12) shouldBe "10 + 2"
    e expandedForm (42) shouldBe "40 + 2"
    e expandedForm (4982342) shouldBe "4000000 + 900000 + 80000 + 2000 + 300 + 40 + 2"
  }

  it should "Handle Edge Case Zeros Tests" in {
    e expandedForm (420370022) shouldBe "400000000 + 20000000 + 300000 + 70000 + 20 + 2"
    e expandedForm (70304) shouldBe "70000 + 300 + 4"
    e expandedForm (9000000) shouldBe "9000000"
  }

  it should "Handle Edge Case Big Numbers Tests" in {
    e expandedForm (92093403034573L) shouldBe "90000000000000 + 2000000000000 + 90000000000 + 3000000000 + 400000000 + 3000000 + 30000 + 4000 + 500 + 70 + 3"
    e expandedForm (2096039485293L) shouldBe "2000000000000 + 90000000000 + 6000000000 + 30000000 + 9000000 + 400000 + 80000 + 5000 + 200 + 90 + 3"
  }

  it should "Handle Random Tests" in {
    e expandedForm (249209) shouldBe "200000 + 40000 + 9000 + 200 + 9"
    e expandedForm (18106134) shouldBe "10000000 + 8000000 + 100000 + 6000 + 100 + 30 + 4"
    e expandedForm (96654023) shouldBe "90000000 + 6000000 + 600000 + 50000 + 4000 + 20 + 3"
    e expandedForm (99782731) shouldBe "90000000 + 9000000 + 700000 + 80000 + 2000 + 700 + 30 + 1"
    e expandedForm (95645358) shouldBe "90000000 + 5000000 + 600000 + 40000 + 5000 + 300 + 50 + 8"
    e expandedForm (72297695) shouldBe "70000000 + 2000000 + 200000 + 90000 + 7000 + 600 + 90 + 5"
    e expandedForm (81832281) shouldBe "80000000 + 1000000 + 800000 + 30000 + 2000 + 200 + 80 + 1"
    e expandedForm (12627124) shouldBe "10000000 + 2000000 + 600000 + 20000 + 7000 + 100 + 20 + 4"
    e expandedForm (16172050) shouldBe "10000000 + 6000000 + 100000 + 70000 + 2000 + 50"
    e expandedForm (46724790) shouldBe "40000000 + 6000000 + 700000 + 20000 + 4000 + 700 + 90"
    e expandedForm (98687189) shouldBe "90000000 + 8000000 + 600000 + 80000 + 7000 + 100 + 80 + 9"
    e expandedForm (60608898) shouldBe "60000000 + 600000 + 8000 + 800 + 90 + 8"
    e expandedForm (22074241) shouldBe "20000000 + 2000000 + 70000 + 4000 + 200 + 40 + 1"
    e expandedForm (62335908) shouldBe "60000000 + 2000000 + 300000 + 30000 + 5000 + 900 + 8"
    e expandedForm (95814528) shouldBe "90000000 + 5000000 + 800000 + 10000 + 4000 + 500 + 20 + 8"
    e expandedForm (46653866) shouldBe "40000000 + 6000000 + 600000 + 50000 + 3000 + 800 + 60 + 6"
    e expandedForm (84324964) shouldBe "80000000 + 4000000 + 300000 + 20000 + 4000 + 900 + 60 + 4"
    e expandedForm (66967957) shouldBe "60000000 + 6000000 + 900000 + 60000 + 7000 + 900 + 50 + 7"
    e expandedForm (10650101) shouldBe "10000000 + 600000 + 50000 + 100 + 1"
    e expandedForm (72369663) shouldBe "70000000 + 2000000 + 300000 + 60000 + 9000 + 600 + 60 + 3"
    e expandedForm (68188136) shouldBe "60000000 + 8000000 + 100000 + 80000 + 8000 + 100 + 30 + 6"
    e expandedForm (56962560) shouldBe "50000000 + 6000000 + 900000 + 60000 + 2000 + 500 + 60"
    e expandedForm (93411911) shouldBe "90000000 + 3000000 + 400000 + 10000 + 1000 + 900 + 10 + 1"
    e expandedForm (86371630) shouldBe "80000000 + 6000000 + 300000 + 70000 + 1000 + 600 + 30"
    e expandedForm (30776398) shouldBe "30000000 + 700000 + 70000 + 6000 + 300 + 90 + 8"
    e expandedForm (23575181) shouldBe "20000000 + 3000000 + 500000 + 70000 + 5000 + 100 + 80 + 1"
    e expandedForm (72679718) shouldBe "70000000 + 2000000 + 600000 + 70000 + 9000 + 700 + 10 + 8"
    e expandedForm (26154359) shouldBe "20000000 + 6000000 + 100000 + 50000 + 4000 + 300 + 50 + 9"
    e expandedForm (12388805) shouldBe "10000000 + 2000000 + 300000 + 80000 + 8000 + 800 + 5"
    e expandedForm (57010031) shouldBe "50000000 + 7000000 + 10000 + 30 + 1"
    e expandedForm (80081697) shouldBe "80000000 + 80000 + 1000 + 600 + 90 + 7"
    e expandedForm (3250335) shouldBe "3000000 + 200000 + 50000 + 300 + 30 + 5"
    e expandedForm (88831441) shouldBe "80000000 + 8000000 + 800000 + 30000 + 1000 + 400 + 40 + 1"
    e expandedForm (9021136) shouldBe "9000000 + 20000 + 1000 + 100 + 30 + 6"
    e expandedForm (42521395) shouldBe "40000000 + 2000000 + 500000 + 20000 + 1000 + 300 + 90 + 5"
    e expandedForm (36857294) shouldBe "30000000 + 6000000 + 800000 + 50000 + 7000 + 200 + 90 + 4"
    e expandedForm (22290792) shouldBe "20000000 + 2000000 + 200000 + 90000 + 700 + 90 + 2"
    e expandedForm (80684697) shouldBe "80000000 + 600000 + 80000 + 4000 + 600 + 90 + 7"
    e expandedForm (41507217) shouldBe "40000000 + 1000000 + 500000 + 7000 + 200 + 10 + 7"
    e expandedForm (2389727) shouldBe "2000000 + 300000 + 80000 + 9000 + 700 + 20 + 7"
    e expandedForm (52442885) shouldBe "50000000 + 2000000 + 400000 + 40000 + 2000 + 800 + 80 + 5"
    e expandedForm (15710440) shouldBe "10000000 + 5000000 + 700000 + 10000 + 400 + 40"
    e expandedForm (57873570) shouldBe "50000000 + 7000000 + 800000 + 70000 + 3000 + 500 + 70"
    e expandedForm (15723833) shouldBe "10000000 + 5000000 + 700000 + 20000 + 3000 + 800 + 30 + 3"
    e expandedForm (84846762) shouldBe "80000000 + 4000000 + 800000 + 40000 + 6000 + 700 + 60 + 2"
    e expandedForm (22234435) shouldBe "20000000 + 2000000 + 200000 + 30000 + 4000 + 400 + 30 + 5"
    e expandedForm (29620278) shouldBe "20000000 + 9000000 + 600000 + 20000 + 200 + 70 + 8"
    e expandedForm (47983371) shouldBe "40000000 + 7000000 + 900000 + 80000 + 3000 + 300 + 70 + 1"
    e expandedForm (3283835) shouldBe "3000000 + 200000 + 80000 + 3000 + 800 + 30 + 5"
    e expandedForm (77946564) shouldBe "70000000 + 7000000 + 900000 + 40000 + 6000 + 500 + 60 + 4"
    e expandedForm (88941966) shouldBe "80000000 + 8000000 + 900000 + 40000 + 1000 + 900 + 60 + 6"
    e expandedForm (28194679) shouldBe "20000000 + 8000000 + 100000 + 90000 + 4000 + 600 + 70 + 9"
    e expandedForm (29642982) shouldBe "20000000 + 9000000 + 600000 + 40000 + 2000 + 900 + 80 + 2"
    e expandedForm (16572486) shouldBe "10000000 + 6000000 + 500000 + 70000 + 2000 + 400 + 80 + 6"
    e expandedForm (55160465) shouldBe "50000000 + 5000000 + 100000 + 60000 + 400 + 60 + 5"
    e expandedForm (37479555) shouldBe "30000000 + 7000000 + 400000 + 70000 + 9000 + 500 + 50 + 5"
    e expandedForm (36212676) shouldBe "30000000 + 6000000 + 200000 + 10000 + 2000 + 600 + 70 + 6"
    e expandedForm (79587032) shouldBe "70000000 + 9000000 + 500000 + 80000 + 7000 + 30 + 2"
    e expandedForm (13980349) shouldBe "10000000 + 3000000 + 900000 + 80000 + 300 + 40 + 9"
    e expandedForm (91375487) shouldBe "90000000 + 1000000 + 300000 + 70000 + 5000 + 400 + 80 + 7"
    e expandedForm (10175802) shouldBe "10000000 + 100000 + 70000 + 5000 + 800 + 2"
    e expandedForm (38924952) shouldBe "30000000 + 8000000 + 900000 + 20000 + 4000 + 900 + 50 + 2"
    e expandedForm (63335273) shouldBe "60000000 + 3000000 + 300000 + 30000 + 5000 + 200 + 70 + 3"
    e expandedForm (68330516) shouldBe "60000000 + 8000000 + 300000 + 30000 + 500 + 10 + 6"
    e expandedForm (86979070) shouldBe "80000000 + 6000000 + 900000 + 70000 + 9000 + 70"
    e expandedForm (94733807) shouldBe "90000000 + 4000000 + 700000 + 30000 + 3000 + 800 + 7"
    e expandedForm (6699192) shouldBe "6000000 + 600000 + 90000 + 9000 + 100 + 90 + 2"
    e expandedForm (96153256) shouldBe "90000000 + 6000000 + 100000 + 50000 + 3000 + 200 + 50 + 6"
    e expandedForm (27848942) shouldBe "20000000 + 7000000 + 800000 + 40000 + 8000 + 900 + 40 + 2"
    e expandedForm (4238805) shouldBe "4000000 + 200000 + 30000 + 8000 + 800 + 5"
    e expandedForm (34201005) shouldBe "30000000 + 4000000 + 200000 + 1000 + 5"
    e expandedForm (10474010) shouldBe "10000000 + 400000 + 70000 + 4000 + 10"
    e expandedForm (32873326) shouldBe "30000000 + 2000000 + 800000 + 70000 + 3000 + 300 + 20 + 6"
    e expandedForm (29728005) shouldBe "20000000 + 9000000 + 700000 + 20000 + 8000 + 5"
    e expandedForm (40823055) shouldBe "40000000 + 800000 + 20000 + 3000 + 50 + 5"
    e expandedForm (27252676) shouldBe "20000000 + 7000000 + 200000 + 50000 + 2000 + 600 + 70 + 6"
    e expandedForm (83240200) shouldBe "80000000 + 3000000 + 200000 + 40000 + 200"
    e expandedForm (60007047) shouldBe "60000000 + 7000 + 40 + 7"
    e expandedForm (68581222) shouldBe "60000000 + 8000000 + 500000 + 80000 + 1000 + 200 + 20 + 2"
    e expandedForm (36890306) shouldBe "30000000 + 6000000 + 800000 + 90000 + 300 + 6"
    e expandedForm (33808167) shouldBe "30000000 + 3000000 + 800000 + 8000 + 100 + 60 + 7"
    e expandedForm (56441061) shouldBe "50000000 + 6000000 + 400000 + 40000 + 1000 + 60 + 1"
    e expandedForm (78896553) shouldBe "70000000 + 8000000 + 800000 + 90000 + 6000 + 500 + 50 + 3"
    e expandedForm (43958669) shouldBe "40000000 + 3000000 + 900000 + 50000 + 8000 + 600 + 60 + 9"
    e expandedForm (76015235) shouldBe "70000000 + 6000000 + 10000 + 5000 + 200 + 30 + 5"
    e expandedForm (23410953) shouldBe "20000000 + 3000000 + 400000 + 10000 + 900 + 50 + 3"
    e expandedForm (41629112) shouldBe "40000000 + 1000000 + 600000 + 20000 + 9000 + 100 + 10 + 2"
    e expandedForm (44707223) shouldBe "40000000 + 4000000 + 700000 + 7000 + 200 + 20 + 3"
    e expandedForm (44766860) shouldBe "40000000 + 4000000 + 700000 + 60000 + 6000 + 800 + 60"
    e expandedForm (95633161) shouldBe "90000000 + 5000000 + 600000 + 30000 + 3000 + 100 + 60 + 1"
    e expandedForm (21606389) shouldBe "20000000 + 1000000 + 600000 + 6000 + 300 + 80 + 9"
    e expandedForm (1130029) shouldBe "1000000 + 100000 + 30000 + 20 + 9"
    e expandedForm (92183254) shouldBe "90000000 + 2000000 + 100000 + 80000 + 3000 + 200 + 50 + 4"
    e expandedForm (94983064) shouldBe "90000000 + 4000000 + 900000 + 80000 + 3000 + 60 + 4"
    e expandedForm (27733722) shouldBe "20000000 + 7000000 + 700000 + 30000 + 3000 + 700 + 20 + 2"
    e expandedForm (43153561) shouldBe "40000000 + 3000000 + 100000 + 50000 + 3000 + 500 + 60 + 1"
    e expandedForm (95936981) shouldBe "90000000 + 5000000 + 900000 + 30000 + 6000 + 900 + 80 + 1"
    e expandedForm (25891402) shouldBe "20000000 + 5000000 + 800000 + 90000 + 1000 + 400 + 2"
    e expandedForm (72486848) shouldBe "70000000 + 2000000 + 400000 + 80000 + 6000 + 800 + 40 + 8"
    e expandedForm (21990188) shouldBe "20000000 + 1000000 + 900000 + 90000 + 100 + 80 + 8"
  }

}
