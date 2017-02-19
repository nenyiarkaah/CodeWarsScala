package IsThisATriangle

/**
  * Created by Nenyi on 19/02/2017.
  */
class IsThisATriangle {

  def isTriangle(a: Int, b: Int, c: Int): Boolean = {
    a + b > c && a + c > b && c + b > a
  }
}
