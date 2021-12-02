// Concise access to classes and packages
package bobsrockets:
  package navigation:
    class Navigator:
      // no need to say bobsrockets.navigation.StratMap
      val map = new StartMap
    class StartMap
  class Ship:
    // no need to say bobsrockets.navigation.Navigator
    val nav = new navigation.Navigator
  package fleets:
    class Fleet:
      // no need to say bobsrockets.Ship
      def addShip = new Ship

