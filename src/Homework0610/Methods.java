package Homework0610;

import java.util.Arrays;

public class Methods {
    /**
     * Заполняет массив числами по порядку, начиная с 1
     *
     * @param nums двумерный массив для заполнения
     */
    static void fillArray(int[][] nums) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = count;
                count++;
            }
        }
    }

    /**
     * Выводит массив на печать
     *
     * @param nums двумерный массив для печати
     */
    static void printArray(int[][] nums) {
        for (int[] inboxNums : nums) {
            for (int num : inboxNums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    /**
     * Находит сумму элементов в каждой строке
     *
     * @param nums двумерный массив
     * @return массив с суммами элементов по строкам
     */
    static int[] sumLines(int[][] nums) {

        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                sum += nums[i][j];
            }
            result[i] = sum;
            sum = 0;
        }
        return result;
    }

    /**
     * Выводит в консоль сумму элементов каждой строки
     *
     * @param nums двумерный массив
     */
    static void findSumLines(int[][] nums) {
        System.out.println("Сумма элементов по строкам:");
        int[] sumLinesResult = sumLines(nums);
        for (int i : sumLinesResult) {
            System.out.println("Сумма строки: " + i);
        }
    }

    /**
     * Находит сумму элементов в каждом столбце
     *
     * @param nums двумерный массив
     * @return массив с суммами элементов по столбцам
     */
    static int[] sumColumns(int[][] nums) {

        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j][i];
            }
            result[i] = sum;
            sum = 0;
        }
        return result;
    }

    /**
     * Выводит в консоль сумму элементов каждого столбца
     *
     * @param nums двумерный массив
     */
    static void findSumColumns(int[][] nums) {
        System.out.println("Сумма элементов по столбцам:");
        int[] sumColumnsResult = sumColumns(nums);
        for (int i : sumColumnsResult) {
            System.out.println("Сумма столбцов: " + i);
        }
    }

    /**
     * Сортирует элементы в массиве
     *
     * @param nums массив чисел
     */
    static void changeArray(int[] nums) {
        Arrays.sort(nums);
    }

    /**
     * Создает копию массива и заполняет исходные элементы на 0.
     *
     * @param nums
     */
    static void changeCopyArray(int[] nums) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.fill(numsCopy, 0);
        System.out.println(Arrays.toString(numsCopy));
    }
}
