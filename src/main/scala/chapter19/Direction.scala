package chapter19

import chapter19.Direction.{East, North, South, West}
//1.  We can give an EDT value parameters,
//2. We can define our own method on an enum types such as invert
//3 . We can define the companion object for an EDt. in which case Scala will still
// fill the valueOf and values methods if we do not provide them
enum Direction(val degree: Int):
  def invert: Direction =
    this match {
      case North => South
      case East  => West
      case West  => East
      case South => East
    }
  case North extends Direction(0)
  case East extends Direction(90)
  case West extends Direction(180)
  case South extends Direction(270)

object Direction:
  def nearestTo(degrees: Int): Direction =
    val rem = degrees % 360
    val angle = if rem < 0 then rem + 360 else rem
    val (ne, se, sw, nw) = (45, 135, 225, 315)
    angle match
      case a if a > nw || a <= ne => North
      case a if a > ne && a <= se => East
      case a if a > se && a <= sw => South
      case a if a > sw && a <= nw => West
