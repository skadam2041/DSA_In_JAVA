public class rowSumMatrix {
    public static void main(String[] args) {
        int A[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,2,3,4}};
        int ans[]= rowSum(A);
        for(int i = 0; i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] rowSum(int[][] A) {
        int ans[] = new int[A.length];
        int sum = 0;
        for(int row = 0; row < A.length; row++)
        {
            sum = 0;
            for(int col = 0; col< A[0].length; col++)
            {
                sum = sum + A[row][col];
            }
            ans[row] = sum;
        }
        return ans;
    }
}
