package Array_19_20;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        array1();
        array2();
        array3();
        array4();
        array5();
    }

    //Напишите программу,которая вычисляет среднее значение элементов массива целых чисел int[].
    // Пример: int[] array = { 10, 20, 30, 40, 50 };
    static void array1() {

        int[] array = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for (int arrayArray : array) {
            sum += arrayArray;
        }
        int avarageNubs = sum / array.length;
        System.out.println("Среднее значение" + "-" + avarageNubs);
        System.out.println();

    }


    //Напишите программу,которая находит минимальное и максимальное значение в массиве вещественных чисел double[].
    // Пример: double[] array = { 3.5, 5.2, -1.4, 7.8, 2.2 };
    static void array2() {

        double[] array = {3.5, 5.2, -1.4, 7.8, 2.2};
        double min = 100.0;
        double max = -100.0;

        for (double num : array) {
            if (min >= num) {
                min = num;
            }
            if (max <= num) {
                max = num;
            }
        }
        System.out.println("Max" + "_" + max);
        System.out.println("Min" + "_" + min);
        System.out.println();
    }


    //Напишите программу,которая подчитывает количество гласных букв в массиве символов char[].
    // Гласными считаются:'a','e','i','o','u'(как в верхнем, так и в нижнем регистре).
    // Пример: char[] chars = {'a', 'B', 'i', 't','E','r'};
    static void array3() {

        char[] chars1 = new char[]{'a', 'B', 'i', 't', 'E', 'r'};
        char[] chars2 = new char[]{'u', 'a', 'e', 'i', 'o'};
        char[] chars3 = new char[]{'b', 't', 'r',};

        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i] == chars2[j]) {
                    System.out.println(chars2[j] + "-Гласная буква ");
                }
            }
            for (int k = 0; k < chars3.length; k++) {
                if (chars1[i] == chars3[k]) {
                    System.out.println(chars3[k] + " Не гласная");
                }
            }
        }


    }


    //Напишите программу,которая преобразует строку в массив символов char[],а затем заменяет все символы,
    // которые являются пробелами,на символ подчеркивания'_'. Пример: String str = "Hello World This Is Java";
    static void array4() {

        String str = "Hello World This Is Java";
        char[] symbols = new char[str.length()];

        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = str.charAt(i);
            if (symbols[i] == ' ') {
                symbols[i] = '_';
            }
            System.out.print(symbols[i]);
        }
        System.out.println();
        System.out.println();
    }


    //Напишите программу, которая разделяет строку на части по заданному разделителю (например,запятая)
    // и сохраняет эти части в массив строк String[]. Пример:  String str = "apple, banana, grape, orange";
    static void array5() {

        String str = "apple, banana, grape, orange";
        String[] s = str.split(",");
        System.out.println(Arrays.toString(s));
    }
}

