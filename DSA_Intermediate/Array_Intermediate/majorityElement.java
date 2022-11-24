//Problem Description
//        Given an array of size N, find the majority element. The majority element
//        is the element that appears more than floor(n/2) times.
//        You may assume that the array is non-empty and the majority element always exists in the array.

public class majorityElement {
    public static void main(String[] args) {
        int A[] = {1,2,2,2, 3,4};
        System.out.println(FindmajorityElement(A));

    }
    public static int FindmajorityElement(final int[] A) {
        //brute force.. nlogn
        //sort array and return  middle index as half of array elements will be majority elements
        // int n = A.length;
        // Arrays.sort(A);
        // return A[n/2];


        // n and i > moore voting also
        int ans = A[0];
        int freq = 1;

        for(int i = 1; i<A.length; i++)
        {
            if(freq == 0)
            {
                ans = A[i];
                freq = 1;
            }
            else if(A[i] == ans)
            {
                freq++;
            }
            else
            {
                freq--;
            }
        }
        return ans;
    }
}
