package FindTheMissingLetter

/**
  * Created by Nenyi on 11/02/2017.
  */
class FindMissingLetter {


  def findMissingLetter(array: Array[Char]): String = {
    val isUpper = array(0) match {
      case x if Character.isUpperCase(x) => true
      case _ => false
    }
    val alphabet = isUpper match {
      case true => ('A' to 'Z').toList
      case false => ('a' to 'z').toList
    }
    val indexes = array.map(a => alphabet.indexOf(a))
    val missing = (indexes.min to indexes.max).toList.filterNot(indexes.toSet)
    missing.map(m => alphabet(m)).mkString(",")
  }
}
