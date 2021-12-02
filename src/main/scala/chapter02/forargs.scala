package chapter02

object ForArgs{
@main def main(args: String*) = 
  for arg <- args do
    println(arg)
}
