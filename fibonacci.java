public class fibonacci {

    public static boolean isPerfectSquare(int number) {
        for (int i = 0; i <= Math.sqrt(number); i++) {
            if (number == (i * i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFibonacci(int number) {
        if (isPerfectSquare((int) (5 * Math.pow(number, 2) + 4))
                || isPerfectSquare((int) (5 * Math.pow(number, 2) - 4))) {
            return true;
        }
        return false;
    }

}
