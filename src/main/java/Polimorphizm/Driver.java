package Polimorphizm;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public String name;
    public int age;
    public Medal[] medals = new Medal[4];

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Medal getMedals(int index) {
        if (index > 3 || index < 0) {
            Scanner scanner = new Scanner(System.in);
            while (index > 3 || index < 0) {
                System.out.println("Please enter a valid placement between zero and three");
                index = scanner.nextInt();
            }
        }
         return medals[index];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMedals(int index, Medal medal) {
        if (index > 3 || index < 0) {
            Scanner scanner = new Scanner(System.in);
            while (index > 3 || index < 0) {
                System.out.println("Please enter a valid placement between zero and three");
                index = scanner.nextInt();
            }
        }
        medals[index] = medal;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", medals=" + Arrays.toString(medals) +
                '}';
    }
}
