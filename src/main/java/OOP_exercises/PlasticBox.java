package OOP_exercises;

public class PlasticBox extends Box {
    private double length;
    private double width;
    private double height;

    public PlasticBox() {
        String label = "Empty";
        super(label);
    }

    public PlasticBox(String label) {
        super(label);
    }

    public PlasticBox(String label, double length, double width, double height) {
        super(label);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volumeCalc() {
        return length * width * height;
    }

    public boolean equals(Object object) {
        PlasticBox temp = (PlasticBox) object;
        return this.getLabel().equals(temp.getLabel());
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nlength=" + length +
                ", width=" + width +
                ", height=" + height +
                ", volumeCalc=" +
                '}';
    }
}
