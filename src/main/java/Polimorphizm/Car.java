package Polimorphizm;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    public String model;
    public int year;
    public Driver[] drivers = new Driver[2];

    public Car(String model, int year) {
        this.model = model;
        if (year < 1960 || year > 2019) {
            Scanner scanner = new Scanner(System.in);
            while (year < 1960 || year > 2019) {
                System.out.println("Please enter a valid year between 1960 and 2019");
                year = scanner.nextInt();
            }
        }
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Driver getDriver(int index) {
        if (index > 1 || index < 0) {
            Scanner scanner = new Scanner(System.in);
            while (index > 1 || index < 0) {
                System.out.println("Please enter a valid placement, zero or one");
                index = scanner.nextInt();
            }
        }
        return drivers[index];
    }

    public void setDriver(int index, Driver driver) {
        if (index > 1 || index < 0) {
            Scanner scanner = new Scanner(System.in);
            while (index > 1 || index < 0) {
                System.out.println("Please enter a valid placement, zero or one");
                index = scanner.nextInt();
            }
        }
        drivers[index] = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", drivers=" + Arrays.toString(drivers) +
                '}';
    }
}
