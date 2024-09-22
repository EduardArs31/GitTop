package String_15_16;

public class Main1 {
    public static void main(String[] args) {
          /* Написать любую строку на ваш вкус (можно “I like Java!!!”), далее
          a. Распечатать последний символ строки. Используем метод String.charAt().
          b. Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
          d. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
          e. Найти позицию подстроки “Java” в строке “I like Java!!!”.
          f. Заменить все символы “а” на “о”.
          g. Преобразуйте строку к верхнему регистру.
          h. Преобразуйте строку к нижнему регистру.*/

            String str = "I like java!!!";
            System.out.println("последний символ строки: " + str.charAt(str.length() - 1));
            System.out.println("заканчивается ли  строка подстрокой “!!!”: " + str.endsWith("!!!"));
            System.out.println("начинается ли строка подстрокой “I like”: " + str.startsWith("I like"));
            System.out.println("содержит ли строка подстроку “Java”: " + str.contains("java"));
            System.out.println("Найти позицию подстроки “Java” : " + str.indexOf("java"));
            System.out.println("Заменить все символы “а” на “о”: " + str.replace('a', 'o'));
            System.out.println("строка в верхнем регистре: " + str.toUpperCase());
            System.out.println("строка в нижнем регистре: " + str.toLowerCase());

        }
}
