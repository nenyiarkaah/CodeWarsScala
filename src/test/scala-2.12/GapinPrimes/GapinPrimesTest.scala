package GapinPrimes

import TheCouponCode.CouponCode
import org.scalatest.{BeforeAndAfter, FlatSpec, FunSuite}
import org.scalatest.Matchers._

/**
  * Created by Nenyi on 01/02/2017.
  */
class GapinPrimesTest extends FlatSpec with BeforeAndAfter {

  var g: GapinPrimes = _
  before {
    g = new GapinPrimes
  }
  "gap" should
    "Handle Example Tests" in {
    g gap(2, 100, 110, None) shouldBe Array(101, 103)
    g gap(4, 100, 110, None) shouldBe Array(103, 107)
    g gap(6, 100, 110, None) shouldBe Array(131, 137)
    g gap(8, 300, 400, None) shouldBe Array(359, 367)
    g gap(10, 300, 400, None) shouldBe Array(337, 347)
    g gap(4, 30000, 100000, None) shouldBe Array(30109, 30113)
    g gap(6, 30000, 100000, None) shouldBe Array(30091, 30097)
    g gap(8, 30000, 100000, None) shouldBe Array(30161, 30169)
    g gap(11, 30000, 100000, None) shouldBe None
    g gap(2, 10000000, 11000000, None) shouldBe Array(10000139, 10000141)
  }

  it should "Handle Random Tests" in {
    g gap(2, 456297, 556297, None) shouldBe Array(456557, 456559)
    g gap(4, 456297, 556297, None) shouldBe Array(456349, 456353)
    g gap(6, 456297, 556297, None) shouldBe Array(456403, 456409)
    g gap(8, 456297, 556297, None) shouldBe Array(457013, 457021)
    g gap(4, 457297, 466297, None) shouldBe Array(457363, 457367)
    g gap(2, 133357, 233357, None) shouldBe Array(133541, 133543)
    g gap(4, 133357, 233357, None) shouldBe Array(133387, 133391)
    g gap(6, 133357, 233357, None) shouldBe Array(133493, 133499)
    g gap(8, 133357, 233357, None) shouldBe Array(133379, 133387)
    g gap(2, 134357, 143357, None) shouldBe Array(134369, 134371)
    g gap(2, 791263, 891263, None) shouldBe Array(791309, 791311)
    g gap(4, 791263, 891263, None) shouldBe Array(791317, 791321)
    g gap(6, 791263, 891263, None) shouldBe Array(791311, 791317)
    g gap(8, 791263, 891263, None) shouldBe Array(791411, 791419)
    g gap(2, 792263, 801263, None) shouldBe Array(792299, 792301)
    g gap(2, 646889, 746889, None) shouldBe Array(646979, 646981)
    g gap(4, 646889, 746889, None) shouldBe Array(646909, 646913)
    g gap(6, 646889, 746889, None) shouldBe Array(647033, 647039)
    g gap(8, 646889, 746889, None) shouldBe Array(646889, 646897)
    g gap(2, 647889, 656889, None) shouldBe Array(647891, 647893)
    g gap(2, 999465, 1099465, None) shouldBe Array(999611, 999613)
    g gap(4, 999465, 1099465, None) shouldBe Array(999667, 999671)
    g gap(6, 999465, 1099465, None) shouldBe Array(999721, 999727)
    g gap(8, 999465, 1099465, None) shouldBe Array(999491, 999499)
    g gap(2, 1000465, 1009465, None) shouldBe Array(1000577, 1000579)
    g gap(2, 947445, 1047445, None) shouldBe Array(947741, 947743)
    g gap(4, 947445, 1047445, None) shouldBe Array(947647, 947651)
    g gap(6, 947445, 1047445, None) shouldBe Array(947621, 947627)
    g gap(8, 947445, 1047445, None) shouldBe Array(947501, 947509)
    g gap(2, 948445, 957445, None) shouldBe Array(948797, 948799)
    g gap(2, 443598, 543598, None) shouldBe Array(443687, 443689)
    g gap(4, 443598, 543598, None) shouldBe Array(443749, 443753)
    g gap(6, 443598, 543598, None) shouldBe Array(443603, 443609)
    g gap(8, 443598, 543598, None) shouldBe Array(443909, 443917)
    g gap(2, 444598, 453598, None) shouldBe Array(444791, 444793)
    g gap(2, 273199, 373199, None) shouldBe Array(273269, 273271)
    g gap(4, 273199, 373199, None) shouldBe Array(273517, 273521)
    g gap(6, 273199, 373199, None) shouldBe Array(273283, 273289)
    g gap(8, 273199, 373199, None) shouldBe Array(273359, 273367)
    g gap(2, 274199, 283199, None) shouldBe Array(274199, 274201)
    g gap(2, 42625, 142625, None) shouldBe Array(42641, 42643)
    g gap(4, 42625, 142625, None) shouldBe Array(42697, 42701)
    g gap(6, 42625, 142625, None) shouldBe Array(42643, 42649)
    g gap(8, 42625, 142625, None) shouldBe Array(42689, 42697)
    g gap(2, 43625, 52625, None) shouldBe Array(43649, 43651)
    g gap(2, 28470, 128470, None) shouldBe Array(28547, 28549)
    g gap(4, 28470, 128470, None) shouldBe Array(28513, 28517)
    g gap(6, 28470, 128470, None) shouldBe Array(28493, 28499)
    g gap(8, 28470, 128470, None) shouldBe Array(28649, 28657)
    g gap(4, 29470, 38470, None) shouldBe Array(29527, 29531)
    g gap(2, 476827, 576827, None) shouldBe Array(476849, 476851)
    g gap(4, 476827, 576827, None) shouldBe Array(476887, 476891)
    g gap(6, 476827, 576827, None) shouldBe Array(476863, 476869)
    g gap(8, 476827, 576827, None) shouldBe Array(476921, 476929)
    g gap(2, 477827, 486827, None) shouldBe Array(478067, 478069)
    g gap(2, 866441, 966441, None) shouldBe Array(866639, 866641)
    g gap(4, 866441, 966441, None) shouldBe Array(866689, 866693)
    g gap(6, 866441, 966441, None) shouldBe Array(866471, 866477)
    g gap(8, 866441, 966441, None) shouldBe Array(866573, 866581)
    g gap(2, 867441, 876441, None) shouldBe Array(867509, 867511)
    g gap(2, 920778, 1020778, None) shouldBe Array(920789, 920791)
    g gap(4, 920778, 1020778, None) shouldBe Array(920947, 920951)
    g gap(6, 920778, 1020778, None) shouldBe Array(920783, 920789)
    g gap(8, 920778, 1020778, None) shouldBe Array(920963, 920971)
    g gap(2, 921778, 930778, None) shouldBe Array(921839, 921841)
    g gap(2, 958914, 1058914, None) shouldBe Array(958931, 958933)
    g gap(4, 958914, 1058914, None) shouldBe Array(958963, 958967)
    g gap(6, 958914, 1058914, None) shouldBe Array(958957, 958963)
    g gap(8, 958914, 1058914, None) shouldBe Array(959219, 959227)
    g gap(4, 959914, 968914, None) shouldBe Array(960049, 960053)
    g gap(2, 401802, 501802, None) shouldBe Array(401957, 401959)
    g gap(4, 401802, 501802, None) shouldBe Array(401809, 401813)
    g gap(6, 401802, 501802, None) shouldBe Array(401861, 401867)
    g gap(8, 401802, 501802, None) shouldBe Array(401909, 401917)
    g gap(4, 402802, 411802, None) shouldBe Array(402847, 402851)
    g gap(2, 635699, 735699, None) shouldBe Array(635729, 635731)
    g gap(4, 635699, 735699, None) shouldBe Array(635707, 635711)
    g gap(6, 635699, 735699, None) shouldBe Array(635731, 635737)
    g gap(8, 635699, 735699, None) shouldBe Array(635801, 635809)
    g gap(4, 636699, 645699, None) shouldBe Array(636817, 636821)
    g gap(2, 688466, 788466, None) shouldBe Array(689459, 689461)
    g gap(4, 688466, 788466, None) shouldBe Array(688627, 688631)
    g gap(6, 688466, 788466, None) shouldBe Array(688621, 688627)
    g gap(8, 688466, 788466, None) shouldBe Array(688661, 688669)
    g gap(2, 689466, 698466, None) shouldBe Array(689597, 689599)
    g gap(2, 461714, 561714, None) shouldBe Array(461801, 461803)
    g gap(4, 461714, 561714, None) shouldBe Array(461887, 461891)
    g gap(6, 461714, 561714, None) shouldBe Array(461971, 461977)
    g gap(8, 461714, 561714, None) shouldBe Array(462191, 462199)
    g gap(4, 462714, 471714, None) shouldBe Array(463339, 463343)
    g gap(2, 119147, 219147, None) shouldBe Array(119291, 119293)
    g gap(4, 119147, 219147, None) shouldBe Array(119179, 119183)
    g gap(6, 119147, 219147, None) shouldBe Array(119173, 119179)
    g gap(8, 119147, 219147, None) shouldBe Array(119183, 119191)
    g gap(4, 120147, 129147, None) shouldBe Array(120163, 120167)
    g gap(2, 732012, 832012, None) shouldBe Array(732077, 732079)
    g gap(4, 732012, 832012, None) shouldBe Array(732073, 732077)
    g gap(6, 732012, 832012, None) shouldBe Array(732023, 732029)
    g gap(8, 732012, 832012, None) shouldBe Array(732323, 732331)
    g gap(2, 733012, 742012, None) shouldBe Array(733097, 733099)
    g gap(2, 52034, 152034, None) shouldBe Array(52067, 52069)
    g gap(4, 52034, 152034, None) shouldBe Array(52177, 52181)
    g gap(6, 52034, 152034, None) shouldBe Array(52051, 52057)
    g gap(8, 52034, 152034, None) shouldBe Array(52259, 52267)
    g gap(2, 53034, 62034, None) shouldBe Array(53087, 53089)
    g gap(2, 94954, 194954, None) shouldBe Array(95087, 95089)
    g gap(4, 94954, 194954, None) shouldBe Array(94999, 95003)
    g gap(6, 94954, 194954, None) shouldBe Array(94993, 94999)
    g gap(8, 94954, 194954, None) shouldBe Array(95063, 95071)
    g gap(4, 95954, 104954, None) shouldBe Array(96013, 96017)
    g gap(2, 498239, 598239, None) shouldBe Array(498257, 498259)
    g gap(4, 498239, 598239, None) shouldBe Array(498397, 498401)
    g gap(6, 498239, 598239, None) shouldBe Array(498361, 498367)
    g gap(8, 498239, 598239, None) shouldBe Array(498923, 498931)
    g gap(2, 499239, 508239, None) shouldBe Array(499361, 499363)
    g gap(2, 918611, 1018611, None) shouldBe Array(918677, 918679)
    g gap(4, 918611, 1018611, None) shouldBe Array(918679, 918683)
    g gap(6, 918611, 1018611, None) shouldBe Array(918641, 918647)
    g gap(8, 918611, 1018611, None) shouldBe Array(918779, 918787)
    g gap(2, 919611, 928611, None) shouldBe Array(919691, 919693)
    g gap(2, 416100, 516100, None) shouldBe Array(416147, 416149)
    g gap(4, 416100, 516100, None) shouldBe Array(416149, 416153)
    g gap(6, 416100, 516100, None) shouldBe Array(416153, 416159)
    g gap(8, 416100, 516100, None) shouldBe Array(416159, 416167)
    g gap(4, 417100, 426100, None) shouldBe Array(417169, 417173)
    g gap(2, 755502, 855502, None) shouldBe Array(755567, 755569)
    g gap(4, 755502, 855502, None) shouldBe Array(755593, 755597)
    g gap(6, 755502, 855502, None) shouldBe Array(755561, 755567)
    g gap(8, 755502, 855502, None) shouldBe Array(755759, 755767)
    g gap(2, 756502, 765502, None) shouldBe Array(757109, 757111)
    g gap(2, 650076, 750076, None) shouldBe Array(650327, 650329)
    g gap(4, 650076, 750076, None) shouldBe Array(650179, 650183)
    g gap(6, 650076, 750076, None) shouldBe Array(650183, 650189)
    g gap(8, 650076, 750076, None) shouldBe Array(650099, 650107)
    g gap(4, 651076, 660076, None) shouldBe Array(651139, 651143)
    g gap(2, 340483, 440483, None) shouldBe Array(340577, 340579)
    g gap(4, 340483, 440483, None) shouldBe Array(340573, 340577)
    g gap(6, 340483, 440483, None) shouldBe Array(340643, 340649)
    g gap(8, 340483, 440483, None) shouldBe Array(340583, 340591)
    g gap(2, 341483, 350483, None) shouldBe Array(341771, 341773)
    g gap(2, 882339, 982339, None) shouldBe Array(882389, 882391)
    g gap(4, 882339, 982339, None) shouldBe Array(882697, 882701)
    g gap(6, 882339, 982339, None) shouldBe Array(882433, 882439)
    g gap(8, 882339, 982339, None) shouldBe Array(882359, 882367)
    g gap(2, 883339, 892339, None) shouldBe Array(883409, 883411)
    g gap(2, 472747, 572747, None) shouldBe Array(472907, 472909)
    g gap(4, 472747, 572747, None) shouldBe Array(473197, 473201)
    g gap(6, 472747, 572747, None) shouldBe Array(472793, 472799)
    g gap(8, 472747, 572747, None) shouldBe Array(473159, 473167)
    g gap(2, 473747, 482747, None) shouldBe Array(473927, 473929)
    g gap(2, 146580, 246580, None) shouldBe Array(146681, 146683)
    g gap(4, 146580, 246580, None) shouldBe Array(146677, 146681)
    g gap(6, 146580, 246580, None) shouldBe Array(146603, 146609)
    g gap(8, 146580, 246580, None) shouldBe Array(146609, 146617)
    g gap(2, 147580, 156580, None) shouldBe Array(147671, 147673)
    g gap(2, 62813, 162813, None) shouldBe Array(62927, 62929)
    g gap(4, 62813, 162813, None) shouldBe Array(62869, 62873)
    g gap(6, 62813, 162813, None) shouldBe Array(62897, 62903)
    g gap(8, 62813, 162813, None) shouldBe Array(62819, 62827)
    g gap(2, 63813, 72813, None) shouldBe Array(63839, 63841)
    g gap(2, 437911, 537911, None) shouldBe Array(438047, 438049)
    g gap(4, 437911, 537911, None) shouldBe Array(438439, 438443)
    g gap(6, 437911, 537911, None) shouldBe Array(437947, 437953)
    g gap(8, 437911, 537911, None) shouldBe Array(438203, 438211)
    g gap(2, 438911, 447911, None) shouldBe Array(439007, 439009)
    g gap(2, 754313, 854313, None) shouldBe Array(754379, 754381)
    g gap(4, 754313, 854313, None) shouldBe Array(754333, 754337)
    g gap(6, 754313, 854313, None) shouldBe Array(754337, 754343)
    g gap(8, 754313, 854313, None) shouldBe Array(755441, 755449)
    g gap(2, 755313, 764313, None) shouldBe Array(755399, 755401)
    g gap(2, 747571, 847571, None) shouldBe Array(747827, 747829)
    g gap(4, 747571, 847571, None) shouldBe Array(747583, 747587)
    g gap(6, 747571, 847571, None) shouldBe Array(747673, 747679)
    g gap(8, 747571, 847571, None) shouldBe Array(747611, 747619)
    g gap(4, 748571, 757571, None) shouldBe Array(748609, 748613)
    g gap(2, 289093, 389093, None) shouldBe Array(289109, 289111)
    g gap(4, 289093, 389093, None) shouldBe Array(289099, 289103)
    g gap(6, 289093, 389093, None) shouldBe Array(289103, 289109)
    g gap(8, 289093, 389093, None) shouldBe Array(289181, 289189)
    g gap(2, 290093, 299093, None) shouldBe Array(290441, 290443)
    g gap(2, 364067, 464067, None) shouldBe Array(364127, 364129)
    g gap(4, 364067, 464067, None) shouldBe Array(364069, 364073)
    g gap(6, 364067, 464067, None) shouldBe Array(364073, 364079)
    g gap(8, 364067, 464067, None) shouldBe Array(364313, 364321)
    g gap(4, 365067, 374067, None) shouldBe Array(365293, 365297)
    g gap(2, 423324, 523324, None) shouldBe Array(423461, 423463)
    g gap(4, 423324, 523324, None) shouldBe Array(423427, 423431)
    g gap(6, 423324, 523324, None) shouldBe Array(423341, 423347)
    g gap(8, 423324, 523324, None) shouldBe Array(423431, 423439)
    g gap(4, 424324, 433324, None) shouldBe Array(424339, 424343)
    g gap(2, 808872, 908872, None) shouldBe Array(808991, 808993)
    g gap(4, 808872, 908872, None) shouldBe Array(808957, 808961)
    g gap(6, 808872, 908872, None) shouldBe Array(809087, 809093)
    g gap(8, 808872, 908872, None) shouldBe Array(809093, 809101)
    g gap(2, 809872, 818872, None) shouldBe Array(809981, 809983)
    g gap(2, 411549, 511549, None) shouldBe Array(411611, 411613)
    g gap(4, 411549, 511549, None) shouldBe Array(411613, 411617)
    g gap(6, 411549, 511549, None) shouldBe Array(411557, 411563)
    g gap(8, 411549, 511549, None) shouldBe Array(411569, 411577)
    g gap(2, 412549, 421549, None) shouldBe Array(412589, 412591)
    g gap(2, 897671, 997671, None) shouldBe Array(897707, 897709)
    g gap(4, 897671, 997671, None) shouldBe Array(897703, 897707)
    g gap(6, 897671, 997671, None) shouldBe Array(897881, 897887)
    g gap(8, 897671, 997671, None) shouldBe Array(897899, 897907)
    g gap(2, 898671, 907671, None) shouldBe Array(899159, 899161)
    g gap(2, 888978, 988978, None) shouldBe Array(889037, 889039)
    g gap(4, 888978, 988978, None) shouldBe Array(888997, 889001)
    g gap(6, 888978, 988978, None) shouldBe Array(888983, 888989)
    g gap(8, 888978, 988978, None) shouldBe Array(888989, 888997)
    g gap(4, 889978, 898978, None) shouldBe Array(890107, 890111)
    g gap(2, 383901, 483901, None) shouldBe Array(384257, 384259)
    g gap(4, 383901, 483901, None) shouldBe Array(383983, 383987)
    g gap(6, 383901, 483901, None) shouldBe Array(383917, 383923)
    g gap(8, 383901, 483901, None) shouldBe Array(383909, 383917)
    g gap(2, 384901, 393901, None) shouldBe Array(385079, 385081)
    g gap(2, 988509, 1088509, None) shouldBe Array(988577, 988579)
    g gap(4, 988509, 1088509, None) shouldBe Array(988579, 988583)
    g gap(6, 988509, 1088509, None) shouldBe Array(988571, 988577)
    g gap(8, 988509, 1088509, None) shouldBe Array(988541, 988549)
    g gap(4, 989509, 998509, None) shouldBe Array(989557, 989561)
    g gap(2, 273789, 373789, None) shouldBe Array(273899, 273901)
    g gap(4, 273789, 373789, None) shouldBe Array(273967, 273971)
    g gap(6, 273789, 373789, None) shouldBe Array(273797, 273803)
    g gap(8, 273789, 373789, None) shouldBe Array(273971, 273979)
    g gap(2, 274789, 283789, None) shouldBe Array(274829, 274831)
    g gap(2, 159102, 259102, None) shouldBe Array(159167, 159169)
    g gap(4, 159102, 259102, None) shouldBe Array(159157, 159161)
    g gap(6, 159102, 259102, None) shouldBe Array(159113, 159119)
    g gap(8, 159102, 259102, None) shouldBe Array(159311, 159319)
    g gap(2, 160102, 169102, None) shouldBe Array(160481, 160483)
    g gap(2, 759300, 859300, None) shouldBe Array(759431, 759433)
    g gap(4, 759300, 859300, None) shouldBe Array(759397, 759401)
    g gap(6, 759300, 859300, None) shouldBe Array(759371, 759377)
    g gap(8, 759300, 859300, None) shouldBe Array(759581, 759589)
    g gap(4, 760300, 769300, None) shouldBe Array(760453, 760457)
    g gap(2, 753287, 853287, None) shouldBe Array(753437, 753439)
    g gap(4, 753287, 853287, None) shouldBe Array(753583, 753587)
    g gap(6, 753287, 853287, None) shouldBe Array(753367, 753373)
    g gap(8, 753287, 853287, None) shouldBe Array(753743, 753751)
    g gap(2, 754287, 763287, None) shouldBe Array(754379, 754381)
    g gap(2, 90600, 190600, None) shouldBe Array(90617, 90619)
    g gap(4, 90600, 190600, None) shouldBe Array(90907, 90911)
    g gap(6, 90600, 190600, None) shouldBe Array(90641, 90647)
    g gap(8, 90600, 190600, None) shouldBe Array(90833, 90841)
    g gap(4, 91600, 100600, None) shouldBe Array(91753, 91757)
    g gap(2, 61345, 161345, None) shouldBe Array(61379, 61381)
    g gap(4, 61345, 161345, None) shouldBe Array(61483, 61487)
    g gap(6, 61345, 161345, None) shouldBe Array(61357, 61363)
    g gap(8, 61345, 161345, None) shouldBe Array(61409, 61417)
    g gap(2, 62345, 71345, None) shouldBe Array(62927, 62929)
    g gap(2, 593612, 693612, None) shouldBe Array(593627, 593629)
    g gap(4, 593612, 693612, None) shouldBe Array(593629, 593633)
    g gap(6, 593612, 693612, None) shouldBe Array(593641, 593647)
    g gap(8, 593612, 693612, None) shouldBe Array(593633, 593641)
    g gap(2, 594612, 603612, None) shouldBe Array(594749, 594751)
    g gap(2, 590345, 690345, None) shouldBe Array(590657, 590659)
    g gap(4, 590345, 690345, None) shouldBe Array(590713, 590717)
    g gap(6, 590345, 690345, None) shouldBe Array(590357, 590363)
    g gap(8, 590345, 690345, None) shouldBe Array(590399, 590407)
    g gap(2, 591345, 600345, None) shouldBe Array(591599, 591601)
    g gap(2, 967300, 1067300, None) shouldBe Array(967319, 967321)
    g gap(4, 967300, 1067300, None) shouldBe Array(967507, 967511)
    g gap(6, 967300, 1067300, None) shouldBe Array(967321, 967327)
    g gap(8, 967300, 1067300, None) shouldBe Array(967451, 967459)
    g gap(2, 968300, 977300, None) shouldBe Array(968501, 968503)
    g gap(2, 312683, 412683, None) shouldBe Array(312701, 312703)
    g gap(4, 312683, 412683, None) shouldBe Array(312937, 312941)
    g gap(6, 312683, 412683, None) shouldBe Array(312703, 312709)
    g gap(8, 312683, 412683, None) shouldBe Array(312971, 312979)
    g gap(4, 313683, 322683, None) shouldBe Array(313717, 313721)
    g gap(2, 449650, 549650, None) shouldBe Array(449987, 449989)
    g gap(4, 449650, 549650, None) shouldBe Array(449677, 449681)
    g gap(6, 449650, 549650, None) shouldBe Array(449671, 449677)
    g gap(8, 449650, 549650, None) shouldBe Array(449663, 449671)
    g gap(2, 450650, 459650, None) shouldBe Array(450797, 450799)
    g gap(2, 658459, 758459, None) shouldBe Array(658547, 658549)
    g gap(4, 658459, 758459, None) shouldBe Array(658639, 658643)
    g gap(6, 658459, 758459, None) shouldBe Array(658573, 658579)
    g gap(8, 658459, 758459, None) shouldBe Array(659069, 659077)
    g gap(2, 659459, 668459, None) shouldBe Array(659609, 659611)
    g gap(2, 697009, 797009, None) shouldBe Array(697259, 697261)
    g gap(4, 697009, 797009, None) shouldBe Array(697009, 697013)
    g gap(6, 697009, 797009, None) shouldBe Array(697013, 697019)
    g gap(8, 697009, 797009, None) shouldBe Array(697079, 697087)
    g gap(4, 698009, 707009, None) shouldBe Array(698017, 698021)
    g gap(2, 473836, 573836, None) shouldBe Array(473927, 473929)
    g gap(4, 473836, 573836, None) shouldBe Array(473857, 473861)
    g gap(6, 473836, 573836, None) shouldBe Array(473861, 473867)
    g gap(8, 473836, 573836, None) shouldBe Array(474029, 474037)
    g gap(2, 474836, 483836, None) shouldBe Array(475091, 475093)
    g gap(2, 145107, 245107, None) shouldBe Array(145511, 145513)
    g gap(4, 145107, 245107, None) shouldBe Array(145303, 145307)
    g gap(6, 145107, 245107, None) shouldBe Array(145133, 145139)
    g gap(8, 145107, 245107, None) shouldBe Array(145259, 145267)
    g gap(2, 146107, 155107, None) shouldBe Array(146297, 146299)
    g gap(2, 81534, 181534, None) shouldBe Array(81551, 81553)
    g gap(4, 81534, 181534, None) shouldBe Array(81547, 81551)
    g gap(6, 81534, 181534, None) shouldBe Array(81553, 81559)
    g gap(8, 81534, 181534, None) shouldBe Array(81611, 81619)
    g gap(2, 82534, 91534, None) shouldBe Array(82559, 82561)
    g gap(2, 721813, 821813, None) shouldBe Array(722147, 722149)
    g gap(4, 721813, 821813, None) shouldBe Array(722023, 722027)
    g gap(6, 721813, 821813, None) shouldBe Array(721843, 721849)
    g gap(8, 721813, 821813, None) shouldBe Array(721883, 721891)
    g gap(2, 722813, 731813, None) shouldBe Array(723029, 723031)
    g gap(2, 458343, 558343, None) shouldBe Array(458399, 458401)
    g gap(4, 458343, 558343, None) shouldBe Array(458569, 458573)
    g gap(6, 458343, 558343, None) shouldBe Array(458357, 458363)
    g gap(8, 458343, 558343, None) shouldBe Array(458621, 458629)
    g gap(2, 459343, 468343, None) shouldBe Array(459467, 459469)
    g gap(2, 280584, 380584, None) shouldBe Array(280589, 280591)
    g gap(4, 280584, 380584, None) shouldBe Array(280603, 280607)
    g gap(6, 280584, 380584, None) shouldBe Array(280591, 280597)
    g gap(8, 280584, 380584, None) shouldBe Array(280673, 280681)
    g gap(4, 281584, 290584, None) shouldBe Array(281623, 281627)
    g gap(2, 431883, 531883, None) shouldBe Array(432137, 432139)
    g gap(4, 431883, 531883, None) shouldBe Array(431887, 431891)
    g gap(6, 431883, 531883, None) shouldBe Array(432001, 432007)
    g gap(8, 431883, 531883, None) shouldBe Array(431903, 431911)
    g gap(4, 432883, 441883, None) shouldBe Array(432979, 432983)
    g gap(2, 246521, 346521, None) shouldBe Array(246611, 246613)
    g gap(4, 246521, 346521, None) shouldBe Array(246523, 246527)
    g gap(6, 246521, 346521, None) shouldBe Array(246683, 246689)
    g gap(8, 246521, 346521, None) shouldBe Array(246569, 246577)
    g gap(2, 247521, 256521, None) shouldBe Array(247529, 247531)
    g gap(2, 941058, 1041058, None) shouldBe Array(941117, 941119)
    g gap(4, 941058, 1041058, None) shouldBe Array(941119, 941123)
    g gap(6, 941058, 1041058, None) shouldBe Array(941093, 941099)
    g gap(8, 941058, 1041058, None) shouldBe Array(941123, 941131)
    g gap(2, 942058, 951058, None) shouldBe Array(942167, 942169)
    g gap(2, 132950, 232950, None) shouldBe Array(133277, 133279)
    g gap(4, 132950, 232950, None) shouldBe Array(132967, 132971)
    g gap(6, 132950, 232950, None) shouldBe Array(132961, 132967)
    g gap(8, 132950, 232950, None) shouldBe Array(132953, 132961)
    g gap(2, 133950, 142950, None) shouldBe Array(133979, 133981)
    g gap(2, 900840, 1000840, None) shouldBe Array(900929, 900931)
    g gap(4, 900840, 1000840, None) shouldBe Array(901009, 901013)
    g gap(6, 900840, 1000840, None) shouldBe Array(900863, 900869)
    g gap(8, 900840, 1000840, None) shouldBe Array(901133, 901141)
    g gap(2, 901840, 910840, None) shouldBe Array(901907, 901909)
    g gap(2, 200370, 300370, None) shouldBe Array(200381, 200383)
    g gap(4, 200370, 300370, None) shouldBe Array(200569, 200573)
    g gap(6, 200370, 300370, None) shouldBe Array(200401, 200407)
    g gap(8, 200370, 300370, None) shouldBe Array(200579, 200587)
    g gap(4, 201370, 210370, None) shouldBe Array(201493, 201497)
    g gap(2, 942093, 1042093, None) shouldBe Array(942167, 942169)
    g gap(4, 942093, 1042093, None) shouldBe Array(942163, 942167)
    g gap(6, 942093, 1042093, None) shouldBe Array(942217, 942223)
    g gap(8, 942093, 1042093, None) shouldBe Array(942569, 942577)
    g gap(4, 943093, 952093, None) shouldBe Array(943153, 943157)
    g gap(2, 639612, 739612, None) shouldBe Array(639677, 639679)
    g gap(4, 639612, 739612, None) shouldBe Array(639697, 639701)
    g gap(6, 639612, 739612, None) shouldBe Array(639631, 639637)
    g gap(8, 639612, 739612, None) shouldBe Array(639689, 639697)
    g gap(4, 640612, 649612, None) shouldBe Array(640663, 640667)
    g gap(2, 136046, 236046, None) shouldBe Array(136067, 136069)
    g gap(4, 136046, 236046, None) shouldBe Array(136189, 136193)
    g gap(6, 136046, 236046, None) shouldBe Array(136093, 136099)
    g gap(8, 136046, 236046, None) shouldBe Array(136319, 136327)
    g gap(2, 137046, 146046, None) shouldBe Array(137087, 137089)
    g gap(2, 152400, 252400, None) shouldBe Array(152417, 152419)
    g gap(4, 152400, 252400, None) shouldBe Array(152419, 152423)
    g gap(6, 152400, 252400, None) shouldBe Array(152423, 152429)
    g gap(8, 152400, 252400, None) shouldBe Array(152783, 152791)
    g gap(2, 153400, 162400, None) shouldBe Array(153407, 153409)
    g gap(2, 356565, 456565, None) shouldBe Array(356819, 356821)
    g gap(4, 356565, 456565, None) shouldBe Array(356929, 356933)
    g gap(6, 356565, 456565, None) shouldBe Array(356731, 356737)
    g gap(8, 356565, 456565, None) shouldBe Array(356693, 356701)
    g gap(4, 357565, 366565, None) shouldBe Array(357583, 357587)
    g gap(2, 486974, 586974, None) shouldBe Array(487049, 487051)
    g gap(4, 486974, 586974, None) shouldBe Array(487183, 487187)
    g gap(6, 486974, 586974, None) shouldBe Array(487007, 487013)
    g gap(8, 486974, 586974, None) shouldBe Array(487013, 487021)
    g gap(4, 487974, 496974, None) shouldBe Array(488149, 488153)
    g gap(2, 531700, 631700, None) shouldBe Array(531821, 531823)
    g gap(4, 531700, 631700, None) shouldBe Array(531823, 531827)
    g gap(6, 531700, 631700, None) shouldBe Array(531793, 531799)
    g gap(8, 531700, 631700, None) shouldBe Array(531833, 531841)
    g gap(2, 532700, 541700, None) shouldBe Array(532781, 532783)
    g gap(2, 851807, 951807, None) shouldBe Array(852011, 852013)
    g gap(4, 851807, 951807, None) shouldBe Array(851839, 851843)
    g gap(6, 851807, 951807, None) shouldBe Array(852031, 852037)
    g gap(8, 851807, 951807, None) shouldBe Array(851813, 851821)
    g gap(2, 852807, 861807, None) shouldBe Array(852827, 852829)
    g gap(2, 443695, 543695, None) shouldBe Array(443759, 443761)
    g gap(4, 443695, 543695, None) shouldBe Array(443749, 443753)
    g gap(6, 443695, 543695, None) shouldBe Array(443753, 443759)
    g gap(8, 443695, 543695, None) shouldBe Array(443909, 443917)
    g gap(2, 444695, 453695, None) shouldBe Array(444791, 444793)
    g gap(2, 159686, 259686, None) shouldBe Array(159737, 159739)
    g gap(4, 159686, 259686, None) shouldBe Array(159697, 159701)
    g gap(6, 159686, 259686, None) shouldBe Array(159701, 159707)
    g gap(8, 159686, 259686, None) shouldBe Array(159779, 159787)
    g gap(2, 160686, 169686, None) shouldBe Array(160709, 160711)
    g gap(2, 111931, 211931, None) shouldBe Array(112067, 112069)
    g gap(4, 111931, 211931, None) shouldBe Array(111949, 111953)
    g gap(6, 111931, 211931, None) shouldBe Array(111953, 111959)
    g gap(8, 111931, 211931, None) shouldBe Array(112103, 112111)
    g gap(4, 112931, 121931, None) shouldBe Array(113017, 113021)
    g gap(2, 272485, 372485, None) shouldBe Array(272537, 272539)
    g gap(4, 272485, 372485, None) shouldBe Array(272533, 272537)
    g gap(6, 272485, 372485, None) shouldBe Array(272771, 272777)
    g gap(8, 272485, 372485, None) shouldBe Array(272651, 272659)
    g gap(2, 273485, 282485, None) shouldBe Array(273641, 273643)
    g gap(2, 517453, 617453, None) shouldBe Array(517457, 517459)
    g gap(4, 517453, 617453, None) shouldBe Array(517507, 517511)
    g gap(6, 517453, 617453, None) shouldBe Array(517481, 517487)
    g gap(8, 517453, 617453, None) shouldBe Array(517589, 517597)
    g gap(4, 518453, 527453, None) shouldBe Array(518467, 518471)
    g gap(2, 660960, 760960, None) shouldBe Array(661091, 661093)
    g gap(4, 660960, 760960, None) shouldBe Array(661093, 661097)
    g gap(6, 660960, 760960, None) shouldBe Array(661103, 661109)
    g gap(8, 660960, 760960, None) shouldBe Array(661019, 661027)
    g gap(2, 661960, 670960, None) shouldBe Array(662141, 662143)
    g gap(2, 912524, 1012524, None) shouldBe Array(912647, 912649)
    g gap(4, 912524, 1012524, None) shouldBe Array(913063, 913067)
    g gap(6, 912524, 1012524, None) shouldBe Array(912533, 912539)
    g gap(8, 912524, 1012524, None) shouldBe Array(913433, 913441)
    g gap(4, 913524, 922524, None) shouldBe Array(914359, 914363)
    g gap(2, 108019, 208019, None) shouldBe Array(108107, 108109)
    g gap(4, 108019, 208019, None) shouldBe Array(108037, 108041)
    g gap(6, 108019, 208019, None) shouldBe Array(108211, 108217)
    g gap(8, 108019, 208019, None) shouldBe Array(108131, 108139)
    g gap(2, 109019, 118019, None) shouldBe Array(109139, 109141)
    g gap(2, 967141, 1067141, None) shouldBe Array(967259, 967261)
    g gap(4, 967141, 1067141, None) shouldBe Array(967507, 967511)
    g gap(6, 967141, 1067141, None) shouldBe Array(967321, 967327)
    g gap(8, 967141, 1067141, None) shouldBe Array(967289, 967297)
    g gap(2, 968141, 977141, None) shouldBe Array(968237, 968239)
    g gap(2, 430886, 530886, None) shouldBe Array(430907, 430909)
    g gap(4, 430886, 530886, None) shouldBe Array(431017, 431021)
    g gap(6, 430886, 530886, None) shouldBe Array(430891, 430897)
    g gap(8, 430886, 530886, None) shouldBe Array(430949, 430957)
    g gap(2, 431886, 440886, None) shouldBe Array(432137, 432139)
    g gap(2, 543662, 643662, None) shouldBe Array(543791, 543793)
    g gap(4, 543662, 643662, None) shouldBe Array(543703, 543707)
    g gap(6, 543662, 643662, None) shouldBe Array(543707, 543713)
    g gap(8, 543662, 643662, None) shouldBe Array(543671, 543679)
    g gap(4, 544662, 553662, None) shouldBe Array(544717, 544721)
    g gap(2, 418532, 518532, None) shouldBe Array(418601, 418603)
    g gap(4, 418532, 518532, None) shouldBe Array(418597, 418601)
    g gap(6, 418532, 518532, None) shouldBe Array(418553, 418559)
    g gap(8, 418532, 518532, None) shouldBe Array(418763, 418771)
    g gap(2, 419532, 428532, None) shouldBe Array(419561, 419563)
    g gap(2, 680741, 780741, None) shouldBe Array(680879, 680881)
    g gap(4, 680741, 780741, None) shouldBe Array(680857, 680861)
    g gap(6, 680741, 780741, None) shouldBe Array(680803, 680809)
    g gap(8, 680741, 780741, None) shouldBe Array(680759, 680767)
    g gap(2, 681741, 690741, None) shouldBe Array(681839, 681841)
    g gap(2, 36154, 136154, None) shouldBe Array(36341, 36343)
    g gap(4, 36154, 136154, None) shouldBe Array(36187, 36191)
    g gap(6, 36154, 136154, None) shouldBe Array(36263, 36269)
    g gap(8, 36154, 136154, None) shouldBe Array(36209, 36217)
    g gap(4, 37154, 46154, None) shouldBe Array(37273, 37277)
    g gap(2, 605357, 705357, None) shouldBe Array(605411, 605413)
    g gap(4, 605357, 705357, None) shouldBe Array(605593, 605597)
    g gap(6, 605357, 705357, None) shouldBe Array(605471, 605477)
    g gap(8, 605357, 705357, None) shouldBe Array(605393, 605401)
    g gap(2, 606357, 615357, None) shouldBe Array(606587, 606589)
    g gap(2, 630364, 730364, None) shouldBe Array(630521, 630523)
    g gap(4, 630364, 730364, None) shouldBe Array(630583, 630587)
    g gap(6, 630364, 730364, None) shouldBe Array(630467, 630473)
    g gap(8, 630364, 730364, None) shouldBe Array(630473, 630481)
    g gap(4, 631364, 640364, None) shouldBe Array(631387, 631391)
    g gap(2, 627505, 727505, None) shouldBe Array(627617, 627619)
    g gap(4, 627505, 727505, None) shouldBe Array(627787, 627791)
    g gap(6, 627505, 727505, None) shouldBe Array(627541, 627547)
    g gap(8, 627505, 727505, None) shouldBe Array(627911, 627919)
    g gap(2, 628505, 637505, None) shouldBe Array(628679, 628681)
    g gap(2, 727457, 827457, None) shouldBe Array(727499, 727501)
    g gap(4, 727457, 827457, None) shouldBe Array(727483, 727487)
    g gap(6, 727457, 827457, None) shouldBe Array(727667, 727673)
    g gap(8, 727457, 827457, None) shouldBe Array(727613, 727621)
    g gap(4, 728457, 737457, None) shouldBe Array(728557, 728561)
    g gap(2, 391034, 491034, None) shouldBe Array(391217, 391219)
    g gap(4, 391034, 491034, None) shouldBe Array(391063, 391067)
    g gap(6, 391034, 491034, None) shouldBe Array(391057, 391063)
    g gap(8, 391034, 491034, None) shouldBe Array(391049, 391057)
    g gap(2, 392034, 401034, None) shouldBe Array(392099, 392101)
    g gap(2, 966007, 1066007, None) shouldBe Array(966011, 966013)
    g gap(4, 966007, 1066007, None) shouldBe Array(966109, 966113)
    g gap(6, 966007, 1066007, None) shouldBe Array(966191, 966197)
    g gap(8, 966007, 1066007, None) shouldBe Array(966149, 966157)
    g gap(2, 967007, 976007, None) shouldBe Array(967259, 967261)
    g gap(2, 468690, 568690, None) shouldBe Array(468737, 468739)
    g gap(4, 468690, 568690, None) shouldBe Array(468817, 468821)
    g gap(6, 468690, 568690, None) shouldBe Array(468691, 468697)
    g gap(8, 468690, 568690, None) shouldBe Array(468773, 468781)
    g gap(2, 469690, 478690, None) shouldBe Array(469877, 469879)
    g gap(2, 131429, 231429, None) shouldBe Array(131447, 131449)
    g gap(4, 131429, 231429, None) shouldBe Array(131437, 131441)
    g gap(6, 131429, 231429, None) shouldBe Array(131431, 131437)
    g gap(8, 131429, 231429, None) shouldBe Array(131489, 131497)
    g gap(4, 132429, 141429, None) shouldBe Array(132523, 132527)
    g gap(2, 218564, 318564, None) shouldBe Array(218627, 218629)
    g gap(4, 218564, 318564, None) shouldBe Array(218623, 218627)
    g gap(6, 218564, 318564, None) shouldBe Array(218651, 218657)
    g gap(8, 218564, 318564, None) shouldBe Array(218591, 218599)
    g gap(4, 219564, 228564, None) shouldBe Array(219679, 219683)
  }

}
