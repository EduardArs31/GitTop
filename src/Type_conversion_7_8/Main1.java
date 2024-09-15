package Type_conversion_7_8;

import java.util.Random;


    public class Main1 {
        public static void main(String[] args) {
            Random random = new Random();
            int num1 = random.nextInt(65, 100);
            char a = (char) num1;
            int num2 = random.nextInt(65, 200);
            char b = (char) num2;
            int num3 = random.nextInt(65, 300);
            char c = (char) num3;
            int num4 = random.nextInt(65, 400);
            char d = (char) num4;


            System.out.print("Code:" + a + b + c + d);
        }
    }

