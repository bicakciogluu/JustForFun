public class Harshad {
    public static boolean harsahdChecker(int a) {
        int temp1 = a;
        int temp2 = a;
        int digit = 0;
        int divider = 0;

        while (temp1 > 0) {
            temp1 /= 10;
            digit++;
        }

        for (int i = 0; i < digit; i++) {
            divider += temp2 % 10;
            temp2 /= 10;
        }

        if ((a / divider) * divider == a) {
            return true;
        }
        return false;
    }

    public static int numberOfDigits(int a) {
        int digit = 0;
        while (a > 0) {
            a /= 10;
            digit++;
        }
        return digit;
    }

    public static int sumOfDigits(int a) {
        int result = 0;
        while (a > 0) {
            result += a % 10;
            a /= 10;
        }
        return result;
    }
}