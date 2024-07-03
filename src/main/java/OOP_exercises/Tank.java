package OOP_exercises;

public class Tank extends Vehicle{
    private double barrelLength;
    private double armourThickness;

    /* Constructor */

    public Tank (int seatsNumber, double maxSpeed, double currentSpeed,  String name, double barrelLength, double armourThickness){
        super(seatsNumber, maxSpeed, currentSpeed, name);
        this.barrelLength = barrelLength;
        this.armourThickness = armourThickness;
    }

    public double getBarrelLength() {
        return barrelLength;
    }

    public double getArmourThickness() {
        return armourThickness;
    }
}
