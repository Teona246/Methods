public class Methods {
    /**
     * Принимает одно целое число типа int и возвращает его квадрат
     *
     * @param number с переменными типа int
     * @return возвращает число в квадрате
     */
    static int square(int number) {
        int numSquare = (int) Math.pow(number, 2);
        return numSquare;
    }

    /**
     * Принимает два параметра типа String и выводит полное имя в формате: "Full name: Имя Фамилия"
     *
     * @param name     с переменными типа String
     * @param lastName с переменными типа String
     * @return выводит полное имя в формате: Имя и Фамилия
     */
    static String printFullName(String name, String lastName) {
        return name + " " + lastName;
    }


    /**
     * Находит из переменных типа String самый маленький и самый большой элемент и проверяет на пустоту
     *
     * @param text varargs с переменными типа String
     * @return возвращает самый маленький и самый большой элемент.
     */
    static String[] cornerValuesArray(String... text) {
        if (text.length == 0) {
            return new String[0];
        }

        String shortText = text[0];
        String longText = text[0];
        for (String element : text) {
            if (element.length() < shortText.length()) {
                shortText = element;
            }
            if (element.length() > longText.length()) {
                longText = element;
            }
        }
        return new String[]{shortText, longText};
    }

    /**
     * Находит из переменных типа int самый маленький и самый большой элемент и проверяет на пустоту
     *
     * @param num varargs с переменными типа int
     * @return возвращает самый маленький и самый большой элемент.
     */
    static int[] cornerValuesArray(int... num) {
        if (num.length == 0) {
            return new int[0];
        }

        int shortNum = num[0];
        int longNum = num[0];

        for (int element : num) {
            if (element < shortNum) {
                shortNum = element;
            }
            if (element > longNum) {
                longNum = element;
            }
        }
        return new int[]{shortNum, longNum};

    }


    /**
     * Находит из переменных типа char самый маленький и самый большой элемент и проверяет на пустоту
     *
     * @param characters varargs с переменными типа char
     * @return возвращает самый маленький и самый большой элемент.
     */
    static char[] cornerValuesArray(char... characters) {
        if (characters.length == 0) {
            return new char[0];
        }

        char shortChar = characters[0];
        char longChar = characters[0];

        for (char element : characters) {
            if (element < shortChar) {
                shortChar = element;
            }
            if (element > longChar) {
                longChar = element;
            }
        }
        return new char[]{shortChar, longChar};
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
