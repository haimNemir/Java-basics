package sorting;

public class Wheel implements Comparable<Wheel> {
    private double diameter;

    public Wheel(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                '}';
    }

    /**
     * @param wheel the object to be compared.
     * @return Negative number: if this Wheel diameter less than the other Wheel diameter, Positive number: if he is bigger, and Zero: if they are equals.
     */
    @Override
    public int compareTo(Wheel wheel) {
        if (this.getDiameter() == wheel.getDiameter()) {
            return 0;
        } else if (this.getDiameter() < wheel.getDiameter()) {
            return -1;
        } else return 1;
    }
}
