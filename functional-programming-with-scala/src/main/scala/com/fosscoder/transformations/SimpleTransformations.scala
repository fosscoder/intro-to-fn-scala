package com.fosscoder.transformations

object SimpleTransformations {
  def main(args: Array[String]) {
    val integerList = List(1,2,3,4)
    println("Integer list value is "+integerList)

    val mappedList = integerList.map(element =>  element+1)
    println("Updated integer list is "+mappedList)

    var copiedList : List[Int] = Nil
    integerList.foreach(element => copiedList :+= element)
    println("copied list is "+copiedList)

    val firstTwoElements = integerList.take(2)
    println("list with first 2 elements are "+firstTwoElements)

    val listOfList = List(List(1,2), List(3,4))
    println("list of list is "+listOfList)

    val flattenedList = listOfList.map(element => element).flatten
    println("flattened list is "+flattenedList)

    val flatMappedList = listOfList.flatMap(element => element)
    println("flat mapped list "+flatMappedList)

    val strTest = "The quick brown fox jumps over the lazy dog"
    strTest.groupBy(x => x.toLower).map(y => (y._1, y._2.length)) // .toList

  }
}
