package chapter03

import java.time.Instant


object GreetStrings {
val a : Instant = Instant.now

@main def maing() =
 val greetStrings = new Array[String](3)
 greetStrings(0) = "Hello"
 greetStrings(1) = " "
 greetStrings(2) = "world!\n"
 for i <- 0 to 2 do
   print(greetStrings(i))
}
