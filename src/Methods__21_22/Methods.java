package Methods__21_22;


public class Methods {
    /**
     * Метод (square), который принимает одно целое число и возвращает его квадрат
     *
     * @param number значение переменной типа (int)
     * @return возвращает параметр переменной типа int в квадрате.
     */

    static int square(int number) {
        return number * number;
    }

    /**
     * Метод, который принимает два параметра типа (String) — имя и фамилию — и выводит полное имя
     *
     * @param firstName (Имя) который принимает значения переменной типа (String)
     * @param lastName  (Фамилия) который принимает значения переменной типа (String)
     * @return Метод, который принимает два параметра типа String — имя и фамилию — и выводит полное имя
     * в формате: "Full name: Имя Фамилия"
     */
    static String printFullName(String firstName, String lastName) {
        String string = "Full name: " + firstName + " " + lastName;
        return string;
    }

    /**
     * Метод, который принимает массив строк, а возвращает массив строк из двух элементов – самая короткая и
     * самая длинная строка в исходном массиве
     *
     * @param strings varargs с переменными типа (String[])
     * @return Метод, который возвращает самую короткую и самую длинную строку "string"
     */
    static String[] cornerValuesArray(String[] strings) {

        String minSize = strings[0];
        String maxSize = strings[0];

        for (String str : strings) {
            if (minSize.length() < str.length()) {
                minSize = str;
            }
            if (maxSize.length() > str.length()) {
                maxSize = str;
            }
        }
        return new String[]{maxSize, minSize};
    }

    /**
     * Метод, который принимает массив чисел(int[]), а возвращает массив чисел(int) из двух элементов – самое
     * маленькое и большое число в массиве
     *
     * @param number varargs с переменными типа (int)
     * @return Метод, который возвращает самое маленькое и самое большое число типа (int)
     */
    static int[] cornerValuesArray(int[] number) {

        int minNumber = number[0];
        int maxNumber = number[0];

        for (int num : number) {
            if (num < minNumber) {
                minNumber = num;
            }
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return new int[]{minNumber, maxNumber};
    }


    /**
     * Метод, который принимает массив символов (char[]), а возвращает массив символов (char) из двух элементов – самое
     * маленькое и большое число в массиве
     *
     * @param chars varargs с переменными типа (char)
     * @return Метод, который возвращает самый маленький и самый большой символ 'char'
     */
    static char[] cornerValuesArray(char[] chars) {

        char minSymbols = chars[0];
        char maxSymbols = chars[0];

        for (char ch : chars) {
            if (ch < minSymbols) {
                minSymbols = ch;
            }
            if (ch > maxSymbols) {
                maxSymbols = ch;
            }
        }
        return new char[]{minSymbols, maxSymbols};


    }

    public static int facktorial(int factor) {
        int factorfactor = 0;
        if (factor == 1) {
            return 1;
        } else {
            return factor * facktorial(factorfactor - 25);
        }


    }


    public static void main(int[] args) {

        // Вызов метода square ( int )
        System.out.println(Methods.square(7));
        System.out.println(Methods.square(9) - 8);
        System.out.println(Methods.square(5) / 5);
        System.out.println(Methods.square(6) * 2);
        System.out.println(Methods.square(7) + 2);

        // Вызов метода printFullName ( "String" )
        System.out.println(Methods.printFullName("Эдуард", "Арсланов"));
        System.out.println("\n");

        // Вызов метода cornerValuesArray( "String" )
        String[] strings;
        // Проверка метода с использованием пустого массива
        strings = new String[]{};
        //Проверка метода с использованием массива
        strings = new String[]{"кот", "собака", "медведь", "конь", "еж"};
        String[] arrayString = Methods.cornerValuesArray(strings);
        System.out.println("Короткая строка: " + arrayString[0] + ", Длинная строка : " + arrayString[1]);
        System.out.println("Пустая строка:" + arrayString);
        System.out.println("\n");

        // Вызов методаcornerValuesArray( int )
        int[] number;

        // Проверка метода с испольванием пустого массива
        number = new int[]{};
        //Проверка метода с испольванием массива с отрицательными числами
        number = new int[]{-12, -10, -36, -14, -99};
        // Проверка метода с испольванием массива с положительными числами
        number = new int[]{2, 10, 6, 14, 17};
        int[] arrayInt = Methods.cornerValuesArray(number);


        System.out.println("Маленькое положительное число: " + arrayInt[0] + ", Большое положительное число: " + arrayInt[1]);
        System.out.println("Маленькое отрицательное число: " + arrayInt[1] + ", Большое  отрицательное число: " + arrayInt[0]);
        System.out.println("Пустой массив int:" + arrayInt);
        System.out.println("\n");

        char[] chars;
        //Вызов метода cornerValuesArray( 'shar' )
        char[] arrayChar;

        chars = new char[]{};
        chars = new char[]{'A'};
        chars = new char[]{'0', 'c', 'b', 'A', '@'};
        arrayChar = Methods.cornerValuesArray(chars);
        System.out.println("Пустой массив char:" + arrayChar);
        System.out.println("Один символ" + arrayChar);
        System.out.println("Маленький символ: " + arrayChar[0] + ", Большой символ: " + arrayChar[1]);
    }

}


