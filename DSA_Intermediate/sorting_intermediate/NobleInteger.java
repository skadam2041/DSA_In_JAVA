//Problem Description
//        Given an integer array A, find if an integer p exists in the array such that the number of
//        integers greater than p in the array equals p.

//------logic------------

// first sort the array increasing order
// then  travel from 0 to n
// n-i-1 elements will be greater than element at i

import java.util.Arrays;

public class NobleInteger {
    public static void main(String[] args) {
        int A[] = {3, 2, 1, 3};
        System.out.println(checkNoble(A));
    }

    public static int  checkNoble(int A[]) {
        Arrays.sort(A); //sort array
        int n = A.length;
        int countNoble= 0;
        int greaterElementCount = -1;
        if (A[n-1] == 0)
        {
            return 1;
        }
        for(int i = 0; i < n-1;i++)
        {
            if(A[i]!=A[i+1])
            {
                greaterElementCount = n-i-1;
                if(greaterElementCount == A[i])
                {
                    return 1;
                }
            }
        }
        return -1;


    }
}
