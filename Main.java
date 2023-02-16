
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be examined: ");
        int number = in.nextInt();

        System.out.println("Number of digits: " + Harshad.numberOfDigits(number));

        // Fibonacci
        boolean isFibonacci = fibonacci.isFibonacci(number);
        System.out.print(number + " is ");
<<<<<<< Updated upstream
        
        if(!isFibonacci) System.out.print("not ");
=======

        if (!isFibonacci)
            System.out.print("not");
>>>>>>> Stashed changes

        System.out.println("a Fibonacci number.");

        // Harshad

        boolean isHarshad = Harshad.harsahdChecker(number);
        System.out.print(number + " is ");
<<<<<<< Updated upstream
        
        if(!isHarshad) System.out.print("not ");

        System.out.println("a Harshad number.");
=======

        if (!isHarshad)
            System.out.print("not");
>>>>>>> Stashed changes

        System.out.println(" a Harshad number.");

        // Prime Number

        boolean isPrime = Prime.isPrime(number);
        System.out.print(number + " is ");
<<<<<<< Updated upstream
        
        if(!isPrime) System.out.print("not ");
=======

        if (!isPrime)
            System.out.print("not");
>>>>>>> Stashed changes

        System.out.println("a Prime number.");

        // Narcissistic number

        boolean isNarcissistic = narcissistic.isNarcissistic(number);
        System.out.print(number + " is ");
<<<<<<< Updated upstream
        
        if(!isNarcissistic) System.out.print("not ");
=======

        if (!isNarcissistic)
            System.out.print("not");
>>>>>>> Stashed changes

        System.out.println("a Narcissistic number.");

    }
}
