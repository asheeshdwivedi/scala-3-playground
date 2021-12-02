package chapter07

object NestedIteration:
  def main(args: Array[String]): Unit =
    grep(".*scala.*")
    forLineLengths.foreach(println)

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toArray

  def grep(pattern: String) =
    val filesHere = (new java.io.File(".")).listFiles
    for
      file <- filesHere
      if file.getName.endsWith(".sbt")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    do println(s"$file : ${trimmed}")

  def forLineLengths: Array[Int] =
    val filesHere = (new java.io.File(".")).listFiles
    for
      file <- filesHere
      if (file.getName.endsWith(".sbt"))
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*scala.*")
    yield trimmed.length
