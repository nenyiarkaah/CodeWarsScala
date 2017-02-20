package TriangleType2

/**
  * Created by Nenyi on 20/02/2017.
  */
class TriangleType2 {
  //Non Cosine way
  def triangleType(a: Double, b: Double, c: Double): Int = {
    val sides = List(a, b, c).sorted
    val anew = sides(0)
    val bnew = sides(1)
    val cnew = sides(2)

    val result = if (anew <= cnew - bnew) 0
    else if (cnew * cnew == anew * anew + bnew * bnew) 2
    else if (cnew * cnew > anew * anew + bnew * bnew) 3
    else 1
    result
  }
}
