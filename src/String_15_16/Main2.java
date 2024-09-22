package String_15_16;

public class Main2 {
    public static void main(String[] args) {
        /*Даны строки разной длины (длина - четное число), необходимо вернуть два средних знака.
         Например, если дана строка "string" – результат будет "ri", для строки "code" результат "od",
         для "Practice" результат "ct" (тут надо взять длину и поиграться с индексами, чтобы взять тот кусок,
         который нужен, ну и применять метод substring). Проверьте алгоритм на нескольких строках разной длины*/

        String str1 = "Practice";
        String str2 = "Code";
        String str3 = "String";

        String substring1 = str1.substring( 3, 5 );
        String substring2 = str2.substring( 1, 3 );
        String substring3 = str3.substring( 2, 4 );

        System.out.println( "Practice:" + " " + substring1 ) ;
        System.out.println( "Code:" + " " + substring2 );
        System.out.println( "String:" + " " + substring3 );
    }
}