
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("");
        int number=in.nextInt();
=======
        System.out.println("Enter number to be examined: ");
        int number = in.nextInt();
>>>>>>> main

                System.out.println("Number of digits: " + Harshad.numberOfDigits(number));
                System.out.println("Sum of digits: " + Harshad.sumOfDigits(number));

        // Fibonacci

        // Harshad
        // Harshad
=======
        //Fibonacci
        boolean isFibonacci = fibonacci.isFibonacci(number);
        System.out.print(number + " is ");
        
        if(!isFibonacci) System.out.print("not");

        System.out.println(" a Fibonacci number.");

        //Harshad

        boolean isHarshad = Harshad.harsahdChecker(number);
        System.out.print(number + " is ");
        
        if(!isHarshad) System.out.print("not");

        System.out.println(" a Harshad number.");


        //Prime Number
<<<<<<< HEAD
        System.out.println(Prime.isPrime(number));
=======

        boolean isPrime;
        System.out.print(number + " is ");
        
        if(!isPrime) System.out.print("not");

        System.out.println(" a Prime number.");
>>>>>>> main
>>>>>>> main

        System.out.println(" a Fibonacci number.");

        //Harshad

        boolean isHarshad = Harshad.harsahdChecker(number);
        System.out.print(number + " is ");
        
        if(!isHarshad) System.out.print("not");

        System.out.println(" a Harshad number.");


        //Prime Number

        boolean isPrime;
        System.out.print(number + " is ");
        
        if(!isPrime) System.out.print("not");

        System.out.println(" a Prime number.");
>>>>>>> main

                // Prime Number

        // Narcissistic number
        // Narcissistic number
=======
        boolean isNarcissistic = narcissistic.isNarcissistic(number);
        System.out.print(number + " is ");
        
        if(!isNarcissistic) System.out.print("not");

        System.out.println(" a Narcissistic number.");
>>>>>>> main
                // Narcissistic number
=======
        boolean isNarcissistic = narcissistic.isNarcissistic(number);
        System.out.print(number + " is ");
        
        if(!isNarcissistic) System.out.print("not");

        System.out.println(" a Narcissistic number.");
>>>>>>> main

        }
}
