package Threads;

import java.util.ArrayList;
import java.util.Collections;

public class SortTaskByDate extends Thread{
    private ArrayList<Task> myList;

    public SortTaskByDate(ArrayList<Task> myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        while (true){
            Collections.sort(myList);
            System.out.println("Sorted!!");
            System.out.println(myList);
            try {
                sleep(1000*5);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
