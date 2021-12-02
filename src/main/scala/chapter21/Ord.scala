package chapter21

trait Ord[T]:
  def compare(x: T, y: T): Int
  def lteg(x: T, y: T): Boolean = compare(x, y) < 1

object Ord:
  given Ord[Int] with
    override def compare(x: Int, y: Int): Int = if x == y then 0 else if x > y then 1 else -1

  given Ord[String] with
    override def compare(x: String, y: String): Int = x.compareTo(y)