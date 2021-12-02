package chapter08

object Pedding:
  def pedLines(line: String, minWidth: Int): String =

    def padLine(line: String): String =
      if line.length >= minWidth then line
      else line + " " * (minWidth - line.length)

    val paddedLines =
      for line <- line.linesIterator yield padLine(line)

    paddedLines.mkString("\n")
