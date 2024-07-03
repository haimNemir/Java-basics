package Polimorphizm;

public class Password extends TextBox {
    public Password(int axisX, int axisY, String label, String text) {
        super(axisX, axisY, label, text);
    }

    public void drawLabel() {
        if (!getLabel().isEmpty())
            System.out.println(getAsterisksFromLetters(getText()) + "\n" + getAsterisksFromLetters(getText()) + "\n" + getAsterisksFromLetters(getText()));
        else
            System.out.println("********\n\n" + "********");
    }

    public boolean equals(Object object) {
        TextBox temp = (TextBox) object;
        return super.equals(object) && getText().contains(temp.getText());
    }

}
