package com.fosscoder.caseclass

case class Student(userName:String, password:String = "123")

object CaseClassExample {
  def main(args: Array[String]) {

    val student = Student("student_123","mypassword@123")

    val studentUserName = student.userName

    println(s"Student user name is $studentUserName")

    val newStudentAdmission = student.copy(userName = "student_123")

    println(assert(student != newStudentAdmission))
  }
}
