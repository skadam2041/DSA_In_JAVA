//Problem Description
//        Reverse the bits of an 32 bit unsigned integer A.
//
//        00000000000000000000000000000011
//        =>      11000000000000000000000000000000

//check bits from right side and multiply with max value on right side at ith index : 31 > 1, 30 > 2 like that
public class reverseAllBits {
    public static void main(String[] args) {
        long A = 24L;
        System.out.println(reverseBits(A));
    }
    public static long reverseBits(long A) {
        long n = 2147483648L; //largest integer
        long ans = 0;
        while(A>0)
        {
            long bin = A%2;
            ans = ans + bin*n;
            A = A>>1;
            n = n>>1;
        }
        return ans;
    }
}
