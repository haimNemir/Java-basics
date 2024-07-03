package Polimorphizm;

public class Table extends Furniture{
    private int seatsNumber;

    public Table(double length, double width, double height, String color, int seatsNumber) {
        super(length, width, height, color);
        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public void drawObject() {
        System.out.println(" =====================");

        System.out.println(" / /");

        System.out.println(" / /|");

        System.out.println("===================== |");

        System.out.println(" | | | |");

        System.out.println(" | | | |");

        System.out.println(" | | | |");

        System.out.println(" | |");

        System.out.println(" | |");

        System.out.println(" | |");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeats number: " + seatsNumber;
    }
}
