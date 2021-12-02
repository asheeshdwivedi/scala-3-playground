package printmenu

import bobsdelights.Fruits
import toplevelDefinitions.shoFruit

object PrintMenu:

  def main(args: Array[String]) =
    println(
      for fruit <- Fruits.menu yield shoFruit(fruit)
    )
