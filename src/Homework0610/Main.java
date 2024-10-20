package Homework0610;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        Methods.fillArray(nums);
        Methods.printArray(nums);
        Methods.findSumLines(nums);
        Methods.findSumColumns(nums);

        int[] nums2 = new int[]{7, 0, 6, 3};
        System.out.println("Исходный массив: " + Arrays.toString(nums2));
        Methods.changeArray(nums2);
        System.out.println("После изменения исходного массива: " + Arrays.toString(nums2));
        Methods.changeCopyArray(nums2);
        System.out.println("После изменения копии массива: " + Arrays.toString(nums2));
    }
}
