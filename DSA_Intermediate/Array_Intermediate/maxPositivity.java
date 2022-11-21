//Problem Description
//        Given an array of integers A, of size N.
//
//        Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.
//
//        NOTE: It is guaranteed that an answer always exists.
public class maxPositivity {
    public static void main(String[] args) {
        int A[] = {5, 6, -1, 7, 8};
        int ans[] = FindMaxPositiveLength(A);
        for(int i = 0; i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] FindMaxPositiveLength(int[] A) {
        //create  suffix count array
        int suffixCount[] = new int[A.length];
        int PositiveCount = 0;
        for(int i = A.length-1; i>=0;i--)
        {
            if(A[i]<0)
            {
                PositiveCount = 0;
            }
            else
            {
                PositiveCount++;
            }
            suffixCount[i] = PositiveCount;
        }
        int ans = -1;
        int start = -1;
        int end = -1;
        //corner case at end ..
        if(A[A.length-1]<0)
        {
            ans = 0;
        }

        //for elements in between
        for(int  i = A.length-2; i>=0;i--)
        {
            if(A[i]<0)
            {
                if(ans<=suffixCount[i+1])
                {
                    ans = suffixCount[i+1];
                    start = i+1;
                    end = start + ans;
                }
            }
        }

        //corner case at start
        if(A[0]>0)
        {
            if(ans <= suffixCount[0])
            {
                ans = suffixCount[0];
                start = 0;
            }
        }

        //ansArray of length ans;
        int ansArray[] = new int[ans];
        int j = start;
        for(int k = 0; k<ans;k++)
        {
            ansArray[k] = A[j];
            j++;
        }
        return ansArray;
    }
}
