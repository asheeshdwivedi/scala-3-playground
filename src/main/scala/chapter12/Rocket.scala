package chapter12

// A class Share all its access rights with its companion object and vice versa.
// In particular, an object can access all private members of its companion class, just as a class can access all private members of its companion object.

class Rocket:
  import Rocket.fuel
  private def canGoHomeAgain = fuel > 20

object Rocket:
  private def fuel = 10
  def chooseStrategy(rocket: Rocket) =
    if rocket.canGoHomeAgain then
      goHome()
    else
      pickAStar()

  def goHome() = {}
  def pickAStar() = {}
