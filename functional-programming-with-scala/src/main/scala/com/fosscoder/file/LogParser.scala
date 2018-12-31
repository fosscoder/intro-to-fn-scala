package com.fosscoder.file

import java.io.File
object LogParser {
  def main(args: Array[String]): Unit = {

    val directoryPath = "/home/chetan/Downloads"
    println(getCsv(directoryPath))

    def getCsv(path: String): List[String] = {
      val directory = new File(path)
      var files: List[String] = List()
      if (directory.exists && directory.isDirectory) {
        files = directory.listFiles().filter(file => file.isFile && file.getName.endsWith(".csv")).map(file => file.getAbsoluteFile.toString).toList
      }
      files
    }

  }

}