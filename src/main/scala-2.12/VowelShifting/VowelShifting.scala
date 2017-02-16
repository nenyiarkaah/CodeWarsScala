package VowelShifting

/**
  * Created by Nenyi on 16/02/2017.
  */
class VowelShifting {
  val vowels = List("a", "i", "u", "e", "o", "A", "I", "U", "E", "O")

  def vowelShift(text: String, n: Int) = {

    text match {
      case null => Nil
      case "" => ""
      case _ =>
        var array = text.split("")
        val textVowel = array.zipWithIndex.filter(a => vowels.contains(a._1)).toList
        val rotatedTextVowel = textVowel.zip(rotate(textVowel.map(a => a._2), n))
        rotatedTextVowel.foreach(t => {
          array = array.patch(t._2, List(t._1._1), 1)
        })
        array.mkString("")
    }
  }

  def rotate(a: List[(Int)], n: Int): List[Int] = {
    n match {
      case 0 => a
      case x if (x > 0) =>
        a match {
          case head :: xs => rotate(xs ::: List(head), x - 1)
          case Nil => rotate(Nil, x - 1)
        }
      case x if (x < 0) =>
        a.reverse match {
          case head :: xs => rotate(head :: xs.reverse, x + 1)
          case Nil => rotate(Nil, x + 1)
        }
    }
  }


}
