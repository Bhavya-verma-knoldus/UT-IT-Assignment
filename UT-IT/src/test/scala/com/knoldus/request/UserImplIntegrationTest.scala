package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplIntegrationTest extends AnyFlatSpec {

  val companyName = new CompanyReadDto
  val validateEmail = new EmailValidator
  val userValidator = new UserValidator(companyName,validateEmail)

  val userImpl = new UserImpl(userValidator)

  "User" should "not be created as company does not exists in DB" in {
    val rahulUser: User = User("Rahul","Gupta",28,"Google","rahul.gupta@gmail.com")

    val result = userImpl.createUser(rahulUser)
    assert(result.isEmpty)
  }

  "User" should "not be created as email id is not valid" in {
    val shivamUser: User = User("Shivam","Aggarwal",23,"Knoldus","shivam.aggarwal@knoldus")

    val result = userImpl.createUser(shivamUser)
    assert(result.isEmpty)
  }

  "User" should "not be created as company does not exists in DB and email id is not valid" in {
    val gauravUser: User = User("Gaurav","Kumar",22,"Microsoft","gaurav.kumar@microsoft")

    val result = userImpl.createUser(gauravUser)
    assert(result.isEmpty)
  }

  "User" should "be created" in {
    val bhavyaUser: User = User("Bhavya","Verma",24,"Knoldus","bhavya.verm@knoldus.com")

    val result = userImpl.createUser(bhavyaUser)
    assert(!result.isEmpty)
  }

}
