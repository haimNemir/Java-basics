package Polimorphizm;

public class TextBox extends Control {
    private String text;

    public TextBox(int axisX, int axisY, String label, String text) {
        super(axisX, axisY, label);
        if (text.length() < 10 && !text.isEmpty()) {
            this.text = text;
        } else {
            System.out.println("Has an error on object text box: Please do not enter more than ten characters or less than one");
            this.text = "";
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text.length() < 10 && !text.isEmpty()) {
            this.text = text;
        } else {
            System.out.println("Has an error on object text box: Please do not enter more than ten characters or less than one");
            this.text = "";
        }
    }

    public String toString() {
        return super.toString() + ", Text: " + text;
    }

    public void drawLabel() {
        if (!getLabel().isEmpty())
            System.out.println(getAsterisksFromLetters(getLabel()) + "\n" + getLabel() + "\n" + (getAsterisksFromLetters(getLabel())));
        else
            System.out.println("********\n\n" + "********");
    }

    public boolean equals(Object object) {
        TextBox temp = (TextBox) object;
        return super.equals(object) && getText().contains(temp.getText());
    }

}
