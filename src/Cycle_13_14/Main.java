package Cycle_13_14;

 public class Main {
    public static void main(String[]args) {
        cycles1();
        cycles2();
        cycles3();
    }
      /* Таблица умножения
         Условие: Напишите программу, которая выводит таблицу умножения от 1 до 10 (1 * 1, 1* 2 и т.д. До 10 * 10)
         Использовать вложенные циклы for.*/

     static void cycles1(){

         int sum;
         for ( int i = 1; i <= 10; i++ ) {
            for (int j = 1; j <= 10; j++) {
                sum = i * j;

                System.out.println(i + " * " + j + " = " + sum);
            }
        }

     }

      /* Вывод чётных чисел от 1 до n
         Условие: Напишите программу, которая выводит все НЕчётные числа от 1 до заданного числа n.
         Пример: Для n = 10 программа должна вывести: 1 3 5 7 9*/
         static void cycles2(){

             int n = 10;
             for (int i = 0; i <= n; i++) {
             if (i == 0) {
                 continue;
             }
             if (i % 2 == 1) {

                 System.out.print(" " + i);
             }

         }
     }

     /* Произведение чисел от 1 до n
        Условие: Напишите программу, которая вычисляет произведение всех чисел от 1 до заданного числа n
        Пример: Для n = 4, результат будет 1 * 2 * 3 * 4 = 24.*/
         static void cycles3(){
             int  n = 4;
             int num = 1;
             for ( int i = 1; i < n; i++ ) {
             num  *= n;

             System.out.print( i + " * ");
         }
         System.out.print( n + " = " + num );
     }
 }









