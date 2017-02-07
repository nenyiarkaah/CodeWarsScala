import BestTravel.{SumOfK, _}
import GapinPrimes.GapinPrimes
import TheCouponCode.CouponCode
import makeBackronym.make

 var s = new SumOfK
//  val result = s chooseBestSum(163, 3, List(50, 55, 56, 57, 58))
//  println(result)

var m = new make
//m makeBackronym("interesting")


var c = new CouponCode
//c checkCoupon("123", "123", "September 5, 2014", "October 1, 2014")

var g = new GapinPrimes
g gap(2, 100, 110, None)
g gap(6, 100, 110, None)
g gap2(6, 100, 110)