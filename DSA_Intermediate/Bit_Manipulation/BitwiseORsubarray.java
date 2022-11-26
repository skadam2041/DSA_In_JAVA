//Problem Description
//        Given an array B of length A with elements 1 or 0. Find the number of subarrays with bitwise OR 1.

// Consider below inputs and outputs.

// input               output
// 0001                 4
// 0010                 3
// 0100                 2
// 1000                 1

// from this table it is clear that if ith array element is set then there will be  i+1 number of possible subarrays
// with bitwise OR resulting in 1 where i starts from value 0.

// so simplest approach is to, check for every i if ith number is 1 and add i+1 (possibleSubArraysForThisIndex) to the
// result. And if the ith number is 0 then carry forward the current value of possibleSubArraysForThisIndex to the result as
// number of subarrays are increased in proportion.

// B[]: 1 0 1 0
// i   B[i]  possibleSubArraysForThisIndex result
// 0  1      1                                                                1
// 1  0      1                                                                2
// 2  1      3                                                                5
// 3  0      3                                                                8

public class BitwiseORsubarray {
    public static void main(String[] args) {
        int A = 5;
        int B[] = {1,0 ,0 ,1,1};
        System.out.println(countASubArray(A,B));
    }
    public static long countASubArray(int A, int[] B)
    {
        long possibleSubArraysForThisIndex = 0;
        long  result = 0;

        for (int i = 0; i < A; i++)
        {
            if (B[i] == 1)
            {
                possibleSubArraysForThisIndex = i + 1;
            }
            result = result + possibleSubArraysForThisIndex;
        }
        return  result;
    }
}
