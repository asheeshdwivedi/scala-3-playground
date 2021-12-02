package chapter21

import chapter06.Rational

object Test extends App:
  println(InsertSort.isort(List(Rational(4,5), Rational(1,2) , Rational(2,3))))
  println(InsertSort.isort(List(2, 10,-10)))
  println(InsertSort.isort(List("mango", "jackfruit", "duration")))
