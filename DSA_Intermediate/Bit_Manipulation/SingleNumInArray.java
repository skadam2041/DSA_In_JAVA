//Problem Description
//        Given an array of integers A, every element appears twice except for one.
//        Find that integer that occurs once.
//        NOTE: Your algorithm should have a linear runtime complexity.
//        Could you implement it without using extra memory?
//        A^A = 0 and 0^B =B;..duplicates will become zero and single element xor 0 is single element

public class SingleNumInArray {
    public static void main(String[] args) {
        int A[] = {1,1,2,2,3,4,4,5,5};
        System.out.println(FindSingleNumber(A));
    }
    public static int FindSingleNumber(final int[] A) {
        int ans = A[0];
        for(int i = 1; i<A.length; i++)
        {
            ans = ans^A[i];
        }
        return ans;
    }
}
