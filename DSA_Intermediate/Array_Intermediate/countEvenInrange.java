//Problem Description
//        You are given an array A of length N and Q queries given by the 2D array B of size Q*2.
//        Each query consists of two integers B[i][0] and B[i][1].
//        For every query, the task is to find the count of even numbers in the range A[B[i][0]…B[i][1]].

//logic************//
//create prfix count array which will store count of even elements till ith index to i index of itse; same prefix sum logic
//if(L>0)
//        {
//        ans[i] = PC[R] - PC[L-1];
//        }
//        else
//        {
//        ans[i] = PC[R];
//        }

public class countEvenInrange {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 7 , 8};
        int B[][]= {
                {2, 4},  // indexing is 0 based
                {4, 5}
        };
        int ans[] = countEvenPrefix(A,B);
        for(int i = 0; i< ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
    public static  int[] countEvenPrefix(int[] A, int[][] B) {
        int PC[] = new int[A.length]; //prefix count
        int count = 0;
        for(int i = 0; i<A.length;i++) //create prrefix count array
        {
            if(A[i]%2==0)
            {
                count++;
            }
            PC[i] = count;
        }
        int ans[] = new int[B.length];
        for(int i = 0; i<B.length; i++)
        {
            int L = B[i][0];
            int R = B[i][1];
            if(L>0)
            {
                ans[i] = PC[R] - PC[L-1];
            }
            else
            {
                ans[i] = PC[R];
            }
        }
        return ans;
    }
}
