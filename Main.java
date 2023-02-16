

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to be examined: ");
        int number = in.nextInt();

        //Fibonacci
        boolean isFibonacci;
        System.out.println(number + " is ");
        
        if(!isFibonacci) System.out.println("not");

        System.out.println(" a Fibonacci number.");

        //Harshad

        boolean isHarshad;
        System.out.println(number + " is ");
        
        if(!isHarshad) System.out.println("not");

        System.out.println(" a Harshad number.");


        //Prime Number

        boolean isPrime;
        System.out.println(number + " is ");
        
        if(!isPrime) System.out.println("not");

        System.out.println(" a Prime number.");

        //Narcissistic number

        boolean isNarcissistic;
        System.out.println(number + " is ");
        
        if(!isNarcissistic) System.out.println("not");

        System.out.println(" a Narcissistic number.");

    }
}
