//Problem Description
//        You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
//Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
public class mainDigonalSum {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},
                {5,6,7},
                {9,2,3}};
        System.out.println(DigonalSum(A));
    }
    public static int  DigonalSum(final int[][] A) {
        int sum = 0;
        for(int row = 0; row < A.length; row++)
        {
        sum = sum+A[row][row];
        }
        return sum;
    }
}
