package Collections_Map_49_50_;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String model;
    private int year;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" + model + ", " + year + '}';
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public int compareTo(Car o) {
        return Comparator.comparing(Car::getModel)
                .thenComparing(Car::getYear)
                .compare(this, o);
    }
}