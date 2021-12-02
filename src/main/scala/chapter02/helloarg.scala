package chapter02

object HelloArg {
  @main def ma(args: String*) =
    // say hello to the first argument
    println("Hello. " + args(0) + "!")
}
