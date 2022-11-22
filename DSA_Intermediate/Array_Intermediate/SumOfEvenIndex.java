//Problem Description
//        You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
//        For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].
//
//        Note : Use 0-based indexing

public class SumOfEvenIndex {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int [][]B = {    {0,2},
                         {1,4}   };
        int ans [] = EvenSumInRange(A,B);
        for(int i = 0; i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] EvenSumInRange(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        int prefixEvenSumArray[] = new int[A.length];
        int sum = A[0];
        prefixEvenSumArray[0] = sum;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + A[i];
                prefixEvenSumArray[i] = sum;
            } else {
                prefixEvenSumArray[i] = sum;
            }
        }
        int ans[] = new int[m];
        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];
            if (start == 0) {
                ans[i] = prefixEvenSumArray[end];
            } else {
                ans[i] = prefixEvenSumArray[end] - prefixEvenSumArray[start - 1];
            }
        }
        return ans;
    }
}
