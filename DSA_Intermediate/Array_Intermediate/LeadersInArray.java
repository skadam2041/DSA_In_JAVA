//Problem Description
//
//        Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
//
//        An element is a leader if it is strictly greater than all the elements to its right side.
//
//        NOTE:The rightmost element is always a leader.

// logic //
//first logic is just travers from right to left and find how many times max has changed or incremented ..sore that in array
//initialy max is rightmost element
public class LeadersInArray {
    public static void main(String[] args) {
        int A[] = {16, 17, 4, 3, 5, 2};
        int ans[] = findLeader(A);
        for(int i = 0; i< ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] findLeader(int[] A) {
        int n = A.length;
        //first count how many times max changes or gets upated to max value
        int count = 1;
        int max = A[n-1]; //max is rightmost element
        int j = 0;
        for(int i = n-1 ; i>=1 ; i--)
        {
            if(max < A[i-1])
            {
                count++;
                max = A[i-1];
            }
        }
        max  = A[n-1];
        int ans[] = new int[count]; //arraysize of count
        ans[0] = A[n-1];  //0th element will be rightmost element
        j = 1; //index start from 1 as 0th element will be rightmost element
        for(int i = n-1 ; i>=1 ; i--)
        {
            if(max < A[i-1])
            {
                max = A[i-1];
                ans[j] = max; //assign max value to index
                j++; // index is inceremented
            }
        }
        return ans;
    }
}
