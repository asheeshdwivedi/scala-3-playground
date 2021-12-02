package chapter16
import scala.compiletime.uninitialized
//It's also possible to define getter and setter without an associated field
class Thermometer:
  var celsius: Float = uninitialized

  def fahrenheit = celsius * 9 / 5 + 32

  def fahrenheit_=(f: Float) =
    celsius = (f - 32) * 5 / 9

  override def toString: String = s"${fahrenheit}F/${celsius}C"

