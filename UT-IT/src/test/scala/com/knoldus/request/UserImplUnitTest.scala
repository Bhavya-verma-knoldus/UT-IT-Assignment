package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val bhavyaUser: User = User("Bhavya","Verma",24,"knoldus","bhavya.verm@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(bhavyaUser)) thenReturn(true)
    val result = userImpl.createUser(bhavyaUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(bhavyaUser)) thenReturn(false)
    val result = userImpl.createUser(bhavyaUser)
    assert(result.isEmpty)
  }

}
