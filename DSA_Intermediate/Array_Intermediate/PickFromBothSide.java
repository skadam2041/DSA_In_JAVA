//Problem Description
//        You are given an integer array A of size N.
//
//        You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0)
//        from the right end of array A to get the maximum sum.
//
//        Find and return this maximum possible sum.
//
//        NOTE: Suppose B = 4, and array A contains 10 elements, then
//
//        You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from
//        the back, etc. You need to return the maximum possible sum of elements you can pick.

//A = [5, -2, 3 , 1, 2]
//        B = 3
//        Example Explanation
//        Explanation 1:
//
//        Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
 //////////////////////check commments in code/////////////////////////////
public class PickFromBothSide {
    public static void main(String[] args) {
        int A[] = {5, -2, 3 , 1, 2};
        int B = 3;
        System.out.println(FindMaxSum(A,B));
    }
    public static int FindMaxSum(int[] A, int B) {
        int ans =  Integer.MIN_VALUE; //ans will be minimum
        int left = 0;  //initialize sum of left side element
        int right = 0; //initialize sum of right side element
        for(int i = 0; i<B;i++) //for B elements from left side find left sum;
        {
            left = left +A[i];
        }
        ans = Math.max(ans, left+right); //assign left sum to ans

        int i = B-1; //initialize 2 pointers i  and j //
        int j = A.length-1;
        while(i>=0)
        {
            left = left - A[i]; // substract elements 1 by 1 from left side
            right = right + A[j]; //add elements from right side 1 by 1
            i--;
            j--;
            ans = Math.max(ans, left+right);   // compare for max sum
        }
        return ans;
    }
}
