package toplevelDefinitions
import bobsdelights.Fruit

  def shoFruit(fruit: Fruit) =
    import fruit.*
      s"${name}s are $color"

