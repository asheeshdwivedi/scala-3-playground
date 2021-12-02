package chapter04

import ChecksumAccumulator.calculate

object Summer:
   def main(args:Array[String]): Unit =
     for arg <- args do
        println(s"$arg ${calculate(arg)}")
