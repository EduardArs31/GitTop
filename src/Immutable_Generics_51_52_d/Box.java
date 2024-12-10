package Immutable_Generics_51_52_d;

public class Box<T> {
    private T date;

    public T get() {
        return date;
    }

    public void set(T date) {
        this.date = date;

    }

    public boolean isEmpty() {
        return date == null;
    }

    public void clear() {
        this.date = null;
    }
}