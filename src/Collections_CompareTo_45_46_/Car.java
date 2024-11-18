package Collections_CompareTo_45_46_;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model ='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    @Override
    public int compareTo(Car o) {
        int model = this.model.compareTo(o.model);
        if (model != 0) {
            return model;
        }
        int year = Integer.compare(o.year, this.year);
        if (year != 0) {
            return year;
        }
        return this.color.compareTo(o.color);
    }
}

