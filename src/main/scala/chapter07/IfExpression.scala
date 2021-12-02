package chapter07

object IfExpression:
  def main(args: Array[String]): Unit =
    val filename =
      if !args.isEmpty then args(0)
      else "default.txt"

    println(filename)
