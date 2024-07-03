package OOP_exercises;

public class Vehicle {
    private int seatsNumber;
    private double maxSpeed;
    private double currentSpeed;
    private String name;

    /* Constructor */

    public Vehicle(int seatsNumber, double maxSpeed, double currentSpeed, String name) {
        this.seatsNumber = seatsNumber;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.name = name;
    }

    /* Setter */

    public void setCurrentSpeed(double currentSpeed) {
        if (currentSpeed < maxSpeed && currentSpeed >= 0)
            this.currentSpeed = currentSpeed;
        else {
            System.out.println("Please enter a valid speed");
        }
    }

    public void setName (String name){
        this.name = name;
    }

    /* Getter */

    public int getSeatsNumber(){
        return seatsNumber;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public String getName(){
        return name;
    }

}
