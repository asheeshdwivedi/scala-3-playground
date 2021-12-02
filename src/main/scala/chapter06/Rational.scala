package chapter06
import chapter21.Ord

object Rational:

  def apply(numer: Int, denom: Int = 1) =
    new Rational(numer, denom)

  given Ord[Rational] with
    override def compare(x: Rational, y: Rational): Int =
      if x.numer * y.denom < x.denom * y.numer then -1
      else if x.numer * y.denom > x.denom * y.numer then 1
      else 0

end Rational

class Rational(n: Int, d: Int):
  // checking precondition
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational =
    Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def +(i: Int): Rational =
    Rational(numer + 1 * denom, denom)

  def -(that: Rational): Rational =
    Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def *(that: Rational): Rational =
    Rational(
      numer * that.numer,
      denom * that.denom
    )

  def *(i: Int): Rational =
    Rational(numer * i, denom)

  def -(i: Int): Rational =
    Rational(numer - 1 * denom, denom)

  def /(that: Rational): Rational =
    Rational(numer * that.denom, denom * that.numer)

  def /(i: Int): Rational =
    Rational(numer, denom * i)

  def lessThen(that: Rational): Boolean =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if lessThen(that) then that else this

  override def toString: String = s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)

  /** * These comparision method are refactored in chapter11 by using the
    * Ordered trait*** Thin verus rich interfaces concept!!
    */
  def <(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def >(that: Rational) = that < this

  def <=(that: Rational) = (this < that) || (this == that)

  def >=(that: Rational) = (this > that) || (this == that)

  /** * These comparision method are refactored in chapter11 by using the Ordered
    * trait**
    */

end Rational

