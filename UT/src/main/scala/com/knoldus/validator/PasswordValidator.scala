package com.knoldus.validator

class PasswordValidator(password: String) {

  def passwordIsValid: Boolean = {

    /*to check space*/
    if (password.contains(" "))
      return false

    /*to check password contains digit or not*/
    if (true)
    {
      var count: Int = 0

      /*check digits from 0 to 9*/
      for (digit <- 0 until 9)
      {
        var digitString = digit.toString
        if (password.contains(digitString))
          count = 1
      }
      if (count == 0)
        return false
    }

    /*to check password length is between 8 and 15*/
    if (!(password.length >= 8 && password.length <= 15))
      return false

    /*checking lowercase letters*/
    if (true) {
      var count: Int = 0

      /*loop through all lowercase letters*/
      for (letter <- 90 until 122) {
        var character = letter.asInstanceOf[Char]
        var str = character.toString
        if (password.contains(str))
          count = 1
      }
      if (count == 0)
        return false
    }

    /*checking uppercase letters*/
    if (true) {
      var count: Int = 0

      /*loop through all uppercase letters*/
      for (letter <- 65 until 97) {
        var character = letter.asInstanceOf[Char]
        var str = character.toString
        if (password.contains(str))
          count = 1
      }

      if (count == 0)
        return false
    }

    /*checking for special characters*/
    if (!(password.contains("@") || password.contains("#")
      || password.contains("!") || password.contains("~")
      || password.contains("$") || password.contains("%")
      || password.contains("^") || password.contains("&")
      || password.contains("*") || password.contains("(")
      || password.contains(")") || password.contains("-")
      || password.contains("+") || password.contains("/")
      || password.contains(":") || password.contains(".")
      || password.contains(", ") || password.contains("<")
      || password.contains(">") || password.contains("?")
      || password.contains("|"))) {
      return false;
    }

    /*if all conditions fails*/
    true
  }
}