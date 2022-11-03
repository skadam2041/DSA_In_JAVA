//Problem Description
//        Given an array A of N integers. Also given are two integers B and C.
//        Reverse the array A in the given range [B, C]
//
//logic:take two pointer which will start from leftside to right and rightside to left
//      : swap those i and jth element and one increment and one decrement

public class ReverseInRange {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 7 , 8};
        int B = 2;
        int C = 5;
        reverse(A,B,C);
        for(int i = 0; i< A.length; i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static int[] reverse(int[] A, int start, int end) {
        //take two pointer which will start from leftside to right and rightside to left
        int i =start;
        int j =end;
        while(i<j)
        {
            //swaping
            int temp = A[i];
            A[i]= A[j];
            A[j]= temp;
            i++;
            j--;
        }
        return A;
    }
}
