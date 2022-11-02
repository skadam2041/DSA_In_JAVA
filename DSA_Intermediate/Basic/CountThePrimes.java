import java.util.Scanner;

//Problem Description
//        You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
//logic: traverse till n for all number and each i number will travel till sqrt of itself
public class CountThePrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = s.nextInt();
        System.out.println(countPrime(n));
    }
    public static int countPrime(int A) {
        int count = 0;
        if(A==0 || A==1)
        {
            return 0; // 1 and 0 non prime
        }
        for(int i = 2; i<=A;i++)
        {
            if(isprime(i) == 1)
            {
                count++;
            }
        }
        return count;
    }
    public static int isprime(int i) {
        int count = 2; // prime number will have more than 2 factors
        if(i==0 || i==1)
        {
            return 0; // 1 and 0 non prime
        }
        else if (i % 2 == 0 && i!=2 )
        {
            return 0;
        }
        for(long j = 2; j*j <=i; j++) // going from 2 to sqrt of i
        {
            if(i%j == 0) //anything goes inside if is true then it is non prime
            {
                return 0;
            }
        }
        return 1;
    }
}

