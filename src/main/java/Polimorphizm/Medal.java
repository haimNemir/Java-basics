package Polimorphizm;

import java.util.Scanner;
import java.util.StringJoiner;

public class Medal {
    private int position;
    private String date;

    public Medal(int position, String date) {
        if (position > 3 || position < 1) {
            Scanner scanner = new Scanner(System.in);
            while (position > 3 || position < 1) {
                System.out.println("Please enter a valid placement between one and three");
                position = scanner.nextInt();
            }
        }
        this.position = position;
        this.date = date;
    }

    public int getPosition() {
        return position;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Medal{" +
                "position=" + position +
                ", date='" + date + '\'' +
                '}';
    }
}
