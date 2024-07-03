package Threads;

import java.util.Scanner;

public class PrimeCountThread extends Thread {
    private int num1, num2;

    public PrimeCountThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    @Override
    public void run() {
        int numbersOfPrimes = 0;
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                numbersOfPrimes++;
            }
            try {
                sleep(100);
            } catch (InterruptedException ignore) {}
        }
        System.out.println("Numbers of prime petween " + num1 + " and " + num2 +" are: " + numbersOfPrimes);
    }

    public boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
