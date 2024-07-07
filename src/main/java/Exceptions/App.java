package Exceptions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Person person = null;
//        double agePerson = 0;
//        Scanner scanner = new Scanner(System.in);
//        boolean correctAge = false;
//        while (!correctAge) {
//            agePerson = scanner.nextDouble();
//            try {
//                person = new Person(123456789, "Haim", "Henry Kisinger 4", agePerson);
//                correctAge = true;
//            } catch (ageException e) {
//                System.out.println(e.getMessage());
//            } catch (InputMismatchException e) {
//                System.out.println("Please enter numbers only");
//            }
//        }
//        System.out.println(person);
//
//
//        ArrayList<Double> numbers = new ArrayList<>();
//        System.out.println("Please enter a number between 1 and 5");
//        boolean appRunning = true;
//        while (appRunning) {
//            try {
//                switch (scanner.nextInt()) {
//                    case 1:
//                        System.out.println("Adding a number to the list, please enter the number");
//                        numbers.add(scanner.nextDouble());
//                        System.out.println("The new list is: " + numbers);
//                        break;
//                    case 2:
//                        System.out.println("Deleting a number from the list, please enter index list number");
//                        numbers.remove(scanner.nextInt());
//                        System.out.println("The new list is: " + numbers);
//                        break;
//                    case 3:
//                        Collections.sort(numbers);
//                        System.out.println("The list was sorted");
//                        System.out.println("The new list is: " + numbers);
//                        break;
//                    case 4:
//                        System.out.println("Printing the list...");
//                        System.out.println(numbers);
//                    case 5:
//                        System.out.println("Exiting app");
//                        appRunning = false;
//                        break;
//                    default:
//                        System.out.println("Please enter a number between 1 and 5");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Illegal input, please enter a number");
//            } catch (NoSuchElementException e) {
//                System.out.println("Illegal input");
//            } catch (IllegalStateException e) {
//                System.out.println("IllegalStateException");
//            } catch (Exception e) {
//                System.out.println("unknown error");
//            }

//        }
//        BankAccount account = new BankAccount("123456789", 300.25);
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            if (random.nextInt(1,3) == 1){
//                account.deposit(random.nextInt(100, 501));
//                System.out.println(account.getBalance());
//            } else {
//                try {
//                    account.withdraw(random.nextInt(100, 501));
//                    System.out.println(account.getBalance());
//                } catch (InsufficientFundsException e) {
//                    System.out.println(e.getMessage());;
//                    System.out.println(account.getBalance());
//                }
//            }
//        }
        ArrayList<Product> myProducts = new ArrayList<>();
        int input = 0;
        while (input != 6) {
            System.out.println("Please enter a number: " +
                    "\n1> Add new product" +
                    "\n2> Show product info" +
                    "\n3> Show all products" +
                    "\n4> Add stock" +
                    "\n5> Remove stock" +
                    "\n6> Exit");
            Scanner scanner1 = new Scanner(System.in);
            input = scanner1.nextInt();
            switch (input) {
                //  1> Add new product
                case 1:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Please enter product ID");
                    String productId = scanner2.next();
                    System.out.println("Please enter product name");
                    String name = scanner2.next();
                    System.out.println("Please enter quantity of items");
                    int stock = scanner2.nextInt();
                    try {
                        myProducts.add(new Product(productId, name, stock));
                    } catch (InvalidOperationException e) {
                        System.out.println(e.getMessage());
                        ;
                    }
                    break;
                case 2:
                    //  2> Show product info
                    if (myProducts.size() > 0) {
                        System.out.println("Please enter product index between 0 and " + myProducts.size());
                        Scanner scanner = new Scanner(System.in);
                        System.out.println(myProducts.get(scanner.nextInt()));
                    } else {
                        System.out.println("There is no products yet");
                    }
                    break;
                case 3:
//                    3> Show all products
                    if (myProducts.size() > 0) {
                        System.out.println(myProducts);
                    } else {
                        System.out.println("There is no products yet");
                    }
                    break;
                case 4:
//                    4> Add stock
                    if (myProducts.size() > 0) {
                        System.out.println("Please enter index number of the product between 0 and " + myProducts.size());
                        Scanner scanner3 = new Scanner(System.in);
                        int index = scanner3.nextInt();
                        System.out.println("Please enter a number to increase the stock");
                        int number = scanner3.nextInt();
                        try {
                            myProducts.get(index).increaseStock(number);
                        } catch (InvalidOperationException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Please add product first");
                    }
                    break;
                case 5:
//                    5> Remove stock
                    if (myProducts.size() > 0) {
                        System.out.println("Please enter index number of the product between 0 and " + myProducts.size());
                        Scanner scanner4 = new Scanner(System.in);
                        int index = scanner4.nextInt();
                        System.out.println("Please enter a number to decrease the stock");
                        int number = scanner4.nextInt();
                        try {
                            myProducts.get(index).reduceStock(number);
                        } catch (InvalidOperationException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Please add product first");
                    }
                    break;
                default:
                    System.out.println("Good bye:)");
            }
        }
    }
}
