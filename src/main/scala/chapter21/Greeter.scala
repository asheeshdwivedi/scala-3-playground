package chapter21

class PreferredPrompt(val preference: String)
class PreferredDrink(val preference: String)

object Greeter:
  def greet(name: String)(using prompt: PreferredPrompt, drink: PreferredDrink) =
    println(s"Welcome, $name. The system is ready.")
    print("But while you work, ")
    println(s"why not enjoy a cup of ${drink.preference}?")
    println(prompt.preference)

object JoesPrefs:
  given prompt: PreferredPrompt = PreferredPrompt("relax> ")
  given drink: PreferredDrink = PreferredDrink("tea")



