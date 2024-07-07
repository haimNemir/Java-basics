package Threads;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class ThreadApp {
    public static void main(String[] args) {
//        Ex.1 create a program that take 2 numbers and calculate between them how much prime numbers are.
//        long startTime =  System.currentTimeMillis();
//        PrimeCountThread primes1 = new PrimeCountThread(0,50); //100 in one thread - 11062
//        PrimeCountThread primes2 = new PrimeCountThread(51,80);
//        PrimeCountThread primes3 = new PrimeCountThread(81,100);
//        primes1.start();
//        primes2.start();
//        primes3.start();
//        try {
//            primes1.join();
//            primes2.join();
//            primes3.join();
//        } catch (InterruptedException e) {
//            System.out.println("interrupted");
//        }
//        long endTime =  System.currentTimeMillis();
//        System.out.println("how long did it take to finish the threads: " + (endTime - startTime));

//        Ex. תרגיל מסכם

        ArrayList<Task> myTasks = new ArrayList<>();
        myTasks.add(new Task("Trash", LocalDateTime.of(2024, 7,7,15,54,15)));
        myTasks.add(new Task("workout", LocalDateTime.of(2024, 7,7,15,38,1)));
        myTasks.add(new Task("dishes", LocalDateTime.of(2024, 7,7,15,55,1)));
        myTasks.add(new Task("order", LocalDateTime.of(2024, 7,7,15,27,1)));
        myTasks.add(new Task("church the phone", LocalDateTime.of(2024, 7,7,15,43,1)));
        myTasks.add(new Task("take delivery", LocalDateTime.of(2024, 7,7,15,42,1)));
//        DeadLineChecker deadLineChecker = new DeadLineChecker(myTasks);
//        deadLineChecker.start();
        System.out.println(myTasks);
        SortTaskByDate sortTaskByDate = new SortTaskByDate(myTasks);
        sortTaskByDate.start();
        try {
            sortTaskByDate.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(myTasks);

    }
}
