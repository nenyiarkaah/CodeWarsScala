package WriteNumberinExpandedForm

/**
  * Created by Nenyi on 09/02/2017.
  */
class ExpandedForm {
  def expandedForm(num: BigInt): String = {
    var unitBase = 10
    println(num.toString.reverse)
    num.toString.reverse.map(_.asDigit).zipWithIndex.map {
      case (n, i) => if (n != 0) n * math.pow(unitBase, i).toLong
    }.reverse.filter(_ != ()).mkString(" + ")
  }
}
