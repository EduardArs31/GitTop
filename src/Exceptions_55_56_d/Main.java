package Exceptions_55_56_d;


import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        System.out.println(ArithmeticExceptionDevide.devide(33, 2));
        System.out.println(ArithmeticExceptionDevide.devide(10, 0));


        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 2010));
        cars.add(new Car("Volga", 2005));
        cars.add(new Car("Audi", 2024));
        CarMeneger carss = new CarMeneger(cars);
        try {
            System.out.println(carss.getCar("Lada", 2013));
        } catch (CarNotFountException e) {
            System.out.println("Ошибка ввода : " + e.getMessage());
        }
        try {
            System.out.println(carss.getCar("BMW", 2022));
        } catch (CarNotFountException e) {
            System.out.println(" Ошибка ввода: " + e.getMessage());



            String[] passwords = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020"};

            for (String pass : passwords) {
                StringBuilder password = new StringBuilder();

                if (!(pass.length() > 8 && pass.length() < 20)) {
                    password.append("Пароль должен быть длиной от 8 до 20 символов");

                }

                if (!(pass.replaceAll(" ", "").length() == pass.length())) {
                    password.append(" Пароль не должен содержать пробелов");

                }

                if (pass.toLowerCase().equals(pass)) {
                    password.append("Пароль должен содержать хотя бы одну заглавную букву");

                }

                if (pass.toUpperCase().equals(pass)) {
                    password.append(" должен содержать хотя бы одну строчную букву " );

                }

                if(pass.replaceAll("[^1-9]", "").isBlank()) {
                    password.append("Пароль должен содержать хотя бы одну цифру");

                }
                if (password.isEmpty()) {
                    System.out.println( "Пароль:  " + pass + " - " + "подходит");
                }
                else System.out.println( "Пароль:  " + pass + " - " + password.deleteCharAt(password.length() - 2));
            }
        }
    }
}
