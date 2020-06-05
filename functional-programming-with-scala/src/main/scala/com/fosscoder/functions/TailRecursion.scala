package com.fosscoder.functions

import scala.annotation.tailrec

object TailRecursion {
  // Normal recursion (if you put tail recursion notation then it will lead to compilation error)
  // @tailrec
  def recursiveSum(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + recursiveSum(xs.tail)
  }

  @tailrec
  def tailRecursiveSum(ints: List[Int], acc: Int): Int = {
    ints match {
      case Nil => acc
      case x :: tail => tailRecursiveSum(tail, acc + x)
    }
  }

  def main(args: Array[String]) {
    val list = List(1,2,3)
    println(s"sum using normal recursive method is ${recursiveSum(list)}")

    /*
        normalSum(List(1,2,3)) -> 1 + List(2,3)
        1 + (2 + List(3))
        1 + (2 + (3 + 0))
        1 + (2 + 3)
        1 + 5
        6
     */

    println(s"sum using tail recursive method is ${tailRecursiveSum(list,0)}")

    /*
        sum(List(1,2,3)) -> sum(List(2,3),0+1)
        sum(List(3),1+2)
        sum(Nil,3+3)
        6
     */

  }
}
