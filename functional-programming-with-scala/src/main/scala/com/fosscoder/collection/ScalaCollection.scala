package com.fosscoder.collections

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


object ScalaCollection  {
  def main(args: Array[String]) {

    // Different types of immutable collections

    val listOfInt : List[Int] = List(1,2,3)
    println(listOfInt)

    // It'll not allow to do, this is immutable data structure, won't allow you to change
    // list += 5

    val nonTypeSpecifiedList = List(1,2,3)
    println(nonTypeSpecifiedList)

    val arrayOfInt : Array[Int] = Array(1,2,3)
    println(arrayOfInt.length)

    val mapCollection : Map[String,Int] = Map("January" -> 0,"February" -> 1)
    println(mapCollection)

    val setOfString : collection.Set[String] = mutable.Set("Hey", "how", "do", "you", "do")
    println(setOfString)

    val tupleOfTwoElements : Tuple2[Int, Int] = Tuple2(1,2)
    println(tupleOfTwoElements)

    val tupleWithMixedDataTypes : Tuple3[Int, String, Double] = Tuple3(1, "One", 1.0)
    println(tupleWithMixedDataTypes)

    // Mutable collections
    val listBuf = new ListBuffer[Int]
    println(listBuf)

    // allows to add the values, because this is mutable
    println(listBuf += 5)

  }
}
