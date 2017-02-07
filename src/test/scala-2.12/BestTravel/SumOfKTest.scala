package BestTravel

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 28/01/2017.
  */
class SumOfKTest extends FlatSpec with BeforeAndAfter {

  var s: SumOfK = _
  before { s = new SumOfK }
  "SumOfK" should
    "Handle 3 Basic Tests" in {
      s chooseBestSum(163, 3, List(50, 55, 56, 57, 58)) shouldBe Some(163)

      s chooseBestSum(163, 3, List(50)) shouldBe None

      s chooseBestSum(230, 3, List(91, 74, 73, 85, 73, 81, 87)) shouldBe Some(228)
    }

  it should "Handle 5 Basic Tests 2" in {
    s chooseBestSum(331, 2, List(73, 73, 74, 81, 85, 87, 91)) shouldBe Some(178)

    s chooseBestSum(331, 4, List(73, 73, 74, 81, 85, 87, 91)) shouldBe Some(331)

    s chooseBestSum(331, 5, List(73, 73, 74, 81, 85, 87, 91)) shouldBe None

    s chooseBestSum(331, 1, List(73, 73, 74, 81, 85, 87, 91)) shouldBe Some(91)

    s chooseBestSum(700, 8, List(73, 73, 74, 81, 85, 87, 91)) shouldBe None
  }

  it should "Handle 40 Random Tests" in {
    s chooseBestSum(1935, 3, List(71, 92, 102, 110, 115, 146, 165, 230, 231, 235, 288, 310, 313, 328, 334, 352, 384, 401, 471, 481)) shouldBe Some(1353)

    s chooseBestSum(443, 3, List(12, 38, 56, 93, 123, 130, 145, 155, 280, 295, 301, 301, 338, 376, 430, 445, 455, 461, 481, 488)) shouldBe Some(443)

    s chooseBestSum(443, 3, List(12, 38, 56, 93, 123, 130, 145, 155, 280, 295, 301, 301, 338, 376, 430, 445, 455, 461, 481, 488)) shouldBe Some(443)

    s chooseBestSum(1920, 3, List(85, 108, 110, 129, 135, 150, 193, 199, 227, 228, 251, 255, 333, 336, 357, 358, 393, 454, 455, 457)) shouldBe Some(1366)

    s chooseBestSum(1712, 1, List(42, 60, 90, 106, 116, 118, 118, 138, 153, 161, 170, 181, 257, 270, 330, 367, 393, 400, 400, 472)) shouldBe Some(472)

    s chooseBestSum(1770, 4, List(13, 54, 83, 97, 112, 121, 136, 146, 170, 219, 220, 282, 287, 309, 382, 421, 423, 440, 443, 469)) shouldBe Some(1756)

    s chooseBestSum(60, 2, List(37, 42, 74, 82, 117, 120, 147, 185, 190, 208, 283, 326, 348, 357, 363, 385, 396, 430, 460, 470)) shouldBe None

    s chooseBestSum(692, 1, List(44, 68, 69, 88, 147, 169, 184, 192, 226, 263, 285, 294, 311, 324, 331, 372, 412, 439, 452, 477)) shouldBe Some(477)

    s chooseBestSum(1528, 4, List(43, 83, 84, 116, 175, 209, 252, 268, 288, 289, 346, 349, 368, 389, 391, 411, 422, 443, 456, 467)) shouldBe Some(1528)

    s chooseBestSum(84, 2, List(22, 58, 85, 111, 159, 210, 210, 238, 247, 270, 295, 306, 361, 395, 402, 423, 438, 440, 457, 487)) shouldBe Some(80)

    s chooseBestSum(1250, 2, List(27, 39, 60, 61, 122, 126, 192, 193, 215, 227, 236, 236, 317, 328, 355, 373, 400, 444, 444, 484)) shouldBe Some(928)

    s chooseBestSum(1046, 3, List(73, 125, 170, 205, 210, 229, 248, 303, 314, 348, 350, 370, 373, 379, 384, 447, 471, 474, 480, 493)) shouldBe Some(1046)

    s chooseBestSum(1346, 4, List(12, 23, 35, 39, 42, 66, 89, 99, 283, 309, 312, 365, 378, 386, 393, 410, 464, 495, 497, 497)) shouldBe Some(1346)

    s chooseBestSum(1224, 4, List(46, 47, 63, 125, 157, 159, 167, 198, 210, 215, 229, 290, 318, 351, 399, 402, 417, 427, 438, 497)) shouldBe Some(1224)

    s chooseBestSum(1644, 2, List(60, 84, 91, 125, 129, 140, 169, 186, 202, 230, 251, 281, 305, 317, 372, 386, 416, 448, 465, 478)) shouldBe Some(943)

    s chooseBestSum(336, 1, List(11, 12, 49, 61, 85, 89, 90, 244, 319, 324, 325, 349, 362, 376, 440, 449, 450, 456, 457, 461)) shouldBe Some(325)

    s chooseBestSum(1694, 1, List(16, 56, 82, 99, 127, 139, 151, 226, 229, 235, 251, 287, 289, 318, 357, 373, 377, 395, 412, 454)) shouldBe Some(454)

    s chooseBestSum(1747, 2, List(10, 16, 55, 82, 90, 93, 189, 252, 258, 263, 273, 301, 314, 320, 333, 354, 361, 387, 475, 479)) shouldBe Some(954)

    s chooseBestSum(1366, 3, List(50, 73, 84, 108, 134, 157, 183, 236, 238, 259, 272, 277, 318, 321, 338, 380, 389, 397, 433, 454)) shouldBe Some(1284)

    s chooseBestSum(1737, 4, List(188, 202, 207, 208, 249, 264, 283, 292, 294, 330, 331, 365, 368, 383, 424, 424, 425, 448, 482, 490)) shouldBe Some(1737)

    s chooseBestSum(606, 4, List(14, 47, 54, 61, 107, 196, 203, 295, 302, 382, 402, 407, 415, 418, 431, 433, 443, 453, 455, 476)) shouldBe Some(606)

    s chooseBestSum(1561, 2, List(38, 58, 151, 199, 211, 231, 231, 239, 268, 310, 327, 328, 328, 333, 343, 350, 352, 390, 408, 421)) shouldBe Some(829)

    s chooseBestSum(870, 4, List(33, 53, 68, 115, 156, 171, 194, 242, 269, 276, 286, 299, 311, 354, 375, 412, 413, 464, 478, 497)) shouldBe Some(870)

    s chooseBestSum(232, 2, List(20, 53, 63, 76, 83, 118, 124, 137, 204, 234, 246, 254, 261, 269, 286, 326, 412, 441, 475, 485)) shouldBe Some(224)

    s chooseBestSum(1023, 2, List(57, 67, 80, 109, 117, 143, 161, 166, 176, 181, 208, 226, 240, 267, 285, 289, 395, 429, 443, 498)) shouldBe Some(941)

    s chooseBestSum(733, 4, List(25, 48, 56, 60, 96, 119, 127, 128, 148, 220, 301, 303, 318, 334, 345, 363, 440, 465, 471, 493)) shouldBe Some(733)

    s chooseBestSum(1819, 1, List(25, 44, 48, 50, 65, 73, 107, 120, 128, 170, 203, 222, 289, 315, 327, 366, 375, 448, 454, 495)) shouldBe Some(495)

    s chooseBestSum(1633, 4, List(21, 52, 63, 92, 93, 104, 108, 108, 110, 132, 133, 191, 193, 210, 287, 292, 300, 362, 372, 482)) shouldBe Some(1516)

    s chooseBestSum(1168, 2, List(100, 126, 139, 162, 170, 205, 247, 247, 257, 280, 280, 299, 321, 347, 386, 396, 400, 411, 460, 478)) shouldBe Some(938)

    s chooseBestSum(1760, 3, List(21, 30, 91, 176, 177, 187, 201, 247, 257, 264, 304, 305, 313, 381, 388, 392, 418, 468, 474, 492)) shouldBe Some(1434)

    s chooseBestSum(979, 3, List(31, 39, 43, 52, 95, 95, 184, 206, 208, 231, 235, 273, 282, 308, 310, 350, 363, 405, 476, 493)) shouldBe Some(976)

    s chooseBestSum(1531, 1, List(40, 73, 80, 129, 147, 165, 165, 166, 180, 205, 233, 237, 317, 366, 443, 443, 478, 480, 482, 482)) shouldBe Some(482)

    s chooseBestSum(356, 3, List(39, 58, 88, 122, 193, 228, 262, 292, 296, 336, 338, 356, 365, 406, 407, 445, 446, 469, 475, 494)) shouldBe Some(355)

    s chooseBestSum(614, 1, List(52, 71, 135, 156, 159, 187, 211, 225, 235, 251, 263, 327, 330, 390, 403, 423, 429, 446, 454, 469)) shouldBe Some(469)

    s chooseBestSum(1865, 4, List(29, 36, 62, 89, 127, 132, 133, 136, 153, 196, 203, 204, 260, 272, 273, 298, 300, 362, 417, 426)) shouldBe Some(1505)

    s chooseBestSum(1661, 4, List(15, 27, 41, 109, 118, 127, 141, 167, 188, 190, 252, 277, 279, 296, 302, 323, 328, 352, 402, 462)) shouldBe Some(1544)

    s chooseBestSum(1683, 1, List(51, 87, 92, 101, 115, 231, 238, 261, 293, 308, 330, 337, 337, 338, 375, 376, 398, 426, 431, 491)) shouldBe Some(491)

    s chooseBestSum(105, 3, List(45, 76, 86, 93, 95, 129, 183, 183, 189, 203, 235, 236, 236, 264, 282, 310, 398, 411, 495, 496)) shouldBe None

    s chooseBestSum(787, 3, List(32, 63, 65, 131, 163, 218, 279, 300, 303, 309, 355, 381, 381, 395, 403, 414, 417, 427, 429, 494)) shouldBe Some(786)

    s chooseBestSum(1176, 3, List(12, 75, 149, 154, 158, 190, 202, 214, 252, 256, 269, 272, 328, 378, 379, 384, 397, 420, 425, 432)) shouldBe Some(1173)

    s chooseBestSum(1720, 4, List(99, 114, 118, 128, 133, 158, 163, 172, 179, 214, 231, 241, 258, 264, 292, 334, 380, 393, 394, 475)) shouldBe Some(1642)
  }

}