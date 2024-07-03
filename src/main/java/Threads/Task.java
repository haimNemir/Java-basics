package Threads;

import java.time.LocalDateTime;

public class Task{
    private String taskDescription;
    private LocalDateTime taskDeadline;

    public Task(String taskDescription, LocalDateTime taskDeadline) {
        this.taskDescription = taskDescription;
        this.taskDeadline = taskDeadline;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDateTime getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }


    @Override
    public String toString() {
        return "Task{" +
                "taskDescription='" + taskDescription + '\'' +
                ", taskDeadline=" + taskDeadline +
                '}';
    }


}
