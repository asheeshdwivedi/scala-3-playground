// Scope of protection
// Access modifiers in scala can be augmented with qualifiers.
// private[X] or protected[X] means that access is private or protected "up to" X, where X designate some enclosing package, class or singleton object
// Qualified access modifiers gives you fine-grained control over visibility. In perticular they enable you to express Java's accessibility notions,
// such as package private ,package protected, or private up to outer most class
package chapter12

package navigation:
  private [chapter12] class Navigator:
    protected [navigation] def useStartChart() = {}
    class LegOfJourney:
      private [Navigator] val distance = 100

package launch:
  import navigation.*
  object Vehicle:
    private [launch] val guide = new Navigator
