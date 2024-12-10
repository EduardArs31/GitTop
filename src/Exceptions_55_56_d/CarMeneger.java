package Exceptions_55_56_d;

import java.util.List;

public class CarMeneger {
    private final List<Car> cars;

    public CarMeneger(List<Car> cars) {
        this.cars = cars;
    }
    public Car getCar(String model, int year) {
        for (Car car : cars) {
            if (car.getModel().equals(model) && car.getYear() == year) {
                return car;
            }
        }
        throw new CarNotFountException("Машина  : model - " + model + ", year - " + year + " не найдена");
    }
}
