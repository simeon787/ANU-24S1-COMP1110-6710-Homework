package comp1110.homework.O01;

public class Rocket {
    private final String name;
    private final double effectiveExhaustVelocity;
    private final double wetMass;
    private final double dryMass;

    Rocket(String name, double effectiveExhaustVelocity, double wetMass, double dryMass){
        this.name = name;
        this.effectiveExhaustVelocity = effectiveExhaustVelocity;
        this.wetMass = wetMass;
        this.dryMass = dryMass;
    }
    public double  getDeltaV(){
        double dv = effectiveExhaustVelocity * Math.log(wetMass / dryMass);
        return dv;
    }

    public String toString(){
        String s = name + "Rocket is a rocket with an effective exhaust velocity of " + effectiveExhaustVelocity + "km/s, a wet mass of "
                + wetMass + " tons, a dry mass of " + dryMass + " tons, and therefore a delta-v of " + getDeltaV() + "km/s.";

        return s;
    }
}
