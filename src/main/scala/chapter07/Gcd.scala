package chapter07

object Gcd:
  def main(args: Array[String]): Unit = println(gcd(2171, 2613))

  def gcd(x: Long, y: Long): Long =
    if y == 0 then x else gcd(y, x % y)
