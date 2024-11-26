package Collections_47_48;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("java", 3, "Documentation");
        Task task2 = new Task("NPE", 1, "Bug");
        Task task3 = new Task("main", 2, "Feature");
        TaskManager task = new TaskManager();

        task.addTask(task1);
        task.addTask(task2);
        task.addTask(task3);

        System.out.println(task.getTasks().poll());
        System.out.println(task.getTasks().poll());
        System.out.println(task.getTasks().poll());

    }
}

