package TriangleType

/**
  * Created by Nenyi on 20/02/2017.
  */
class TriangleType {
  //using Cosine & Sine Laws
  def triangleType(a: Double, b: Double, c: Double): Int = {
    val sides = List(a, b, c).sorted
    val C = resolveC(sides(0), sides(1), sides(2))
    toDegree(C) match {
      case x if x.isNaN => 0
      case 180 => 0
      case _ =>
        resolveAandBandC(sides(0), sides(1), sides(2), C).sorted.last match {
          case x if x < 90 => 1
          case 90 => 2
          case x if x > 90 => 3
        }
    }
  }

  private def resolveC(a: Double, b: Double, c: Double) = {
    val power = 2
    val num = Math.pow(a, power) + Math.pow(b, power) - Math.pow(c, power)
    val denom = 2 * a * b
    Math.acos(num / denom)
  }

  private def toDegree(rad: Double) = {
    rad * (180 / Math.PI)
  }

  private def resolve(side1: Double, side2: Double, Angle1: Double) = {
    Math.asin((Math.sin(Angle1) / side1) * side2)
  }

  private def resolveAandBandC(a: Double, b: Double, c: Double, C: Double) = {
    val B = resolve(c, b, C)
    val A = resolve(b, a, B)
    List(toDegree(A), toDegree(B), toDegree(C))
  }

}
