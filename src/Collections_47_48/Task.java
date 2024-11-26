package Collections_47_48;

import java.util.Objects;


public class Task implements Comparable<Task> {
    private String name;
    private Integer priority;
    private String category;

    public Task(String name, Integer priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " " + priority + " " + category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority, category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) || Objects.equals(priority,
                task.priority) || Objects.equals(category,
                task.category);
    }

    @Override
    public int compareTo(Task o) {
        int compares = Integer.compare(this.priority, o.priority);
        if (compares == 0) {
            compares = this.category.compareTo(o.category);
        }
        return compares;
    }
}
