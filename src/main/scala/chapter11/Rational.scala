package chapter11

class Rational(n: Int, d: Int) extends Ordered[Rational]:
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

  /*
   *  def <(that: Rational) =
   *    this.numer * that.denom < that.numer * this.denom
   *
   *  def >(that: Rational) = that < this
   *
   *  def <=(that: Rational) = (this < that) || (this == that)
   *
   *  def >=(that: Rational) = (this > that) || (this == that)
   *
   */
  // all the comparison method is got replaced by this Single mehod with the help of Ordered trait!
  override def compare(that: Rational) =
    (this.numer * that.denom) - (that.numer * this.denom)

end Rational

object Rational:
  def apply(numer: Int, denom: Int = 1) =
    new Rational(numer, denom)
