package Conditional_operators_11_12;

public class Main2 {
    public static void main( String[]args ){

        int zarDiana = 66660;
        int zarAndrei = 77770;
        int zarMaria = 88880;
        zarDiana = (66660*15)/100;
        zarAndrei = (77770*15)/100;
        zarMaria = (88880*15)/100;

        System.out.println( " Диана сейчас получает " + (66660 + zarDiana) + " рублей" );
        System.out.println( " Годовой доход вырос на " + (  zarDiana * 12)  + " рублей." );
        System.out.println( " Андрей сейчас получает " + ( 77770 + zarAndrei) + " рублей " );
        System.out.println( " Годовой доход вырос на " + (zarAndrei * 12 )  + " рублей." );
        System.out.println( " Мария сейчас получает " + ( 88880 + zarMaria ) + " рублей " );
        System.out.println( " Годовой доход вырос на " + ( zarMaria * 12 ) + " рублей." );
    }
}
