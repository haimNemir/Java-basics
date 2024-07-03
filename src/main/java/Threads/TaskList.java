package Threads;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TaskList extends Thread{
    private ArrayList<Task> list = new ArrayList<>();

    public TaskList(ArrayList<Task> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (Task ref: list){
            if ((ref.getTaskDeadline() - LocalDateTime.now()) >  )
        }
    }
}
