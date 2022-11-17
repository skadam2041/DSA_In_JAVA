//Problem Description
//        You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.


public class ColumnSumMatrix {
    public static void main(String[] args) {
        int A[][] = {{1,2,3,4},
                  {5,6,7,8},
                   {9,2,3,4}};
        int ans[]= ColumnSum(A);
        for(int i = 0; i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] ColumnSum(int[][] A) {
        int ans[] = new int[A[0].length];
        int sum = 0;
        for(int col = 0; col < A[0].length; col++)
        {
            sum = 0;
            for(int row = 0; row< A.length; row++)
            {
                sum = sum + A[row][col];
            }
            ans[col] = sum;
        }
        return ans;
    }
}
