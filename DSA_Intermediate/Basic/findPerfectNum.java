//Problem Description
//        You are given an integer A. You have to tell whether it is a perfect number or not.
//
//        Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//
//        A proper divisor of a natural number is the divisor that is strictly less than the number.

//logic : traversing 1 to sqrt of num and checking facors..
//check i is != A/i if same number concider once in else condition
//adding them i and A/i into ans


public class findPerfectNum {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPerfect(n));
    }
    public static int isPerfect(int A) {
        int ans = 0;
        for(int i = 1; i*i<=A; i++) // loop will go from 1 to sqrt of num
        {
            if(A%i == 0)
            {
                if(i != (A/i)) // check i is != A/i if same number concider once in else condition
                {
                    ans = ans + i + (A/i);
                }
                else
                {
                    ans = ans + i ;
                }
            }
        }
        if(A == (ans - A))
        {
            return 1;
        }
        return 0;
    }
}
