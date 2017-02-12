package TheCouponCode

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 30/01/2017.
  */
class CouponCodeTest extends FlatSpec with BeforeAndAfter {

  var c: CouponCode = _
  before {
    c = new CouponCode
  }
  "checkCoupon" should
    "Handle Example Tests" in {
    c checkCoupon("123", "123", "September 5, 2014", "October 1, 2014") shouldBe true

    c checkCoupon("123a", "123", "September 5, 2014", "October 1, 2014") shouldBe false
  }

  it should "Handle Basic Tests" in {
    c checkCoupon("123", "123", "September 5, 2014", "October 1, 2014") shouldBe true

    c checkCoupon("123a", "123", "September 5, 2014", "October 1, 2014") shouldBe false

    c checkCoupon("12abcd3", "12abcd3", "January 5, 2014", "January 1, 2014") shouldBe false

    c checkCoupon("123ablqc0", "123ablqc0", "July 5, 2000", "July 5, 2000") shouldBe true

    c checkCoupon("abc", "abc", "November 8, 2013", "November 5, 2014") shouldBe true

    c checkCoupon("0", "false", "September 5, 2014", "September 25, 2014") shouldBe false

    c checkCoupon("1", "true", "September 5, 2014", "September 25, 2014") shouldBe false

    c checkCoupon("2", "2", "September 25, 2014", "September 5, 2014") shouldBe false

    c checkCoupon("a12v564", "a12v564", "March 5, 1998", "March 25, 1998") shouldBe true
  }

  it should "Handle Random Tests" in {
    c checkCoupon("bdab987ba8f", "5nyi7n868u696u0u6", "February 12, 1992", "April 18, 1989") shouldBe false

    c checkCoupon("bdab987ba8f", "5nyi7n868u696u0u6", "October 1, 1997", "December 17, 1995") shouldBe false

    c checkCoupon("5nyi7n868u696u0u6", "bdab987ba8f", "June 12, 1995", "July 25, 2019") shouldBe false

    c checkCoupon("bdab987ba8f", "5nyi7n868u696u0u6", "July 13, 2013", "June 21, 1997") shouldBe false

    c checkCoupon("5nyi7n868u696u0u6", "5nyi7n868u696u0u6", "June 28, 1981", "August 16, 2002") shouldBe true

    c checkCoupon("bdab987ba8f", "5nyi7n868u696u0u6", "August 4, 2020", "April 8, 1998") shouldBe false

    c checkCoupon("5nyi7n868u696u0u6", "5nyi7n868u696u0u6", "February 25, 1985", "June 8, 2002") shouldBe true

    c checkCoupon("5nyi7n868u696u0u6", "bdab987ba8f", "January 2, 2002", "December 8, 2010") shouldBe false

    c checkCoupon("bdab987ba8f", "5nyi7n868u696u0u6", "May 8, 1983", "March 13, 1989") shouldBe false

    c checkCoupon("5nyi7n868u696u0u6", "5nyi7n868u696u0u6", "June 14, 2001", "July 7, 1999") shouldBe false

    c checkCoupon("bdab987ba8f", "bdab987ba8f", "October 4, 2009", "June 16, 2006") shouldBe false

    c checkCoupon("bdab987ba8f", "bdab987ba8f", "May 10, 1995", "November 14, 2002") shouldBe true

    c checkCoupon("5nyi7n868u696u0u6", "5nyi7n868u696u0u6", "January 15, 1985", "October 3, 2013") shouldBe true

    c checkCoupon("bdab987ba8f", "bdab987ba8f", "February 4, 1993", "November 1, 2015") shouldBe true

    c checkCoupon("5nyi7n868u696u0u6", "bdab987ba8f", "October 11, 1998", "June 13, 1985") shouldBe false

    c checkCoupon("0a12bc64", "0a12bc64", "March 6, 2005", "March 5, 2006") shouldBe true
  }

}
