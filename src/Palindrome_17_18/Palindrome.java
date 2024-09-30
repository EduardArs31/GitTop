package Palindrome_17_18;

import java.lang.Integer;




public class Palindrome {
    private static String string ;
    private static int digets;

    public static void main( String [] args ){

        isPalindrome();
        isPalindrome2();
        isPalindrome3();
    }

            static void isPalindrome(){
        //	С помощью СтрингБилдера получить реверс строки (строку в обратном порядке символов) и сравнить её
        //      с исходной строкой

        String string =( " комок " );

        String toLowerCase = string.toLowerCase();
        String sb = new StringBuilder( toLowerCase ).reverse().toString();

        if ( toLowerCase.equals( sb )) {
            System.out.println ( " полиндром " );
        } else {
            System.out.println( " не полиндром " );
        }
        System.out.println( " \n " );
    }
    static void isPalindrome2() {
        //	Анализировать посимвольно строку – сравнивать первый символ с последним, второй с предпоследним и т.д.
        String string = ( " SEVAVES " );
        String toLowerCase = string.toLowerCase();
        String result = "";

        for ( int i = 0; i < toLowerCase.length() / 2; i++ ) {
            if ( toLowerCase.charAt(i) == toLowerCase.charAt( toLowerCase.length() - ( i + 1 ))) {
                result = " палиндром ";
            } else {
                result = " не палиндром ";
            }
        }
        System.out.println( result );
        System.out.println( "\n" );
    }
    static void isPalindrome3() {
        //	Реализовать проверку строки на палиндром число, например 1234321
        int digets;
        digets = Integer.parseInt (" 1234321 " );

        String str = String.valueOf( digets) ;
        String sb = new StringBuilder( str ).reverse().toString();

        String result = "";

        if ( str.equals( sb )) {
            result = " палиндром ";
        } else {
            result =" не палиндром " ;
        }
        System.out.println( result );}
}



