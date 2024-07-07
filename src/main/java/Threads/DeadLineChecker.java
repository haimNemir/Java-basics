package Threads;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DeadLineChecker extends Thread{
    private ArrayList<Task> tasksList;

    public DeadLineChecker(ArrayList<Task> tasksList) {
        this.tasksList = tasksList;
    }

    @Override
    public void run() {
        while(true){
            for (Task ref: tasksList){
                System.out.println();
                LocalDateTime now = LocalDateTime.now();
                if (now.isAfter(ref.getDeadline())){
                    System.out.println("Task: " + ref.getDescriptionTask() + " - 'the deadline is pass!!'");

                }else {
                    System.out.println("Task: " + ref.getDescriptionTask() + " - you have time for the deadline");
                }
            }
            System.out.println();
            try {
                sleep(1000*60);
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");;
            }
        }

    }
}
