//Problem Description
//        Given an array A of N integers. Count the number of elements that have at least 1 elements greater than itself.

//logic: only max element will not have element greater than itself others will have greater elements as max
//count answer = occurance of max - total length

public class countSpecificElement {
    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        System.out.println(countelement(A));
    }
    public static int countelement(int[] A) {
        int max = A[0];
        for(int i = 1; i<A.length; i++ ) //find max
        {
            if(max < A[i])
            {
                max = A[i];
            }
        }
        int count = 0;
        for(int i = 0; i<A.length ; i++) //count max occurances
        {
            if(A[i] == max)
            {
                count++;
            }
        }
        int ans = A.length-count;  //ans is numbers except max count
        return ans;
    }
}
