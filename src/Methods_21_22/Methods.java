package Methods_21_22;


public class Methods {


    static int square(int number) {
        return number * number;
    }


    public static void printFullName(String firstName, String lastName) {
        System.out.println("Full name: " + firstName + " " + lastName);
    }


    static String[] cornerValuesArray(String[] strings) {
        String minSize = strings[0];
        String maxSize = strings[2];

        for (String str : strings) {
            if (minSize.length() > str.length()) {
                minSize = str;

                if (maxSize.length() < str.length()) {
                    maxSize = str;
                }
                System.out.println("Max" + "_" + maxSize);
                System.out.println("Min" + "_" + minSize);
                System.out.println();
            }
        }

        return strings;
    }


    public static void main(String[] args) {
        // Вызов метода square
        System.out.println(square(7));
        System.out.println(square(9) - 8);
        System.out.println(square(5) / 5);
        System.out.println(square(6) * 2);
        System.out.println(square(7) + 2);

        // Вызов метода printFullName
        printFullName("Эдуард", "Арсланов");

        //Вызов метода cornerValuesArray
        String[] array = {"кот", "собака", "медведь", "конь", "еж"};
        String[] strings = cornerValuesArray(array);
    }

}







