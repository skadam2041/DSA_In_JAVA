//Problem Description
//        You are given a n x n 2D matrix A representing an image.
//
//        Rotate the image by 90 degrees (clockwise).
//
//        You need to do this in place.
//
//
//Input 1:
//
//        [
//        [1, 2],
//        [3, 4]
//        ]
//        Output 1:
//
//        [
//        [3, 1],
//        [4, 2]
//        ]
//////logic.....////
//1]make transpose travel rowwise and reverse the row
public class rotateMatrix {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},
                {5,6,7},
                {9,2,3}};
        RotateMatrix(A);
        for(int row = 0; row < A.length; row++)
        {
            for(int col = 0; col < A[0].length; col++)
            {
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] RotateMatrix(int[][] A) {
        //create transpose of matrix//
        for(int row = 0; row < A.length; row++)
        {
            for(int col = 0; col < row; col++)
            {
                int temp = A[row][col];
                A[row][col] = A[col][row];
                A[col][row] = temp;
            }
        }
        //reverse row wise
        for(int row = 0; row < A.length; row++)
        {
            int i = row;
            int j = 0;
            int k = A[0].length-1;
            while(j<k)
            {
                int temp= A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
                j++;
                k--;
            }
        }
        return A;
    }
}
