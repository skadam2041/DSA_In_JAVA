//Problem Description
//        Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
//        Check if any good pair exist or not.

//logic: traverse array and compare i with j = i+1
public class GoodPair {
    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        int B = 7;
        System.out.println(isGoodPair(A,B));
    }
    public static int isGoodPair(int[] A, int B) {
        for(int i = 0; i<A.length-1; i++)
        {
            for(int j = i+1; j< A.length;j++)
            // we dont need to compare the previous element of  index  j as it will get  checked with
            //all iterations
            {
                if( (A[i]+A[j]) == B)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}
