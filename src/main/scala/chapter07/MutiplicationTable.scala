package chapter07

object MutiplicationTable:

  def main(args: Array[String]): Unit =
    imparativePrintMultiTable()
    println()
    println(functionalGetMuliTable())

  def imparativePrintMultiTable(): Unit =
    var i = 1
    while i <= 10 do
      var j = 1
      while j <= 10 do
        val product = (i * j).toString
        var k = product.length
        while k < 4 do
          print(" ")
          k += 1
        print(product)
        j += 1
      println()
      i += 1

  def functionalGetMuliTable(): String =
    def makeRowString(row: Int): Seq[String] =
      for col <- 1 to 10 yield
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod

    def makeRow(row: Int): String = makeRowString(row).mkString

    def multiTable(): String =
      val tableSeq =
        for row <- 1 to 10 yield makeRow(row)
      tableSeq.mkString("\n")

    multiTable()
