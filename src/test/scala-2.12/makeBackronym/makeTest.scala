package makeBackronym

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 29/01/2017.
  */
class makeTest extends FlatSpec with BeforeAndAfter {

  var m: make = _
  before {
    m = new make
  }
  "makeBackronym" should
    "Handle 2 Basic Tests" in {
    m makeBackronym ("interesting") shouldBe "ingestable newtonian turn eager rant eager stylish turn ingestable newtonian gregarious"

    m makeBackronym ("codewars") shouldBe "confident oscillating disturbing eager weird awesome rant stylish"
  }

  it should "Handle Basic Tests" in {
    m makeBackronym ("adh") shouldBe "awesome disturbing hippy"

    m makeBackronym ("lmnop") shouldBe "literal mustache newtonian oscillating perfect"

    m makeBackronym ("wyv") shouldBe "weird yogic volcano"

    m makeBackronym ("interesting") shouldBe "ingestable newtonian turn eager rant eager stylish turn ingestable newtonian gregarious"

    m makeBackronym ("codewars") shouldBe "confident oscillating disturbing eager weird awesome rant stylish"

    m makeBackronym ("privet") shouldBe "perfect rant ingestable volcano eager turn"

    m makeBackronym ("paka") shouldBe "perfect awesome klingon awesome"

    m makeBackronym (" ") shouldBe ""

    m makeBackronym ("ppp") shouldBe "perfect perfect perfect"

    m makeBackronym ("abcdefghijklmnopqrstuvwxyz") shouldBe "awesome beautiful confident disturbing eager fantastic gregarious hippy ingestable joke klingon literal mustache newtonian oscillating perfect queen rant stylish turn underlying volcano weird xylophone yogic zero"
  }

  it should "Handle 50 Random Tests" in {
    m makeBackronym ("hfg") shouldBe "hippy fantastic gregarious"

    m makeBackronym ("kc") shouldBe "klingon confident"

    m makeBackronym ("vhaoheuafh") shouldBe "volcano hippy awesome oscillating hippy eager underlying awesome fantastic hippy"

    m makeBackronym ("ynmt") shouldBe "yogic newtonian mustache turn"

    m makeBackronym ("afmmduyrv") shouldBe "awesome fantastic mustache mustache disturbing underlying yogic rant volcano"

    m makeBackronym ("iowrq") shouldBe "ingestable oscillating weird rant queen"

    m makeBackronym ("nwcfhsc") shouldBe "newtonian weird confident fantastic hippy stylish confident"

    m makeBackronym ("yevav") shouldBe "yogic eager volcano awesome volcano"

    m makeBackronym ("wzstyh") shouldBe "weird zero stylish turn yogic hippy"

    m makeBackronym ("vgctj") shouldBe "volcano gregarious confident turn joke"

    m makeBackronym ("jmrk") shouldBe "joke mustache rant klingon"

    m makeBackronym ("fdvfmw") shouldBe "fantastic disturbing volcano fantastic mustache weird"

    m makeBackronym ("s") shouldBe "stylish"

    m makeBackronym ("zds") shouldBe "zero disturbing stylish"

    m makeBackronym ("nk") shouldBe "newtonian klingon"

    m makeBackronym ("sdnbgkyi") shouldBe "stylish disturbing newtonian beautiful gregarious klingon yogic ingestable"

    m makeBackronym ("cg") shouldBe "confident gregarious"

    m makeBackronym ("efqpviv") shouldBe "eager fantastic queen perfect volcano ingestable volcano"

    m makeBackronym ("sm") shouldBe "stylish mustache"

    m makeBackronym ("mnp") shouldBe "mustache newtonian perfect"

    m makeBackronym ("yrltigzy") shouldBe "yogic rant literal turn ingestable gregarious zero yogic"

    m makeBackronym ("kvktbmxuzr") shouldBe "klingon volcano klingon turn beautiful mustache xylophone underlying zero rant"

    m makeBackronym ("yqeenagm") shouldBe "yogic queen eager eager newtonian awesome gregarious mustache"

    m makeBackronym ("xxcdfuwg") shouldBe "xylophone xylophone confident disturbing fantastic underlying weird gregarious"

    m makeBackronym ("nkwthwkun") shouldBe "newtonian klingon weird turn hippy weird klingon underlying newtonian"

    m makeBackronym ("lzlomld") shouldBe "literal zero literal oscillating mustache literal disturbing"

    m makeBackronym ("ufl") shouldBe "underlying fantastic literal"

    m makeBackronym ("njj") shouldBe "newtonian joke joke"

    m makeBackronym ("msmctobn") shouldBe "mustache stylish mustache confident turn oscillating beautiful newtonian"

    m makeBackronym ("szcfgn") shouldBe "stylish zero confident fantastic gregarious newtonian"

    m makeBackronym ("wekeyc") shouldBe "weird eager klingon eager yogic confident"

    m makeBackronym ("zkpess") shouldBe "zero klingon perfect eager stylish stylish"

    m makeBackronym ("mrepxbp") shouldBe "mustache rant eager perfect xylophone beautiful perfect"

    m makeBackronym ("gyq") shouldBe "gregarious yogic queen"

    m makeBackronym ("ngogwcx") shouldBe "newtonian gregarious oscillating gregarious weird confident xylophone"

    m makeBackronym ("vgeng") shouldBe "volcano gregarious eager newtonian gregarious"

    m makeBackronym ("ay") shouldBe "awesome yogic"

    m makeBackronym ("ndlws") shouldBe "newtonian disturbing literal weird stylish"

    m makeBackronym ("oejfilsy") shouldBe "oscillating eager joke fantastic ingestable literal stylish yogic"

    m makeBackronym ("sccx") shouldBe "stylish confident confident xylophone"
  }
}


