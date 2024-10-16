package Multidimensional_arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        fillArray(nums);
        printShow(nums);
        findSumLines(nums);
        findSumColumns(nums);
        arrayCop(args);

    }

    public static void fillArray(int[][] nums) {
        int n = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = n;
                n++;
            }
        }
    }

    public static void printShow(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void findSumLines(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            int n = 0;
            for (int j = 0; j < nums[0].length; j++) {
                n += nums[i][j];
            }
            System.out.println("Сумма строки " + i + ": " + n);
        }
        System.out.println();
    }

    public static void findSumColumns(int[][] nums) {
        for (int i = 0; i < nums[0].length; i++) {
            int n = 0;
            for (int j = 0; j < nums.length; j++) {
                n += nums[j][i];
            }
            System.out.println("Сумма столбца " + i + ": " + n);
        }
        System.out.println();
    }


    public static void arrayCop(String[] args) {

        int[] nums2 = new int[]{4, 12, 8, 9, 77};

        System.out.println("исходный массив:" + Arrays.toString(nums2));
        changeArray(nums2);
        System.out.println("после изменения исходника:" + Arrays.toString(nums2));
        changeCopyArray(nums2);
        System.out.println("после изменения копии:" + Arrays.toString(nums2));

    }

    static void changeArray(int[] nums) {
        Arrays.sort(nums);
    }

    static void changeCopyArray(int[] nums) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.fill(numsCopy, 0);
        System.out.println(Arrays.toString(numsCopy));
    }
}







