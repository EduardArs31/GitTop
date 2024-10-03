package Methods__21_22;


public class Methods {


    static int square(int number) {
        return number * number;
    }


    static String printFullName(String firstName, String lastName) {
        String string = "Full name: " + firstName + " " + lastName;
        return string;
    }


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


    public static void main(String[] args) {

        // Вызов метода square ( int )
        System.out.println(Methods__21_22.Methods.square(7));
        System.out.println(Methods__21_22.Methods.square(9) - 8);
        System.out.println(Methods__21_22.Methods.square(5) / 5);
        System.out.println(Methods__21_22.Methods.square(6) * 2);
        System.out.println(Methods__21_22.Methods.square(7) + 2);

        // Вызов метода printFullName ( "String" )
        System.out.println(Methods__21_22.Methods.printFullName("Эдуард", "Арсланов"));

        // Вызов метода cornerValuesArray( "String" )
        String[] strings = {"кот", "собака", "медведь", "конь", "еж"};
        String[] arrayString = Methods__21_22.Methods.cornerValuesArray(strings);
        System.out.println("Короткая строка: " + arrayString[0] + ", Длинная строка : " + arrayString[1]);
    }
}




