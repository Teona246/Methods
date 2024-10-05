public class Methods {
    static int square(int number) {
        int numSquare = (int) Math.pow(number, 2);
        return numSquare;
    }
    static String printFullName(String name, String lastName) {
        return name + " " + lastName;
    }

    static String[] cornerValuesArray(String[] array) {
        String shortText = array[0];
        String longText = array[0];
        for (String element : array) {
            if (element.length() < shortText.length()) {
                shortText = element;
            }
            if (element.length() > longText.length()) {
                longText = element;
            }
        }
        return new String[]{shortText, longText};
    }
    static int[] cornerValuesArray(int[] array) {
        int shortNum = array[0];
        int longNum = array[0];

        for (int element : array) {
            if (element < shortNum) {
                shortNum = element;
            }
            if (element > longNum) {
                longNum = element;
            }
        } return new int [] {shortNum, longNum};

    }

    static char [] cornerValuesArray (char [] array) {
        char shortChar = array [0];
        char longChar = array [0];

        for ( char element : array) {
            if ( element < shortChar) {
                shortChar = element;
            } if (element > longChar) {
                longChar = element;
            }
        } return new char [] {shortChar, longChar};
    }
}
