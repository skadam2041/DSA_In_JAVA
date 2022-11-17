//Problem Description
//        You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
//
//        Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1
//        (where i, j are 1-based).


public class minorDigonalSum {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},
                     {5,6,7},
                     {9,2,3}};
        System.out.println(MinorDigonalSum(A));

    }
    public static int MinorDigonalSum(final int[][] A) {
        //method 1
        // int sum = 0;
        // for(int row = 0; row < A.length; row++)
        // {
        //     for(int col = 0; col< A[0].length; col++)
        //     {
        //         if(row+col+2 == A.length+1)
        //         {
        //             sum = sum + A[row][col];
        //         }
        //     }
        // }
        // return sum;

        //method2 >minor digonal is right to left digonal> sum of digonal element from right top to left bottom
        int sum = 0;
        int col = A.length-1;
        int row = 0;
        while(col>=0)
        {
            sum = sum+A[row][col];
            col--;
            row++;
        }
        return sum;
    }
}
