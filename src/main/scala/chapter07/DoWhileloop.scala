package chapter07

import scala.io.StdIn.readLine

object DoWhileloops:
  def main(args: Array[String]): Unit =
    while
      val line = readLine()
      println(s"Read: $line")
      line != ""
    do ()
