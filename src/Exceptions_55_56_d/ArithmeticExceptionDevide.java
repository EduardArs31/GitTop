package Exceptions_55_56_d;

public class ArithmeticExceptionDevide {

    static double devide(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка ввода : " + e.getMessage());
        }
        return 0;
    }
}
