package chapter16

class Keyed:
  def computeKey: Int =
    Thread.sleep(1000l)
    Math.random().toInt
    
    
class MemoKeyed extends Keyed:
  private var keyCache: Option[Int]  = None

  override def computeKey: Int =
    if !keyCache.isDefined then
      keyCache = Some(super.computeKey)
    keyCache.get  


