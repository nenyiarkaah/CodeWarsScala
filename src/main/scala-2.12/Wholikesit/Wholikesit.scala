package Wholikesit

/**
  * Created by Nenyi on 15/02/2017.
  */
class Wholikesit {

  def likes(names: List[String]) = {
    names.length match {
      case 0 => "no one likes this"
      case 1 => names.mkString("") + " likes this"
      case n if (n == 2) => names.mkString(" and ") + " like this"
      case n if (n == 3) => names.mkString(" and ").replaceFirst(" and", ",") + " like this"
      case n if (n >= 4) => names.slice(0, 2).mkString(", ").replaceFirst(" and", ",") + " and " + (n - 2) + " others like this"
    }
  }

}
