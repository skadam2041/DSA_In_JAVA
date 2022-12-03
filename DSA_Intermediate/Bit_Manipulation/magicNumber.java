//Problem Description
//        Given an integer A, find and return the Ath magic number.
//
//        A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
//
//        First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), …
public class magicNumber {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(FindNthMagicNumber(A));
    }
    public static int FindNthMagicNumber(int A) {
        // Convert the given number A in Binary.
        // Multiply each binary number in powers of 5.
        // for 1010 > 5x0+25x1+125x0+1x625 = 650
        int mult = 5;
        int ans = 0;
        while(A>0)
        {
            int rem = A%2; //to convert into binary find remender
            ans = ans + rem*mult; //Multiply with 5 ki power at each iteration
            mult = mult*5; //increase 5 ki power
            A = A>>1;//devide by 2
        }
        return ans;


    }
}
