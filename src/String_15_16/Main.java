package String_15_16;

public class Main {
    public static void main ( String [] args ){
        /*Написать код, который подсчитывает количество букв и цифр в строке (как на занятии) – с циклом, методом charAt(индекс) и Character.isLetter/isDigit,
        a.	но добавить еще условие, чтобы подсчитывались отдельно цифры от 0 до 4, отдельно от 5 до 9
        b.	для букв так же – считать отдельно большие буквы и маленькие (поищите в классе Character подходящие методы, подсказка – они тоже начинаются на is)
        c.	(т.е. должно быть четыре счетчика – два для букв и два для цифр)
        2)	Написать любую*/

        String str = "ArsEduard863103";
                int countIsLowerCase = 0;
                int countIsUpperCase = 0;
                int countDigit1 = 0;
                int countDigit2 = 0;

                for ( int i = 0; i < str.length(); i++ ) {
                    int x = str.charAt(i);

                    if (Character.isLetter(x) ) {
                        if ( Character.isLowerCase(x) )
                            countIsLowerCase++;
                        else countIsUpperCase++;
                    }
                    else if ( Character.isDigit(x) ) {
                        if ( x >= '0' & x <= '4' )
                            countDigit1++;
                        else countDigit2++;
                    }
                }
                System.out.println( " Количество букв в нижнем регистре: " + countIsLowerCase );
                System.out.println( " Количество букв в верхнем регистре " + countIsUpperCase );
                System.out.println( " цифры от 0 до 4: " + countDigit1 );
                System.out.println( " цифры от 5 до 9: " + countDigit2 );
            }
        }


