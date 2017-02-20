package TriangleType

import org.scalatest.{BeforeAndAfter, FlatSpec, FunSuite}
import org.scalatest.Matchers._

/**
  * Created by Nenyi on 20/02/2017.
  */
class TriangleTypeTest extends FlatSpec with BeforeAndAfter {

  var t: TriangleType = _
  before {
    t = new TriangleType
  }

  "gap" should
    "Handle Example Tests" in {
    t triangleType(7, 3, 2) shouldBe 0
    t triangleType(2, 4, 6) shouldBe 0
    t triangleType(8, 5, 7) shouldBe 1
    t triangleType(3, 4, 5) shouldBe 2
    t triangleType(7, 12, 8) shouldBe 3
  }

  it should "Handle Not triangles" in {
    t triangleType(1, 2, 3) shouldBe 0
    t triangleType(1, 2, 3) shouldBe 0
    t triangleType(4.5, 5.5, 10) shouldBe 0
    t triangleType(2, 3, 7) shouldBe 0
    t triangleType(5, 5, 10) shouldBe 0
    t triangleType(0, 3, 3) shouldBe 0
  }

  it should "Handle Acute triangles" in {
    t triangleType(1, 3, 3) shouldBe 1
    t triangleType(1, 3, 3) shouldBe 1
    t triangleType(5, 5, 5) shouldBe 1
    t triangleType(122.14, 222.11, 250) shouldBe 1
    t triangleType(5, 7, 8) shouldBe 1
    t triangleType(100000, 100005, 111111) shouldBe 1
  }

  it should "Handle Right triangles" in {
    t triangleType(3, 4, 5) shouldBe 2
    t triangleType(3, 4, 5) shouldBe 2
    t triangleType(21, 220, 221) shouldBe 2
    t triangleType(8.625, 32.5, 33.625) shouldBe 2
    t triangleType(33, 56, 65) shouldBe 2
    t triangleType(68000, 285000, 293000) shouldBe 2
  }

  it should "Handle Obtuse triangles" in {
    t triangleType(2, 4, 5) shouldBe 3
    t triangleType(2, 4, 5) shouldBe 3
    t triangleType(6, 100, 105) shouldBe 3
    t triangleType(102, 200, 250) shouldBe 3
    t triangleType(33, 55, 65) shouldBe 3
    t triangleType(7, 8, 12) shouldBe 3
    t triangleType(4, 4, 7.99999) shouldBe 3
  }

  it should "Handle Random right triangles" in {
    t triangleType(223.125, 535.5, 580.125) shouldBe 2
    t triangleType(80.25, 107, 133.75) shouldBe 2
    t triangleType(963.75, 1011.9375, 1397.4375) shouldBe 2
    t triangleType(100.1875, 343.5, 357.8125) shouldBe 2
    t triangleType(5.0625, 6.75, 8.4375) shouldBe 2
    t triangleType(402, 753.75, 854.25) shouldBe 2
    t triangleType(117.1875, 281.25, 304.6875) shouldBe 2
    t triangleType(341.25, 1170, 1218.75) shouldBe 2
    t triangleType(554.25, 1616.5625, 1708.9375) shouldBe 2
    t triangleType(255.5, 479.0625, 542.9375) shouldBe 2
    t triangleType(474.75, 1384.6875, 1463.8125) shouldBe 2
    t triangleType(453, 1321.25, 1396.75) shouldBe 2
    t triangleType(204, 595, 629) shouldBe 2
    t triangleType(225.75, 774, 806.25) shouldBe 2
    t triangleType(222.6875, 763.5, 795.3125) shouldBe 2
    t triangleType(105, 306.25, 323.75) shouldBe 2
    t triangleType(907.5, 952.875, 1315.875) shouldBe 2
    t triangleType(715.5, 2086.875, 2206.125) shouldBe 2
    t triangleType(304.5, 570.9375, 647.0625) shouldBe 2
    t triangleType(976.25, 1025.0625, 1415.5625) shouldBe 2
    t triangleType(267.1875, 1187.5, 1217.1875) shouldBe 2
    t triangleType(196.3125, 872.5, 894.3125) shouldBe 2
    t triangleType(358, 671.25, 760.75) shouldBe 2
    t triangleType(4.5, 13.125, 13.875) shouldBe 2
    t triangleType(170.1875, 583.5, 607.8125) shouldBe 2
    t triangleType(357.1875, 1587.5, 1627.1875) shouldBe 2
    t triangleType(481.5, 1404.375, 1484.625) shouldBe 2
    t triangleType(276.75, 1230, 1260.75) shouldBe 2
    t triangleType(169, 316.875, 359.125) shouldBe 2
    t triangleType(468.5, 878.4375, 995.5625) shouldBe 2
    t triangleType(541.6875, 2407.5, 2467.6875) shouldBe 2
    t triangleType(116.625, 155.5, 194.375) shouldBe 2
    t triangleType(596.25, 1739.0625, 1838.4375) shouldBe 2
    t triangleType(267.3125, 916.5, 954.6875) shouldBe 2
    t triangleType(319.5, 599.0625, 678.9375) shouldBe 2
    t triangleType(388.5, 1332, 1387.5) shouldBe 2
    t triangleType(409.5, 1404, 1462.5) shouldBe 2
    t triangleType(828.75, 870.1875, 1201.6875) shouldBe 2
    t triangleType(181.5, 529.375, 559.625) shouldBe 2
    t triangleType(986.25, 1035.5625, 1430.0625) shouldBe 2
    t triangleType(458.75, 481.6875, 665.1875) shouldBe 2
    t triangleType(45.5, 156, 162.5) shouldBe 2
    t triangleType(624, 1820, 1924) shouldBe 2
    t triangleType(96.75, 129, 161.25) shouldBe 2
    t triangleType(309.9375, 1377.5, 1411.9375) shouldBe 2
    t triangleType(370.5, 694.6875, 787.3125) shouldBe 2
    t triangleType(404.25, 1386, 1443.75) shouldBe 2
    t triangleType(357.75, 1043.4375, 1103.0625) shouldBe 2
    t triangleType(482.5, 904.6875, 1025.3125) shouldBe 2
    t triangleType(97.6875, 130.25, 162.8125) shouldBe 2
  }

  it should "Handle  Random arbitary triangles & segment sets" in {
    t triangleType(138.5, 274.388, 824.464) shouldBe 0
    t triangleType(50.984, 213.567, 641.521) shouldBe 0
    t triangleType(30.822, 295.633, 741.154) shouldBe 0
    t triangleType(267.792, 683.59, 924.792) shouldBe 3
    t triangleType(372.862, 839.515, 957.586) shouldBe 3
    t triangleType(626.157, 842.759, 843.448) shouldBe 1
    t triangleType(186.027, 628.208, 840.45) shouldBe 0
    t triangleType(141.077, 225.738, 770.057) shouldBe 0
    t triangleType(251.732, 401.778, 798.325) shouldBe 0
    t triangleType(518.171, 737.796, 785.477) shouldBe 1
    t triangleType(621.712, 625.654, 919.192) shouldBe 3
    t triangleType(228.346, 701.343, 705.871) shouldBe 1
    t triangleType(154.369, 716.88, 827.342) shouldBe 3
    t triangleType(90.169, 110.508, 209.052) shouldBe 0
    t triangleType(49.832, 331.028, 476.969) shouldBe 0
    t triangleType(660.686, 795.122, 889.981) shouldBe 1
    t triangleType(617.775, 855.452, 993.438) shouldBe 1
    t triangleType(222.748, 549.416, 704.816) shouldBe 3
    t triangleType(211.911, 256.287, 405.395) shouldBe 3
    t triangleType(306.167, 442.72, 508.725) shouldBe 1
    t triangleType(314.982, 436.795, 607.421) shouldBe 3
    t triangleType(180.238, 252.427, 483.687) shouldBe 0
    t triangleType(343.496, 484.032, 587.124) shouldBe 1
    t triangleType(185.922, 740.816, 995.906) shouldBe 0
    t triangleType(294.834, 410.184, 779.064) shouldBe 0
    t triangleType(85.875, 155.226, 596.826) shouldBe 0
    t triangleType(120.041, 326.529, 846.067) shouldBe 0
    t triangleType(253.533, 491.791, 786.954) shouldBe 0
    t triangleType(132.586, 735.394, 914.97) shouldBe 0
    t triangleType(234.837, 407.03, 757.128) shouldBe 0
    t triangleType(494.287, 607.404, 899.475) shouldBe 3
    t triangleType(349.388, 458.996, 880.203) shouldBe 0
    t triangleType(299.636, 653.666, 758.923) shouldBe 3
    t triangleType(570.645, 608.528, 723.319) shouldBe 1
    t triangleType(434.647, 642.942, 865.537) shouldBe 3
    t triangleType(497.625, 502.079, 610.174) shouldBe 1
    t triangleType(546.914, 556.258, 931.373) shouldBe 3
    t triangleType(161.061, 162.865, 192.119) shouldBe 1
    t triangleType(547.714, 937.943, 961.155) shouldBe 1
    t triangleType(140.534, 157.642, 904.566) shouldBe 0
    t triangleType(439.133, 726.045, 969.227) shouldBe 3
    t triangleType(864.576, 894.344, 998.542) shouldBe 1
    t triangleType(270.866, 818.7, 980.986) shouldBe 3
    t triangleType(287.125, 532.916, 805.27) shouldBe 3
    t triangleType(505.772, 923.856, 946.51) shouldBe 1
    t triangleType(633.699, 710.574, 713.39) shouldBe 1
    t triangleType(344.858, 551.709, 810.914) shouldBe 3
    t triangleType(110.701, 863.128, 983.362) shouldBe 0
    t triangleType(269.687, 453.11, 780.411) shouldBe 0
    t triangleType(248.443, 465.306, 862.606) shouldBe 0
    t triangleType(213.307, 781.616, 793.174) shouldBe 1
    t triangleType(467.811, 496.26, 709.187) shouldBe 3
    t triangleType(74.476, 633.188, 804.913) shouldBe 0
    t triangleType(31.424, 417.924, 999.691) shouldBe 0
    t triangleType(7.255, 277.037, 594.786) shouldBe 0
    t triangleType(311.681, 346.386, 643.127) shouldBe 3
    t triangleType(250.687, 297.511, 575.89) shouldBe 0
    t triangleType(70.569, 250.874, 536.116) shouldBe 0
    t triangleType(178.852, 285.74, 314.32) shouldBe 1
    t triangleType(318.853, 730.271, 822.877) shouldBe 3
    t triangleType(65.844, 688.063, 963.137) shouldBe 0
    t triangleType(43.515, 175.275, 387.617) shouldBe 0
    t triangleType(476.331, 726.509, 997.361) shouldBe 3
    t triangleType(36.339, 286.317, 391.417) shouldBe 0
    t triangleType(429.368, 746.894, 825.079) shouldBe 1
    t triangleType(120.434, 447.672, 623.949) shouldBe 0
    t triangleType(609.631, 757.608, 994.487) shouldBe 3
    t triangleType(113.891, 414.74, 463.304) shouldBe 3
    t triangleType(297.09, 469.283, 929.449) shouldBe 0
    t triangleType(560.073, 832.579, 991.632) shouldBe 1
    t triangleType(73.03, 520.558, 595.093) shouldBe 0
    t triangleType(44.998, 312.434, 752.129) shouldBe 0
    t triangleType(715.743, 946.375, 999.838) shouldBe 1
    t triangleType(179.374, 743.004, 772.805) shouldBe 3
    t triangleType(193.565, 443.23, 987.456) shouldBe 0
    t triangleType(10.783, 84.768, 576.372) shouldBe 0
    t triangleType(346.596, 807.17, 822.188) shouldBe 1
    t triangleType(127.066, 381.052, 734.91) shouldBe 0
    t triangleType(390.497, 601.711, 825.163) shouldBe 3
    t triangleType(0.145, 40.926, 804.368) shouldBe 0
    t triangleType(570.636, 656.384, 843.646) shouldBe 1
    t triangleType(94.479, 292.539, 329.814) shouldBe 3
    t triangleType(768.235, 934.029, 935.041) shouldBe 1
    t triangleType(505.803, 869.122, 972.048) shouldBe 1
    t triangleType(327.745, 521.629, 729.607) shouldBe 3
    t triangleType(258.509, 537.516, 606.047) shouldBe 3
    t triangleType(230.677, 741.277, 797.11) shouldBe 3
    t triangleType(555.687, 802.229, 942.358) shouldBe 1
    t triangleType(214.972, 437.925, 902.482) shouldBe 0
    t triangleType(149.053, 881.75, 934.078) shouldBe 3
    t triangleType(30.878, 618.817, 975.437) shouldBe 0
    t triangleType(199.801, 256.863, 301.13) shouldBe 1
    t triangleType(290.225, 828.306, 931.698) shouldBe 3
    t triangleType(189.445, 382.07, 469.866) shouldBe 3
    t triangleType(388.991, 615.026, 704.926) shouldBe 1
    t triangleType(99.468, 765.593, 824.577) shouldBe 3
    t triangleType(475.084, 886.771, 986.73) shouldBe 1
    t triangleType(238.334, 471.264, 531.556) shouldBe 3
    t triangleType(263.142, 853.096, 856.032) shouldBe 1
    t triangleType(71.26, 202.499, 502.762) shouldBe 0
    t triangleType(213.759, 581.253, 777.637) shouldBe 3
    t triangleType(177.027, 398.663, 954.47) shouldBe 0
    t triangleType(131.228, 249.645, 605.865) shouldBe 0
    t triangleType(546.079, 709.135, 880.829) shouldBe 1
    t triangleType(366.597, 464.294, 600.223) shouldBe 3
    t triangleType(390.444, 792.902, 934.095) shouldBe 3
    t triangleType(113.364, 201.518, 910.293) shouldBe 0
    t triangleType(652.928, 834.731, 999.326) shouldBe 1
    t triangleType(117.869, 488.305, 732.912) shouldBe 0
    t triangleType(17.386, 116.974, 290.949) shouldBe 0
    t triangleType(229.004, 389.612, 726.547) shouldBe 0
    t triangleType(863.781, 919.065, 922.352) shouldBe 1
    t triangleType(368.706, 889.284, 926.92) shouldBe 1
    t triangleType(63.052, 87.98, 943.786) shouldBe 0
    t triangleType(285.058, 428.26, 439.488) shouldBe 1
    t triangleType(660.961, 817.838, 917.04) shouldBe 1
    t triangleType(104.633, 290.782, 841.292) shouldBe 0
    t triangleType(585.93, 828.169, 861.968) shouldBe 1
    t triangleType(331.956, 462.135, 847.305) shouldBe 0
    t triangleType(65.124, 191.317, 673.827) shouldBe 0
    t triangleType(60.153, 485.671, 849.886) shouldBe 0
    t triangleType(189.197, 285.537, 574.791) shouldBe 0
    t triangleType(87.31, 606.049, 976.745) shouldBe 0
    t triangleType(141.047, 446.271, 929.005) shouldBe 0
    t triangleType(81.612, 376.496, 853.141) shouldBe 0
    t triangleType(345.722, 375.973, 450.849) shouldBe 1
    t triangleType(553.618, 790.614, 936.798) shouldBe 1
    t triangleType(754.325, 757.713, 786.909) shouldBe 1
    t triangleType(303.999, 424.089, 776.117) shouldBe 0
    t triangleType(438.36, 638.334, 851.748) shouldBe 3
    t triangleType(179.002, 580.453, 820.898) shouldBe 0
    t triangleType(188.527, 502.208, 519.3) shouldBe 1
    t triangleType(3.248, 300.87, 643.376) shouldBe 0
    t triangleType(11.615, 656.697, 791.902) shouldBe 0
    t triangleType(81.061, 104.324, 956.803) shouldBe 0
    t triangleType(341.411, 589.209, 598.588) shouldBe 1
    t triangleType(189.015, 228.175, 552.395) shouldBe 0
    t triangleType(50.765, 445.846, 856.335) shouldBe 0
    t triangleType(34.572, 71.477, 214.619) shouldBe 0
    t triangleType(249.883, 259.331, 609.774) shouldBe 0
    t triangleType(154.509, 176.265, 777.168) shouldBe 0
    t triangleType(191.294, 371.909, 493.928) shouldBe 3
    t triangleType(57.791, 439.116, 608.097) shouldBe 0
    t triangleType(675.594, 905.079, 985.958) shouldBe 1
    t triangleType(150.253, 465.173, 621.513) shouldBe 0
    t triangleType(357.445, 428.163, 489.583) shouldBe 1
    t triangleType(222.993, 458.694, 494.927) shouldBe 1
    t triangleType(270.756, 736.341, 999.725) shouldBe 3
    t triangleType(301.806, 757.572, 863.421) shouldBe 3
    t triangleType(436.409, 663.475, 865.022) shouldBe 3
    t triangleType(132.81, 571.694, 635.064) shouldBe 3
    t triangleType(48.245, 418.762, 687.09) shouldBe 0
    t triangleType(478.5, 516.66, 817.539) shouldBe 3
    t triangleType(185.411, 199.299, 506.224) shouldBe 0
    t triangleType(113.535, 591.53, 856.073) shouldBe 0
    t triangleType(275.924, 357.597, 614.387) shouldBe 3
    t triangleType(394.086, 797.877, 822.132) shouldBe 1
    t triangleType(308.422, 633.576, 919.933) shouldBe 3
    t triangleType(4.674, 86.485, 295.465) shouldBe 0
    t triangleType(169.23, 175.145, 283.854) shouldBe 3
    t triangleType(74.42, 409.863, 883.682) shouldBe 0
    t triangleType(76.818, 176.395, 520.405) shouldBe 0
    t triangleType(52.788, 644.498, 937.73) shouldBe 0
    t triangleType(467.747, 732.217, 784.552) shouldBe 1
    t triangleType(26.922, 405.85, 552.901) shouldBe 0
    t triangleType(95.675, 526.634, 623.455) shouldBe 0
    t triangleType(107.768, 623.688, 653.683) shouldBe 3
    t triangleType(260.831, 541.052, 802.602) shouldBe 0
    t triangleType(34.793, 418.917, 563.309) shouldBe 0
    t triangleType(441.8, 530.128, 766.687) shouldBe 3
    t triangleType(251.81, 501.219, 683.911) shouldBe 3
    t triangleType(270.324, 613.396, 914.508) shouldBe 0
    t triangleType(243.576, 267.299, 435.147) shouldBe 3
    t triangleType(268.044, 651.51, 714.807) shouldBe 3
    t triangleType(10.971, 47.231, 761.966) shouldBe 0
    t triangleType(485.253, 898.023, 949.135) shouldBe 1
    t triangleType(94.662, 437.457, 651.475) shouldBe 0
    t triangleType(343.218, 345.303, 975.897) shouldBe 0
    t triangleType(244.848, 634.257, 717.289) shouldBe 3
    t triangleType(65.679, 317.93, 944.417) shouldBe 0
    t triangleType(136.704, 610.142, 993.879) shouldBe 0
    t triangleType(245.135, 768.195, 876.87) shouldBe 3
    t triangleType(128.243, 178.965, 773.403) shouldBe 0
    t triangleType(122.182, 330.415, 656.693) shouldBe 0
    t triangleType(68.702, 716.502, 921.808) shouldBe 0
    t triangleType(605.863, 657.019, 921.111) shouldBe 3
    t triangleType(96.639, 547.507, 617.243) shouldBe 3
    t triangleType(103.641, 526.141, 738.467) shouldBe 0
    t triangleType(158.794, 492.071, 737.481) shouldBe 0
    t triangleType(48.541, 307.399, 396.279) shouldBe 0
    t triangleType(179.642, 208.601, 678.579) shouldBe 0
    t triangleType(309.163, 548.854, 891.475) shouldBe 0
    t triangleType(17.162, 227.642, 547.902) shouldBe 0
    t triangleType(353.636, 425.839, 938.05) shouldBe 0
    t triangleType(135.532, 477.857, 740.79) shouldBe 0
    t triangleType(141.61, 194.627, 265.506) shouldBe 3
    t triangleType(163.506, 260.597, 459.898) shouldBe 0
    t triangleType(580.757, 779.954, 946.2) shouldBe 1
    t triangleType(310.866, 471.112, 737.271) shouldBe 3
    t triangleType(301.246, 716.769, 725.027) shouldBe 1
  }
}
