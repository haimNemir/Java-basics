package Polimorphizm;

public abstract class Furniture {
    private double length, width, height;
    private String color;

    public Furniture(double length, double width, double height, String color){
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public abstract void drawObject();

    @Override
    public String toString() {
        return "Furniture{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

