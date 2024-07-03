package Polimorphizm;

public class Bed extends Furniture {
    private boolean doubleBed;

    public Bed(double length, double width, double height, String color, boolean doubleBed) {
        super(length, width, height, color);
        this.doubleBed = doubleBed;
    }

    public boolean isDoubleBed() {
        return doubleBed;
    }

    @Override
    public void drawObject() {
        System.out.println(" ||");

        System.out.println(" || ||");

        System.out.println("||/||___ ||");

        System.out.println("|| /` )____________||_/|");

        System.out.println("||/___ //_/_/_/_/_/_/||/ |");

        System.out.println("||(___)/_/_/_/_/_/_/_|| |");

        System.out.println("|| |_|_|_|_|_|_|_|| /|");

        System.out.println("|| | | | | | | | ||/||");

        System.out.println("||~~~~~~~~~~~~~~~~~~~||");

        System.out.println("|| ||");
    }

    @Override
    public String toString() {
        if (doubleBed)
            return super.toString() + "\nDouble bed";
        else
            return super.toString() + "\nSingle bed";
    }
}
