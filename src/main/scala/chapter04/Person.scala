package chapter04

case class Person(name: String, age: Int):

  def appendToName(suffix: String): Person =
    Person(s"$name $suffix", age)

object Person:

  def apply(name: String, age: Int): Person =
    val capitalizedName =
      if !name.isEmpty then
        val firstChar = name.charAt(0).toUpper
        val restOfName = name.substring(1)
        s"$firstChar$restOfName"
      else throw IllegalArgumentException("Empty name")
    new Person(capitalizedName, age)
