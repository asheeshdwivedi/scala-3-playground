package chapter09

object FileMatcher:
  private def filesHere = (new java.io.File(".")).listFiles

  def fileMatching(matcher: String => Boolean) =
    for file <- filesHere if matcher(file.getName)
    yield file

  def fileEnding(query: String) =
    fileMatching(_.endsWith(query))

  def filesContaing(query: String) =
    fileMatching(_.contains(query))

  def filesRegx(query: String) =
    fileMatching(_.matches(query))

/*
 *  def filesEnding(query: String) =
 *    for file <- filesHere if file.getName.endsWith(query)
 *    yield file
 *
 *  def filesContaing(query: String) =
 *    for file <- filesHere if file.getName.contains(query)
 *    yield file
 *
 *  def filesRegx(query: String) =
 *    for file <- filesHere if file.getName.matches(query)
 *    yield file
 */
