//Problem Description
//        Write a function that takes an integer and returns the number of 1 bits it has.
// logic=== use checkBit logic and then count 1;



public class CountOnBits {
    public static void main(String[] args) {
        int A = 345;
        System.out.println(numSetBits(A));
    }
    public static int numSetBits(int A) {
        int count = 0;
        for(int i = 0; i<=31; i++)
        {
            if((A&(1<<i)) != 0) // >> 1*2^i // 0001, 0010, 0100 // if A&(1<<i)) == 0 means 0 ,
                                // if A&(1<<i)) != 0 means some decimal number with 2s power
            {
                count++;
            }
        }
        return count;
    }
}
