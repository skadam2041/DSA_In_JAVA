//Problem Description
//        Given an array A of length N. Also given are integers B and C.
//
//        Return 1 if there exists a subarray with length B having sum C and 0 otherwise
public class WindowSubarraySum {
    public static void main(String[] args) {
        int []A = {4, 3, 2, 6};
        int B = 2;
        int C = 5;
        System.out.println(FindSum(A,B,C));
    }
    public static int FindSum(int[] A, int B, int C) {
        //find sum of 1st B element
        int sum = 0;
        for(int i = 0; i<B; i++)
        {
            sum =sum+A[i];
        }
        //check sum == c then return 1;
        if(sum == C)
        {
            return 1;
        }
        //take 2 pointer i and j;
        int i = 1;
        int j = B;
        //loop will go till j is less than A.length
        while(j<A.length)
        {
            sum = sum-A[i-1]+A[j]; //in sum minus previous element add jth element
            if(sum == C) //check sum ==c
            {
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
