package Exceptions;

import java.util.Random;

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
        BankAccount account = new BankAccount("123456789", 300.25);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (random.nextInt(1,3) == 1){
                account.deposit(random.nextInt(100, 501));
                System.out.println(account.getBalance());
            } else {
                try {
                    account.withdraw(random.nextInt(100, 501));
                    System.out.println(account.getBalance());
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());;
                    System.out.println(account.getBalance());
                }
            }
        }
    }
}
