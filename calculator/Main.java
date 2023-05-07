package ariba;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        MyCalculator myCalculator = new MyCalculator();
        
        System.out.print("Enter number for sum(1-100): ");
        int number= input.nextInt();
        System.out.print("Enter number Factorial(1-50): ");
        int factorial= input.nextInt();
        
        System.out.println("\nSum of Divisor = " + myCalculator.divisorSum(number));
        System.out.print("Factorial = " + myCalculator.findFactorial(factorial));
        input.close();
	}

}

/*
 Name:Ariba Khan
 ID: 2012020325
 Section: G
 Email: cse_2012020325@lus.ac.bd
 Date: 16.10.2021
 */
