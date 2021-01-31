package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val bhavyaEmployee: Employee = Employee("Bhavya","Verma",24,12000,"Intern","Knoldus","bhavya.verm@knoldus.com")
  val rahulEmployee: Employee = Employee("Rahul","Gupta",28,15000,"Software Engineer","Philips","rahul.gupta@philips.com")
  val employees: HashMap[String, Employee] = HashMap("Bhavya" -> bhavyaEmployee, "Rahul" -> rahulEmployee)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
