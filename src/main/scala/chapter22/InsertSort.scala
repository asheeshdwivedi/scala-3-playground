package chapter22

object InsertSort:
  def isort[T](xs: List[T])(using Ord[T]): List[T] =
    if xs.isEmpty then Nil
    else insert(xs.head, isort(xs.tail))
    
  def insert[T](x: T, xs: List[T])(using Ord[T]): List[T] =
    if xs.isEmpty || x <= xs.head then x :: xs
    else xs.head :: insert(x, xs.tail)

