//Problem Description
//        Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
//
//        and at least one occurrence of the minimum value of the array.

//logic is in commments ///carry forwarding/backwarding min and max indexes and find length at each found instance
public class closestMinMax {
    public static void main(String[] args) {
        int A[] = {16, 17, 4, 3, 5, 2};
        System.out.println(findMinLength(A));
    }
    public static int findMinLength(int[] A) {
        int max = A[0];
        int min = A[0];
        for(int i = 0; i<A.length;i++) //find max and min
        {
            if(max <A[i])
            {
                max = A[i];
            }
            if(min > A[i])
            {
                min = A[i];
            }
        }
        if(max == min) //corner case
        {
            return 1;
        }
        int mini = -1; // set index of min element
        int maxi = -1; // set index of max element
        int anslen = A.length; // max length can be A.length
        for(int i = A.length -1; i>0;i--) //from n to 0
        {
            if(A[i] == min) // check index for min element
            {
                mini = i; //assign to varible
                if(maxi!= -1) //check condition after knowing max index
                {
                    anslen = findMin(anslen,maxi-mini+1);
                    //runs function compares  and return minimum from anslen and min max indices
                    // assign the new returned asnlen to anslen
                }
            }
            else if(A[i] == max) // check index for min element
            {
                maxi = i; //assign to varible
                if(mini != -1)  //check condition only after knowing min index
                {
                    anslen = findMin(anslen, mini-maxi+1);
                }
            }
        }
        return anslen;
    }
    public static int findMin(int anslen, int diff)
    {
        if(anslen > diff)
        {
            anslen = diff;
        }
        return anslen;
    }
}
