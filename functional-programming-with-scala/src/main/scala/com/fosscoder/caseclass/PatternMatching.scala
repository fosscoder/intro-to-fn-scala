package com.fosscoder.caseclass


object PatternMatching {
  def matchElement(x: Any) {
    val matchedElement  = x match {

      // Matches a List(1,2,3)
      case List(1, 2, 3) => "Matched List(1, 2, 3)"

      // Matches a list with only one element and extracts the element by de-composing the list
      case z :: Nil => s"Only one element in the list $z"

      // Matches a list with head as an integer 2
      case 2 :: xs  => s"A list with head 2 and tail $xs"

      // Matches a list that has integer 3 followed by 4 and other elements
      // Decomposes a list and extract rest of the list excluding the first two elements
      case List(3, 4, xs @ _*) => s"A list with  3, 4 and tail $xs"

      // Decomposing a list as head and tail
      case y :: xs => s"A list with head $y and tail $xs"

      // Matches any string element
      case s:String => s"its a string with value : $s"

      // Matches an empty list or null
      case nil => "Empty List"
      // Matching an empty list using constructor decomposition !
      //case List() =>  "Empty List"

    }
    println(matchedElement)
  }

  def main(args: Array[String]) {
    matchElement(List(1,2,3))

    matchElement(List(1))

    matchElement(List(2,3,4))

    matchElement(List(3,4,5,6,7,8,9))

    matchElement(List(4,5,6,7,8,9))

    matchElement(List())

    matchElement("Hello")

    matchElement(null)
  }
}
