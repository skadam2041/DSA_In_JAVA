//Problem Description
//        Given an integer A, generate a square matrix filled with elements from 1 to A2 in
//        spiral order and return the generated square matrix.
//        1 --> 2
//              |
//              |
//        4<--- 3
public class SpiralOrderMatrix1 {
    public static void main(String[] args) {
        int n = 4;
        int A [][] = generateSpiralMatrix(n);
        for(int row = 0; row < A.length ; row++)
        {
            for(int col = 0; col < A[0].length; col++)
            {
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }

    }
    public static int[][] generateSpiralMatrix(int A) {
        int ans[][] = new int[A][A];
        if(A==1) ///edge case
        {
            ans[0][0] = 1;
            return ans;
        }
        //declare i and j
        int i = 0;
        int j = 0;
        int steps =ans.length-1; //steps will always be this formula
        int num =1;
        while(steps>=1)
        {
            //above row//1st row > i = 0, j = 0
            for(int k = 0; k<steps; k++)
            {
                ans[i][j] = num;
                num++;
                j++;
            }
            //last colume//right colume > i = 0, j = A.length-1
            for(int k = 0; k<steps; k++)
            {
                ans[i][j] = num;
                num++;
                i++;
            }
            //bottom row//last row > i =  A.length-1 , j =  A.length-1
            for(int k = 0; k<steps; k++)
            {
                ans[i][j] = num;
                num++;
                j--;
            }
            //1st col // left colume > i =  A.length-1, j = 0
            for(int k = 0; k<steps; k++)
            {
                ans[i][j] = num;
                num++;
                i--;
            }
            //j = 0, i = 0

            i++;
            j++;
            steps = steps-2;
        }
        //for odd length matrix
        if(steps == 0)
        {
            ans[i][j] = num;
        }
        return ans;
    }
}
