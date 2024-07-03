package Polimorphizm;

import OOP_exercises.PlasticBox;

public abstract class Control {
    private int axisX;
    private int axisY;
    private String label;

    public Control(int axisX, int axisY, String label) {
        this.axisX = axisX;
        this.axisY = axisY;
        this.label = label;
    }

    public int getAxisX() {
        return this.axisX;
    }

    public int getAxisY() {
        return this.axisY;
    }

    public String getLabel() {
        return this.label;
    }

    public void setAxisX(int axisX) {
        this.axisX = axisX;
    }

    public void setAxisY(int axisY) {
        this.axisY = axisY;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public abstract void drawLabel();


    public String toString() {
        return "Data-\n" + "Axis X: " + axisX + ", Axis Y: " + axisY + ", Label: " + label;
    }

    public boolean equals(Object object) {
        Control temp = (Control) object;
        return getAxisX() == temp.getAxisX() && getAxisY() == temp.getAxisY() && getLabel().contains(temp.getLabel());
    }


    public StringBuilder getAsterisksFromLetters(String text) {
        StringBuilder asterisks = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            asterisks.append('*');
        }
        return asterisks;
    }
}
