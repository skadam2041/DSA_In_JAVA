//Problem Description
//        You are given an integer array A of length N.
//        You have to find the sum of all subarray sums of A.
//        More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
//        A subarray sum denotes the sum of all the elements of that subarray.

/////////////////////logic : occurance = (i+1)*(n-i); ///////////


public class SumOfAllSubArrays {
    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        System.out.println(AllsubarraySum(A));

    }
    public static long AllsubarraySum(int[] A) {

        //brute force approach gets TLE

        // int sumsub = 0;
        // for(int i = 0; i<A.length; i++)
        // {
        //     for(int j = i; j<A.length; j++)
        //     {
        //         for(int k = i; k<=j; k++)
        //         {
        //             sumsub = sumsub + A[k];
        //         }
        //     }
        // }
        // return sumsub;

        //optimal//
        long n = A.length;
        long totalSum = 0;
        for(int i = 0; i<n;i++)
        {
            long occurance = (i+1)*(n-i);
            long sum = occurance*A[i];
            totalSum = totalSum+sum;
        }
        return totalSum;
    }
}
