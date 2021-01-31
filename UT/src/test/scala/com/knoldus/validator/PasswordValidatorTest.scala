package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {
  "password" should "be invalid as it contains space" in {
    val password = new PasswordValidator("Bhavya2@ verma")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any digit" in {
    val password = new PasswordValidator("Bhavya#verma")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is less than 8" in {
    val password = new PasswordValidator("Bhav2$")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is more than 15" in {
    val password = new PasswordValidator("Bhavya@verma1997")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any lowercase letter" in {
    val password = new PasswordValidator("BHAVYA@VERMA2")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any uppercase letter" in {
    val password = new PasswordValidator("bhavya@verma2")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any special character" in {
    val password = new PasswordValidator("BhavyaVerma2")
    assert(!password.passwordIsValid)
  }

  "password" should "be valid" in {
    val password = new PasswordValidator("Bhavya@verma97")
    assert(password.passwordIsValid)
  }
}
