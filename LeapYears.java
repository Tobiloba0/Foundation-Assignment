public class LeapYears {

    public static boolean isLeapYear(int year) {

        // Leap year logic without built-in functions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("The leap year between 1900 and 2025:");

        for (int year = 1900; year <= 2025; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }
}

