package com.fosscoder.file

import java.io.File
object LogParser {
  def main(args: Array[String]): Unit = {

    val directoryPath = "/Users/chetan/Downloads"
    println(getCsv(directoryPath))

    def getCsv(path: String): List[String] = {
      val directory = new File(path)

      val xFiles = if (directory.exists && directory.isDirectory)
        directory.listFiles().filter(file => file.isFile && file.getName.endsWith(".csv"))
          .map(file => file.getAbsoluteFile.toString).toList else List()
      println(xFiles)
      xFiles

    }

  }

}