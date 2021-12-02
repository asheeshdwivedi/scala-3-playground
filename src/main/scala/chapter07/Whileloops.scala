package chapter07

object WhileLoops:
  def main(agrs: Array[String]): Unit = println(gcdLoop(162, 72))

  def gcdLoop(x: Long, y: Long): Long =
    var a = x
    var b = y
    while a != 0 do
      val temp = a
      a = b % a
      b = temp
    b
