package chapter02

object PrintArgs {
  @main def mi(args: String*) =
    var i = 0

    while i < args.length do
      println(args(i))
      i += 1
}
