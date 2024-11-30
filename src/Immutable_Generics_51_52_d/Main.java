package Immutable_Generics_51_52_d;



import java.util.Collections;

import java.util.List;




public class Main {
    public static void main(String[] args){

        CustomMutableClass immutable = new CustomMutableClass(10);
        Car car = new Car("Lada", Collections.singletonList(2023) ,immutable, List.of(new CustomMutableClass(5)));
        System.out.println(car);

        immutable.setNumber(50);

        System.out.println(immutable);
        System.out.println(car);

        CustomMutableClass mcCar = car.getCustomMutableClass();
        mcCar.setNumber(15);
        System.out.println(car);

        List<CustomMutableClass> mcCar1 = car.getCustomMutableList();
        mcCar1.clear();



}}
