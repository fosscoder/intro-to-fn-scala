package com.fosscoder.exceptionhandling

import scala.util.{Success, Failure, Try}

object UsingOptions {
  def convertToInt(str: String) : Option[Int] = {
    val intValue = Try(str.toInt)
    intValue match {
      case Failure(exception) => {
        println(s"Cannot convert $str to integer returning default value 0")
        None
      }
      case Success(number) => {
        println(s"successfully converted string $str to integer")
        Some(number)
      }
    }
  }



  def main(args: Array[String]) {
    val strValue = "20"
    convertToInt(strValue).getOrElse(0)

    val invalidStringInput = "Hey!"
    convertToInt(invalidStringInput).getOrElse(0)

    val number: Option[Int] = Option(5)
    number match {
      case Some(x) => println("Integer")
      case None => println("Non Integer")
      case _ => None
    }

  }
}
