package Conditional_operators_11_12;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Введите ваш возраст: " );
        int age = scanner.nextInt();

        System.out.print( "Если возраст человека равен " + age +" то ему " );
        if ( age <= 6 ) {
            System.out.println( "должен ходить в детский сад;" );
        }
        else if ( age <= 18 ) {
            System.out.println( "нужно посещать школу;" );
        }
        else if ( age <= 24 ) {
            System.out.println( "следует учиться в университете;" );
        }
        else {
            System.out.println( "пора идти на работу;" );
        }
    }
}