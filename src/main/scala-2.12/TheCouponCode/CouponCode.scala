package TheCouponCode

import java.text.SimpleDateFormat

/**
  * Created by Nenyi on 30/01/2017.
  */
class CouponCode {
  def checkCoupon(enteredCode: String, correctCode: String, currentDate: String, expirationDate: String): Boolean = {
    val c = new SimpleDateFormat("MMM dd, yyyy").parse(currentDate)
    val e = new SimpleDateFormat("MMM dd, yyyy").parse(expirationDate)
    enteredCode == correctCode && (c.before(e) | c.equals(e))
  }
}
