package Conditional_operators_11_12;

import java.util.Scanner;

    public class Main1 {
        public static void main( String[] args ){

            Scanner scan = new Scanner( System.in );
            System.out.print( "Введите номер месяца:" );
            int monthNumber = scan.nextInt();

            String seazon = switch ( monthNumber ) {
                case 3, 4, 5 -> "Весна";
                case 6, 7, 8 -> "Лето";
                case 9, 10, 11 -> "Осень";
                case 12, 1, 2 -> "Зима";
                default-> "Неверный месяц";
            };
            System.out.println( seazon );
        }
    }

