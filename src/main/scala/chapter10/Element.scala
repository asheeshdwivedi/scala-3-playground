package chapter10
import Element.elem

abstract class Element:

  def contents: Vector[String]

  def width: Int = if height == 0 then 0 else contents(0).length

  def height: Int = contents.length

  def above(that: Element): Element =
    val this1 = this.widen(that.width)
    val that1 = this.widen(this.width)
    elem(this1.contents ++ that1.contents)
  /*
   *  def below(that: Element): Element =
   *    val newContent = new Array[String](this.contents.length)
   *    for i <- 0 until this.contents.length do
   *      newContent(i) = this.contents(i) + that.contents(i)
   *    VectorElement(newContent.toVector)
   *
   */

  def beside(that: Element): Element =
    val this1 = this.heighten(that.height)
    val that1 = this.heighten(this.height)
    elem(
      for (line1, line2) <- this1.contents.zip(that1.contents)
      yield line1 + line2
    )

  def widen(w: Int): Element =
    if w <= width then this
    else
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right

  def heighten(h: Int): Element =
    if h <= height then this
    else
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot

  override def toString = contents.mkString("\n")

end Element

object Element:

  private class VectorElement(
      val contents: Vector[String]
  ) extends Element

  private class LineElement(s: String) extends Element:
    val contents = Vector(s)
    override def width: Int = s.length
    override def height: Int = 1

  private class UniformElement(
      ch: Char,
      override val width: Int,
      override val height: Int
  ) extends Element:
    private val line = ch.toString * width
    def contents = Vector.fill(height)(line)

  def elem(contents: Vector[String]): Element =
    VectorElement(contents)

  def elem(chr: Char, width: Int, height: Int): Element =
    UniformElement(chr, width, height)

  def elem(line: String): Element =
    LineElement(line)

end Element
