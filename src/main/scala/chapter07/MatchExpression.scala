package chapter07

object MatchExpression:
  def main(args: Array[String]): Unit =
    val firstArg = if !args.isEmpty then args(0) else ""
    println(friend(firstArg))

  def friend(firstArg: String): String =
    firstArg match
      case "salt"  => "pepper"
      case "chips" => "salsa"
      case "eggs"  => "bacon"
      case _       => "huh?"
