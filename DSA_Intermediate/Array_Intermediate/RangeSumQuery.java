//Problem Description
//        You are given an integer array A of length N.
//        You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//        For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
//        More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

///--------------logic-------------///
//create a prefixsum array > it will store the sum of elements till ith index of original at ith index of itself
//>>sum = rightelement sum - (left element-1) sum
//original = 1 1 1 3  6  6
//pfSum =    1 2 3 6 12 18
//sum between 2 and 4 is (1 indexing)  = pf[4] - pf[1] > 6-1 = 5 > 1+1+3 from original array
//
//handle edge case of 0th index as it will not be conciderd in formula so handle it

public class RangeSumQuery {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 7 , 8};
        int B[][]= {
                {2, 4},  // indexing is 1 based
                {4, 5}
                  };
        long ans [] = InRangeSum(A,B);
        for(int i = 0; i< ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static long[] InRangeSum(int[] A, int[][] B) {
        long PF[] = new long[A.length];
        long sum = 0;
        for (int i = 0; i < A.length; i++) { //Create Prefix array
            sum = sum + A[i];
            PF[i] = sum;
        }
        long ANS[] = new long[B.length];
        for(int i = 0; i < B.length ; i++)  //for eack start and end index of B[][] array run loop for each loop
        {
            int L = B[i][0] - 1;  //if Array is 1 indexed >(index start from 1)
            int R = B[i][1] - 1;
            if(L>0) //when left index is non zero
            {
                ANS[i] = PF[R] - PF[L-1]; //right index sum - left index sum
            }
            else  // if left index is 0 then we can simply calculate ans by right sum only
            {
                ANS[i] = PF[R];
            }
        }return ANS;
    }
}
