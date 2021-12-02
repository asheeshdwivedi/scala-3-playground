package chapter16

class BankAccount:
  private var bal: Int = 0
  
  def balance: Int = bal
  
  def deposit(amount: Int): Unit =
    require(amount > 0)
    bal += amount
    
  def withdraw(amount: Int): Boolean =
    if amount > bal then false
    else 
      bal -= amount
      true

