package OOP_exercises;

public  class Box {
    private double volume;
    private String label;

    public Box(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Box data- \nVolume: " + volume + "\nlabel: " + label;
    }
}


