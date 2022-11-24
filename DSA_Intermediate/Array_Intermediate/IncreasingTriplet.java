//Problem Description
//        You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]
public class IncreasingTriplet {
    public static void main(String[] args) {
        int A[] = {1, 2, 4, 3};
        System.out.println(FindTriplet(A));
    }
    public static int FindTriplet(int[] A) {
        int ans = 0;
        for(int j = 1; j<A.length;j++)
        {
            int leftsmall = 0;
            int rightlarge = 0;
            //find count of elements smaller than A[j] before it on left side
            for(int i = 0; i<j; i++)
            {
                if(A[i]<A[j])
                {
                    leftsmall++;
                }
            }
            //find count of elements greater than A[j] after it on right side
            for(int k = j+1; k<A.length; k++)
            {
                if(A[k]>A[j])
                {
                    rightlarge++;
                }
            }
            ans = ans + (leftsmall * rightlarge);
        }
        return ans;

    }
}
