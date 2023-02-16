import java.util.Scanner;

/**
 * narcissistic
 */
public class narcissistic {
    public static boolean isNarcissistic(int a) {
        int total = 0;
        int i = 0;
        for (int b = 0; b < 100; b++) {
            if (Math.pow(10, (double) b) > a) {
                i = b;
                break;
            }
        }
        int var = a;
        for (int b = 0; b < i + 3; b++) {
            int bas = 0;
            bas = var % 10;
            var = var / 10;
            total = total + (int) Math.pow(bas, i);
        }
        if (a == total) {
            return true;

        } else {
            return false;
        }

    }
}
