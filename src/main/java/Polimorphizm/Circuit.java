package Polimorphizm;

import java.util.Arrays;
import java.util.Scanner;

public class Circuit {
    public String name,country;
    public int lengthCircuit;
    public Car[] cars = new Car[10];

    public Circuit(String name, String country, int lengthCircuit) {
        this.name = name;
        this.country = country;
        if (lengthCircuit > 30 || lengthCircuit < 4) {
            Scanner scanner = new Scanner(System.in);
            while (lengthCircuit > 30 || lengthCircuit < 4) {
                System.out.println("Please enter a valid length, between 4 and 30");
                lengthCircuit = scanner.nextInt();
            }
        }
        this.lengthCircuit = lengthCircuit;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getLengthCircuit() {
        return lengthCircuit;
    }

    public Car getCar(int index) {
        if (index > 9 || index < 0) {
            Scanner scanner = new Scanner(System.in);
            while (index > 9 || index < 0) {
                System.out.println("Please enter a valid placement between nine and zero");
                index = scanner.nextInt();
            }
        }
        return cars[index];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLengthCircuit(int lengthCircuit) {
        this.lengthCircuit = lengthCircuit;
    }

    public void setCar(int index, Car car) {
        if (index > 9 || index < 0) {
            Scanner scanner = new Scanner(System.in);
            while (index > 9 || index < 0) {
                System.out.println("Please enter a valid placement between nine and zero");
                index = scanner.nextInt();
            }
        }
        this.cars[index] = car;
    }

    @Override
    public String toString() {
        return "Circuit{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", lengthCircuit=" + lengthCircuit + " KM"+
                ", \ncars=" + Arrays.toString(cars) +
                '}';
    }
}
