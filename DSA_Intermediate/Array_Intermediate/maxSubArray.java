//Problem Description
//        You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
//        But the sum must not exceed B.
//Example Input
//        Input 1:
//        A = 5
//        B = 12
//        C = [2, 1, 3, 4, 5]
//        Explanation 1:
//        We can select {3,4,5} which sums up to 12 which is the maximum possible sum.

//////////logic............///
//traverse through all element and check one by one in next loop
//        make sub sum = 0
//   traverse from that index to last
//    sum = sum+ A[i]
//   check for max sum in each iteration assign it to max
//    in next interarion of for loop sum = 0
//again find max sum for all subarrays
//finally max will be ans


public class maxSubArray {
    public static void main(String[] args) {
        int  A = 5;
        int B = 12;
        int C[] = {2, 1, 3, 4, 5};
        System.out.println(maxSubarraySum(A,B,C));

    }
    public static int maxSubarraySum(int A, int B, int[] C) {

        //with prefix array logic//
        // int pfsum[] = new int[A];
        // int sum = 0;
        // for(int i = 0; i<A; i++)
        // {
        //     sum = sum+C[i];
        //     pfsum[i] = sum;
        // }
        // //created pf array
        // int maxsum = 0;
        // for(int i = 0; i<A; i++)
        // {
        //     int sumsub = 0;
        //     for(int j = i; j<A; j++)
        //     {
        //         if(i>0)
        //         {
        //             sumsub = pfsum[j] - pfsum[i-1];
        //         }
        //         else
        //         {
        //             sumsub = pfsum[j];
        //         }
        //         if(sumsub>maxsum && sumsub<=B)
        //         {
        //             maxsum = sumsub;
        //         }
        //     }
        // }
        // return maxsum;


        //with carry forward logic
        int maxsum = 0;
        for(int i = 0; i<A; i++)
        {
            int sumsub = 0;
            for(int j = i; j<A; j++)
            {
                sumsub = sumsub + C[j];
                if(sumsub>maxsum && sumsub<=B)
                {
                    maxsum = sumsub;
                }
            }
        }
        return maxsum;
    }


}
