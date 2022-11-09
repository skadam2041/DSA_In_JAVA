//Problem Description
//        Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
//        1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
//        2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
//        Your task is to find the count of good subarrays in A.

public class GoodSubArrray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int B=4;
        System.out.println(CountGoodSubarray(A,B));
    }
    public  static int CountGoodSubarray(int[] A, int B) {
        // int count = 0;
        // for(int s = 0; s<A.length; s++)
        // {
        //     for(int e = s; e<A.length;e++)
        //     {
        //         int subsum = 0;
        //         for(int i = s; i<=e;i++)
        //         {
        //             subsum = subsum+A[i];
        //         }
        //         if( ((e-s+1)%2 ==0) && (subsum<B ))
        //         {
        //             count++;
        //         }
        //         else if(((e-s+1)%2 !=0) && (subsum>B ))
        //         {
        //             count++;
        //         }
        //     }
        // }return count;

        int count = 0;
        int s= 0,e =0;
        for(s = 0; s<A.length; s++)
        {
            int subsum = 0;
            for( e = s; e<A.length;e++)
            {
                subsum = subsum+A[e];
                if( ((e-s+1)%2 ==0) && (subsum<B ))
                {
                    count++;
                }
                else if(((e-s+1)%2 !=0) && (subsum>B ))
                {
                    count++;
                }
            }
        }return count;
    }
}
