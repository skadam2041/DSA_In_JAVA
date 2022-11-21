//Problem Description
//        You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
//        The cost of these trees is Bp + Bq + Br.
//
//        You are to choose 3 trees such that their total cost is minimum. Return that cost.
//
//        If it is not possible to choose 3 such trees return -1.
public class ChristmusTree {
    public static void main(String[] args) {
        int []A = {1, 6, 4, 2, 6, 9};
        int []B = {2, 5, 7, 3, 2, 7};
//        We can choose the trees with indices 1, 4 and 5, and the cost is 2 + 3 + 2 = 7.
//        This is the minimum cost that we can get.
        System.out.println(minCost(A,B));
    }
    public static int minCost(int[] A, int[] B) {

        int ans = -1;

        for(int j = 1; j<A . length-1;j++)
        {
            int leftsum = Integer.MAX_VALUE;
            int rightsum = Integer.MAX_VALUE;

            //find sum of elements smaller than A[j] before it on left side

            for(int i = 0; i<j; i++)
            {
                if(A[i]<A[j])
                {
                    if(leftsum >= B[i])
                    {
                        leftsum = B[i];
                    }
                }
            }

            //find sum of elements greater than A[j] after it on right side

            for(int k = j+1; k<A . length; k++)
            {
                if(A[k]>A[j] )
                {
                    if(rightsum >= B[k])
                    {
                        rightsum = B[k];
                    }
                }
            }
            if(leftsum!=Integer.MAX_VALUE  && rightsum!=Integer.MAX_VALUE && (ans==-1 || ans >= (leftsum+rightsum + B[j] )))
            {
                ans = leftsum + rightsum + B[j];
            }
        }
        return ans;
    }
}
