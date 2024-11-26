package Collections_47_48;

import java.util.PriorityQueue;
import java.util.Queue;

public class TaskManager {
    private Queue<Task> task;

    public TaskManager() {
        task = new PriorityQueue<>();
    }

    @Override
    public String toString() {
        return task.toString();
    }

    public void addTask(Task tasks) {
        task.offer(tasks);
    }

    public Queue<Task> getTasks() {
        return task;
    }


}

