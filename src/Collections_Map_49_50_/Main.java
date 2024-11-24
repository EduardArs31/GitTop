package Collections_Map_49_50_;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "java is fun and java is powerful";
        String string1 = string.replaceAll(" ", "");
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string1.length(); i++) {
            char chars = string1.charAt(i);
            map.put(chars, map.getOrDefault(chars, 0) + 1);
        }
        System.out.println(map);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("C", 1);
        hashMap.put("B", 2);
        hashMap.put("A", 3);
        Map<Integer, String> inverseMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            inverseMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println(inverseMap);


        Car car1 = new Car("Lada", 2022);
        Car car2 = new Car("BMW", 2024);
        Car car3 = new Car("Audi", 2020);
        Car car4 = new Car("Kia", 2023);

        List<Car> carList1 = new ArrayList<>();
        carList1.add(car1);
        carList1.add(car2);
        carList1.add(car3);
        carList1.add(car4);

        Collections.sort(carList1);
        carList1.sort(new CarModelComparator());
        System.out.println("natural map - " + carList1);

        Car car5 = new Car("Lada", 2022);
        Car car6 = new Car("BMW", 2024);
        Car car7 = new Car("Audi", 2020);
        Car car8 = new Car("Kia", 2023);

        List<Car> carList = new ArrayList<>();
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);

        Collections.sort(carList);
        carList.sort(new CarYearComparator());

        System.out.println("mapYear" + carList);
    }

}

