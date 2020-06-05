package com.fosscoder.transformations

object Simple {
  def main(args: Array[String]) {
    val intList = List(1,2,3,4)
    println(s"Integer list value is $intList")

    val mapTheList = intList.map(element =>  element+1)
    println(s"Updated integer list is $mapTheList")

    var copyTheList : List[Int] = Nil
    intList.foreach(element => copyTheList :+= element)
    println(s"copied list is $copyTheList")

    val firstTwoElements = intList.take(2)
    println(s"list with first 2 elements are $firstTwoElements")

    val listOfList = List(List(1,2), List(3,4))
    println(s"list of list is $listOfList")

    val flattenedList = listOfList.map(element => element).flatten
    println("flattened list is "+flattenedList)

    val flatMappedList = listOfList.flatMap(element => element)
    println(s"flatmapped list $flatMappedList")

    val flattenList = listOfList.flatten(element => element)
    println(s"flatten list $flattenList")

    val strTest = "The quick brown fox jumps over the lazy dog"
    println(strTest.groupBy(x => x.toLower).map(y => (y._1, y._2.length))) // .toList

  }
}
