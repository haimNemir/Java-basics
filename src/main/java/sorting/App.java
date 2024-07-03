package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        // SORT
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(rand.nextInt(1, 51));
//        }
//
////        System.out.println(numbers);
//        // sort
//        Collections.sort(numbers);
//        // print again
////        System.out.println(numbers);
//
////        ***********************************
//        ArrayList<String> texts = new ArrayList<>();
//        texts.add("Abba");
//        texts.add("Ima");
//        texts.add("ah");
//        texts.add("Yael");
//        texts.add("Dada");
//        texts.add("Daddy");
//
////        System.out.println(texts);
//        Collections.sort(texts, new MyStringComparator());
////        System.out.println(texts);
//
//        //*****************************************************
//        ArrayList<Student> students = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            students.add(new Student(rand.nextInt(1111111, 9999999),
//                    texts.get(rand.nextInt(texts.size())), rand.nextInt(18, 25)));
//        }
//        System.out.println(students);
//        Collections.sort(students, new MyStudentComparator());
//        System.out.println(students);
//        new Student(1111, "Nir", 20); // 5467657
//        new Student(2222,"Benny", 19); // 5467657
//    Ex. Collection sort:
//        ArrayList<Wheel> wheels = new ArrayList<>();
        Random random = new Random();
//        for (int i = 0; i < 50; i++) {
//            wheels.add(new Wheel(random.nextInt(10,51)));
//        }
//        for (Wheel ref: wheels){
//            System.out.print(ref.getDiameter() + "\t");
//        }
//        System.out.println("\n***************************");
//        Collections.sort(wheels);
//        for (Wheel ref: wheels){
//            System.out.print(ref.getDiameter() + "\t");
//        }
        ArrayList<Pizza> pizzas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            pizzas.add(new Pizza(random.nextInt(1, 9),random.nextInt(5,35)));
        }
        for (Pizza ref: pizzas){
            System.out.print(ref.toString() + "\t");
        }
        Collections.sort(pizzas);
        System.out.println("*******************");
        System.out.println();
        for (Pizza ref: pizzas){
            System.out.print(ref.toString() + "\t");
        }
        System.out.println("*******************");
        System.out.println();
        Collections.sort(pizzas, new MyPizzaSlicesSort());
        for (Pizza ref: pizzas){
            System.out.print(ref.toString() + "\t");
        }
    }
}
