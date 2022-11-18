//Problem Description
//
//        You are given a matrix A, you have to return another matrix which is the transpose of A.
//
//        NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row.
//        The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index,
//        and the element at (j, i)th index to (i, j)th index.

//
public class TransposeMat {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},
                {5,6,7},
                {9,2,3}};
       makeTranspose(A);
        for(int row = 0; row < A.length; row++)
        {
            for(int col = 0; col < A[0].length; col++)
            {
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] makeTranspose(int[][] A) {
        for(int row = 0; row < A.length; row++)
        {
            for(int col = 0; col < row; col++)
            {
                int temp = A[row][col];
                A[row][col] = A[col][row];
                A[col][row] = temp;
            }
        }
        return A;
    }
}
