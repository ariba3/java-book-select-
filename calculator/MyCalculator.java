package ariba;


import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n) {

        int sum = 0;
        System.out.print("Divisor of "+n+ " => ");
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                sum += i;
                System.out.print(i+" ");
            }
        }
        return sum;

    }
    @Override
    public BigInteger findFactorial(int n) {

        BigInteger factorial = BigInteger.ONE;
        for ( int i = 1; i <= n; i++ ) 
        {
        	factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}

/*
Name:Ariba Khan
ID: 2012020325
Section: G
Email: cse_2012020325@lus.ac.bd
Date: 16.10.2021
*/