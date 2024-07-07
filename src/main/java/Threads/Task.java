package Threads;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task>{
    private String descriptionTask;
    private LocalDateTime deadline;

    public Task(String descriptionTask, LocalDateTime deadline) {
        this.descriptionTask = descriptionTask;
        this.deadline = deadline;
    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "\nTask \t" + descriptionTask + ": DeadLine: \t\t\t\t" + deadline;
    }


    @Override
    public int compareTo(Task o) {
        if(o.deadline.isEqual(this.deadline)){
            return 0;
        } else if (o.deadline.isBefore(this.deadline)){
            return 1;
        } else
            return -1;
    }
}
