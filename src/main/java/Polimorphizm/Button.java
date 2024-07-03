package Polimorphizm;

public class Button extends Control{
    private String color;

    public Button(int axisX, int axisY, String label, String color) {
        super(axisX, axisY, label);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return super.toString() + ", Color: " + color;
    }

    public void drawLabel() {
        System.out.println(getAsterisksFromLetters(getLabel()) + "**\n" + "*" + getLabel() + "*\n" + getAsterisksFromLetters(getLabel())+ "**");
    }

    @Override
    public boolean equals(Object object) {
        Button temp = (Button) object;
        return super.equals(object) && getColor().contains(temp.getColor());
    }
}
