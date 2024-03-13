Within the `comp1110.homework.O01` package of the `comp1110-homework` project,
create a class `Rocket` that stores information about a rocket including: name,
effective exhaust velocity, wet mass, and dry mass.

* The class will have a constructor `Rocket(String name, double effectiveExhaustVelocity,
  double wetMass, double dryMass)`.

* The class should have a public instance method, `getDeltaV()` that returns a `double` reflecting the rocket's 
[delta-v](https://en.wikipedia.org/wiki/Delta-v) using the 
[Tsiolkovsky rocket equation](https://en.wikipedia.org/wiki/Tsiolkovsky_rocket_equation) 
(dv = effective exhaust velocity (km/s) * ln(wet mass (tons) / dry mass (tons)) ). 
`ln` is the natural logarithm - in Java, you can use the `Math.log` method.

* The class should have a public `toString()` method that returns a `String` like
`The Big Single-Stage Rocket is a rocket with an effective exhaust velocity of 2.4km/s, a wet mass of 2900.0 tons, 
a dry mass of 208.0 tons, and therefore a delta-v of 6.323827047055793km/s.` 
(just print the `double`s without special formatting).

Implement this class (if you wish you may implement a main method that demonstrates its use).

Once you have it working, add and commit your work.
