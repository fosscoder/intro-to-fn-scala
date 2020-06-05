package com.fosscoder.exceptionhandling

import java.io.{IOException, FileNotFoundException, FileReader}

object ExceptionsExample {
  def createExampleFile(fileName: String) {
    if(!(fileName endsWith ".scala"))
      throw new IllegalArgumentException("File name should end with .scala")
  }

  def printFileContent(fileName: String) {
    var file : FileReader = null
    try {
      file = new FileReader("sample.txt")
    } catch {
      case ex: FileNotFoundException => // Handle the missing file
      case ex: IOException => // Handle other I/O errors
    } finally {
      file.close() // whether exception has thrown or not, file should be closed before control is transferred to
      // the caller method
    }
  }

  def convToInt(str: String) : Int = {
    try{
      str.toInt
    } catch {
      case numberFormat : NumberFormatException =>
        throw new Exception(s"Cannot convert your given text '$str' to integer, Exception ${numberFormat.getStackTrace}")
    }
  }

  def main(args: Array[String]) {
    println(createExampleFile("sample"))
    println(convToInt("20"))
    println(convToInt("incorrect-input"))
    print(printFileContent("incorrect-file"))
  }
}
