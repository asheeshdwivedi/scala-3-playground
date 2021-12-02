package chapter11

import scala.collection.mutable.ArrayBuffer

abstract class IntQueue:
  def get(): Int
  def put(x: Int): Unit

class BasicIntQueue extends IntQueue:
  private val buf = ArrayBuffer.empty[Int]
  def get() =
    if buf.length > 0 then buf.remove(0) else throw new NoSuchElementException
  def put(x: Int) = buf += x

trait Incrementing extends IntQueue:
  abstract override def put(x: Int) = super.put(x + 1)

trait Filtering extends IntQueue:
  abstract override def put(x: Int) = if x >= 0 then super.put(x)  
