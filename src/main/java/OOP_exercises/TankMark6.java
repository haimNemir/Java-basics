package OOP_exercises;

public class TankMark6 extends Tank {
    private int airDefence;

    public TankMark6(int airDefence, int seatsNumber, double maxSpeed, double currentSpeed, String name, double barrelLength, double armourThickness) {
        super(seatsNumber, maxSpeed, currentSpeed, name, barrelLength, armourThickness);
        this.airDefence = airDefence;
    }

    public int getAirDefence() {
        return airDefence;
    }

    public void setAirDefence(int airDefence) {
        this.airDefence = airDefence;
    }
}
