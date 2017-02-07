package makeBackronym

/**
  * Created by Nenyi on 29/01/2017.
  */
class make {

  def makeBackronym(string: String): String = {
    //your code here
    var backronym = string.split("").map(s => dict(s.toUpperCase))
    backronym.mkString(" ")
  }

  def dict(char: String): String = {
   val dictionary =  Map("A" -> "awesome",
    "B" -> "beautiful",
    "C" -> "confident",
    "D" -> "disturbing",
    "E" -> "eager",
    "F" -> "fantastic",
    "G" -> "gregarious",
    "H" -> "hippy",
    "I" -> "ingestable",
    "J" -> "joke",
    "K" -> "klingon",
    "L" -> "literal",
    "M" -> "mustache",
    "N" -> "newtonian",
    "O" -> "oscillating",
    "P" -> "perfect",
    "Q" -> "queen",
    "R" -> "rant",
    "S" -> "stylish",
    "T" -> "turn",
    "U" -> "underlying",
    "V" -> "volcano",
    "W" -> "weird",
    "X" -> "xylophone",
    "Y" -> "yogic",
    "Z" -> "zero")
    dictionary.getOrElse(char, "")
  }
}
