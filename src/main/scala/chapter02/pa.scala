package chapter02

object Pa {
  @main def pmaina(args: String*) =
    // if a function literal consists of one statement which takes single argument we can avoid arg => println(arg) and replace with just println
    args.foreach(println)
}
