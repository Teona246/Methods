import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    static void task1() {
        System.out.println("Task 1");
        System.out.println(Methods.square(6));
        System.out.println(Methods.square(33));
        System.out.println(Methods.square(4));
        System.out.println(Methods.square(56));
        System.out.println();
    }

    static void task2() {
        System.out.println("Task 2");
        System.out.println(Methods.printFullName("Teona", "Chelidze"));
        System.out.println();
    }

    static void task3() {
        System.out.println("Task 3");
        String[] words = {"Yesterday", "love", "was", "such", "an", "easy", "game", "to", "play"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(words)));
        System.out.println();
    }

    static void task4() {
        System.out.println("Task 4");

        int[] numbers = {6, 4, 8, 9, 3};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(numbers)));

        char[] chars = {'6', 'D', '8', 'a', 'F'};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(chars)));

    }
}