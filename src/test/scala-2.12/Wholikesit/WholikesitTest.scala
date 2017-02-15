package Wholikesit

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 15/02/2017.
  */
class WholikesitTest extends FlatSpec with BeforeAndAfter {

  var l: Wholikesit = _
  before {
    l = new Wholikesit
  }
  "likes" should "Hanlde Basic Tests" in {
    l likes (List()) shouldBe "no one likes this"
    l likes (List("Peter")) shouldBe "Peter likes this"
    l likes (List("Jacob", "Alex")) shouldBe "Jacob and Alex like this"
    l likes (List("Max", "John", "Mark")) shouldBe "Max, John and Mark like this"
    l likes (List("Alex", "Jacob", "Mark", "Max")) shouldBe "Alex, Jacob and 2 others like this"
  }
  it should "Handle Random Tests" in {
    l likes (List("fktevwpigih35rzwu3di")) shouldBe "fktevwpigih35rzwu3di likes this"
    l likes (List("sjolw0clooo6ao4xi529", "nev4v76g2x7q711nhfr")) shouldBe "sjolw0clooo6ao4xi529 and nev4v76g2x7q711nhfr like this"
    l likes (List("sjolw0clooo6ao4xi529", "bls7tht3vr0odsfw29",
      "dc1t9dst3ewvv6hnz5mi")) shouldBe "sjolw0clooo6ao4xi529, bls7tht3vr0odsfw29 and dc1t9dst3ewvv6hnz5mi like this"
    l likes (List("rxqcbwfgefyx1z2maemi", "gbhjqeuonn0acbx1or", "74tyetohekivifnu3di",
      "3t7wrxlah1ixlwbqpvi")) shouldBe "rxqcbwfgefyx1z2maemi, gbhjqeuonn0acbx1or and 2 others like this"
    l likes (List("ojobcw2bxbp98k9be29", "kzku3lw62xstuo9a4i", "ca19dx1hk7hpsnhfr", "gbhjqeuonn0acbx1or",
      "w9ojurmenxvi86qd7vi", "k8lrgeko7ez68xb6gvi", "7wkd6p94wj9n9x80k9", "zvdz1xzn3dqgccv7vi", "s0bbd6f9zdkpmd3g14i",
      "p9qv29tus34gzlpzxgvi", "6a8tj0wwgjs79ugcik9", "fo6sjf9xqqh8kz4fs9k9", "9axb3u9ss1gt5zsemi", "v24ytm6ayubco25u3di",
      "nev4v76g2x7q711nhfr", "oxsepvgvhjb0sqestt9", "lhk5mkiau6lcaxg8pvi", "tvk7afj506evdgyzaor", "42ry2nbto9ht7mvlsor",
      "sjlafi19e4p96ls1yvi", "93jo0af6enh1tmuc8fr", "2n8hklnemin0xnoecdi", "3t7wrxlah1ixlwbqpvi", "bie6rfew6e3gc5qxgvi",
      "thaaafdjidlvw2vs4i", "6h0tstfbdlv4ukrzfr",
      "zt1dgexoybnpeamunmi")) shouldBe "ojobcw2bxbp98k9be29, kzku3lw62xstuo9a4i and 25 others like this"
    l likes (List("sjolw0clooo6ao4xi529", "5mn6luqe85nk55crqkt9", "p9qv29tus34gzlpzxgvi", "m0hasamjyp7hsws1c3di",
      "skfo25jdkta5uhyw4s4i", "ojobcw2bxbp98k9be29", "lrxjkdkbz0cf2yb9", "lhk5mkiau6lcaxg8pvi", "z26zxgsf4ixzzaq69a4i",
      "oxsepvgvhjb0sqestt9", "pu3cd7s7eb4vdyrpb9", "nolw2zs0s35uufecdi", "b9yqtvn5lzig6cg14i", "o0w0oocs5lrtc4hd7vi",
      "oj4r2lfd6zw7svbcsor", "3t7wrxlah1ixlwbqpvi", "7z9bo0lfcy0nlba9k9", "tujznzyrqwqmu1k0529", "thaaafdjidlvw2vs4i",
      "s0bbd6f9zdkpmd3g14i", "ydxg3j4il5p2skfswcdi", "ca19dx1hk7hpsnhfr", "jrfg9p67ui11f4aq0k9", "blqvu9ulta4kg3krzfr",
      "qjkxkc562qw5crqkt9", "oyx4aytoscg9mg0t3xr", "zceq36dd83qu1w3tyb9", "rxqcbwfgefyx1z2maemi", "rqoe8cfw0nt6ek7f1or",
      "k8lrgeko7ez68xb6gvi", "kp39fg3xa7d8zq1714i", "jxrosjazs9mp3krzfr", "vw27mawgh1dlzpu2qpvi", "v2luyzrarzsxxomkj4i",
      "uvdvtewdaijomrttke29", "1dkqjtgsjamwgwcm1jor", "d45rdne505z5jao47vi", "iym6w3pomi4izf1dcxr", "0qf7im5rtfdewxw29",
      "sjlafi19e4p96ls1yvi", "h44wkkb07ef48epzaor", "xppb2tc49vzf1uz93sor", "cwqhdmk4ake8fnfusor", "zvdz1xzn3dqgccv7vi",
      "9axb3u9ss1gt5zsemi", "6o7vgygaeon6qfcrf6r", "o1nvil0pohpvqeqoxbt9", "ve3ztauf5aenx9a4i", "dc1t9dst3ewvv6hnz5mi",
      "wcd50dl4leqdsvjwcdi", "m6hslebzukjnwdygb9", "8ao0s46b8c91a9vn29", "g8oujq05i0pr1n3766r", "vrisuqdv0whlw1rwwmi",
      "6y19ro2geidd5xqd7vi", "42ry2nbto9ht7mvlsor", "ba426fiuapv184a38fr", "iza6g7cn6qc1tsjdcxr", "d79nnzvne4uvetdquxr",
      "1s8zgepag9x5uvhuayvi", "5t0aw7b15yubjh4wvcxr", "74tyetohekivifnu3di", "zvf6l1dxf3y9pk5d0a4i", "f97mzdhjoxrh33di",
      "fo6sjf9xqqh8kz4fs9k9", "bie6rfew6e3gc5qxgvi", "f70x4gwjo05pkchaor", "ez2u2ic4fu8cbnsif6r", "kzku3lw62xstuo9a4i",
      "lnzycv5ytmionsuivn29", "gw8yoed6o0s8voswcdi", "l4eoos1y4swatu51att9", "t4i21b24emdv15g66r", "tvk7afj506evdgyzaor",
      "rm3w8mwe7sxx279cnmi", "7wkd6p94wj9n9x80k9", "fktevwpigih35rzwu3di", "v24ytm6ayubco25u3di", "nev4v76g2x7q711nhfr",
      "0udd0i3fpq9fxzb0529", "gbhjqeuonn0acbx1or", "lvgdfhrh3998li60f6r", "zt1dgexoybnpeamunmi", "f3ej5a52ix9k0wgynwmi",
      "bzlab0r83hdva1t6gvi", "93jo0af6enh1tmuc8fr", "23eito7v3vmk3gnwmi", "2n8hklnemin0xnoecdi", "bls7tht3vr0odsfw29",
      "6h0tstfbdlv4ukrzfr", "6a8tj0wwgjs79ugcik9", "rvvl57fxurfzzdxi529", "n5qydtjq633knw2ke29", "6cmheqmemczhvcp7gb9",
      "3p50tku4whtzkt9", "xvyg1yzeir7bricnmi", "cqato9gfch1d669wwmi", "w9ojurmenxvi86qd7vi", "ib9tvm6cz483jxde7b9",
      "700o0lfsik9k0t9ms4i")) shouldBe "sjolw0clooo6ao4xi529, 5mn6luqe85nk55crqkt9 and 98 others like this"
  }

}
