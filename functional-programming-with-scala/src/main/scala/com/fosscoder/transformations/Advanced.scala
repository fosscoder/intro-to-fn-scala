package com.fosscoder.transformations

object Advanced {
  def main(args: Array[String]) {
    val intList = List(2,4,1,3)

    val sumUsingReduce = intList.reduce((accum, element) => accum + element)
    println(s"sum value is $sumUsingReduce")

    val sumUsingReduce2 = intList.reduce(_ + _)
    println(s"sum value is for part 2: $sumUsingReduce2")

    val listOfTuple = List((1,5),(2,6),(3,7),(1,4))
    val groupedList = listOfTuple.groupBy(element => element._1)

    println(s"grouped data is $groupedList")

    // You can write also: intList.fold(0)(_ + _)
    val sumUsingFold = intList.fold(0)((element, accum) => accum + element)

    val maxUsingFoldLeft = intList.foldLeft(0)((accum, element) => accum max element)
    println(s"max value is $maxUsingFoldLeft")

    val sumOfList = intList.sum
    println(s"integer list sum using fold $sumUsingFold with Scala api $sumOfList")

    val filteredList = intList.filter(element => element < 2)
    println(s"list containing values which is less than 3 is $filteredList")

  }
}
