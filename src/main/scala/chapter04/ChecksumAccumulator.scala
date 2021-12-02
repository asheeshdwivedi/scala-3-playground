package chapter04

class ChecksumAccumulator:
  private var sum = 0

  def add(b: Byte): Unit = sum += b

  def checksum(): Int = return ~(sum & 0xff) + 1

object ChecksumAccumulator:
  import scala.collection.immutable

  private var cache = immutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if (cache.contains(s)) then cache(s)
    else
      val acc = new ChecksumAccumulator
      for c <- s do
        acc.add((c >> 8).toByte)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
