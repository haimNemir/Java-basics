package OOP_exercises;

public class CanBox extends Box{
    private int height;
    private double diameter;

    public CanBox(){
        String label = "Food";
        super(label);
    }

    public CanBox(String label){
        super(label);
    }

    public CanBox(String label, int height, double diameter){
        super(label);
        this.height = height;
        this.diameter = diameter;
    }

    public double volumeCalc(){
        return diameter * diameter * height * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCanBox{" +
                "height=" + height +
                ", diameter=" + diameter +
                '}';
    }
}
