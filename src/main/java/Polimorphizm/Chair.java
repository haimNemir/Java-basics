package Polimorphizm;

public class Chair extends Furniture{
    private int legs;

    public Chair (double length, double width, double height, String color, int legs){
        super(length, width, height, color);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public void drawObject() {
        System.out.println(" i______i");

        System.out.println(" I______I");

        System.out.println(" I I");

        System.out.println(" I______I");

        System.out.println(" / /I");

        System.out.println("(______( I");

        System.out.println("I I I I");

        System.out.println("I I");
    }

    @Override
    public String toString() {
        return super.toString() + "\nLegs: " + legs;
    }
}
