package com.fosscoder.evalmodel

object Example extends App {

  // eager, memoized
  val x = {
    println("Computing x")
    math.random
  }
  println(s"print - 1 - x: $x")
  println(s"print - 2 - x: $x")

  // lazy, memoized
  def y = {
    println("Computing y")
    math.random
  }

  println(s"print - 1 - y: $y")
  println(s"print - 2 - y: $y")

  // lazy, not memoized
  lazy val z = {
    println("Computing z")
    math.random
  }

  println(s"print - 1 - z: $z")
  println(s"print - 2 - z: $z")

}
