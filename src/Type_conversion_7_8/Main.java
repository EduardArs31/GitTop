package Type_conversion_7_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите общее число отзывов: ");
        int allFeedbackCount = sc.nextInt();
        System.out.print("Введите число хороших отзывов: ");
        int goodFeedbackCount = sc.nextInt();
        System.out.print("Введите число плохих отзывов: ");
        int badFeedbackCount = sc.nextInt();

        double goodFeedbackPercent = goodFeedbackCount * 100.0 / allFeedbackCount;
        double badFeedbackPercent = badFeedbackCount * 100.0 / allFeedbackCount;
        int goodFeedbackPercentInt = (int) Math.round (goodFeedbackPercent);
        int badFeedbackPercentInt = (int) Math.round (badFeedbackPercent);
        System.out.println("Всего отзывов - " + allFeedbackCount + "-" + goodFeedbackCount +
                "-" + badFeedbackCount +
                "\nХороших отзывов (double) - " + goodFeedbackPercent + "%" +
                "\nПлохих отзывов (double) - " + badFeedbackPercent + "%" +
                "\nХороших отзывов (int) - " + goodFeedbackPercentInt + "%" +
                "\nПлохих отзывов (int) - " + badFeedbackPercentInt + "%");
    }
}
