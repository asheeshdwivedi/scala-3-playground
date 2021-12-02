package chapter07

// Living without the break and continue
// Simple apporach is to replace every continue by an if and every break by an boolean variable
object WithOutBreakAndContinue:
  def main(args: Array[String]): Unit =
    var i = 0
    var foundIt = false

    while i < args.length && !foundIt do
      if !args(i).startsWith("_") then
        if args(i).endsWith(".sbt") then foundIt = true
        else i = i + 1
      else i = i + 1

  def searchFor(args: Array[String]): Unit =
    def searchFor(index: Int): Int =
      if index >= args.length then -1
      else if args(index).startsWith("_") then searchFor(index + 1)
      else if args(index).endsWith(".scala") then index
      else searchFor(index + 1)
