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
}
