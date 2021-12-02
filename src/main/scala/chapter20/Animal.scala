package chapter20

class Food
class Grass extends Food
class DogFood extends Food
class Fish extends Food

abstract class Animal:
  type SuitableFood <: Food 
  def eat(suitableFood: SuitableFood): Unit 

class Cow extends Animal:
  override type SuitableFood = Grass

  override def eat(suitableFood: Grass): Unit = ()
  

class Dog extends Animal:
  override type SuitableFood = DogFood

  override def eat(suitableFood: DogFood): Unit = ()
  
  
  

