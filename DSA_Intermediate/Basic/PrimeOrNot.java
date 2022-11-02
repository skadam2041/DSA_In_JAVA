//Problem Description
//        Given an Integer A. Return 1 if A is prime and return 0 if not.
// logic : prime number will have 2 factors only so if anyone factor is between 2 and sqrt n then it is not prime

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number : ");
        long n = s.nextLong();
        System.out.println(IsPrime(n));
    }
    public static int IsPrime(Long A) {
        int count = 2; // prime number not will have more than 2 factors
        if(A==0 || A==1)
        {
            return 0; // 1 and 0 non prime
        }

        for(long i = 2; i*i <=A; i++) // going from 2 to sqrt of A
        {
            if(A%i == 0) //anything goes inside if is true then it is non prime
            {
                return 0;
            }
        }
        return 1;
    }
}
