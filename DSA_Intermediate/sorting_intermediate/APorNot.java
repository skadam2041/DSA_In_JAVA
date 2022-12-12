import java.util.*;

//Problem Description
//        Given an integer array A of size N. Return 1 if the array can be arranged to form an
//        arithmetic progression, otherwise return 0.
//
//        A sequence of numbers is called an arithmetic progression if the difference between any two consecutive
//        elements is the same.

//-----------logic ------//

//sort the array
//check difference between adjacent is same or not

public class APorNot {
    public static void main(String[] args) {
        int A [] ={3, 5, 1,7,9};
        System.out.println(checkAP(A));
        int B [] ={2, 5, 1,7,9};
        System.out.println(checkAP(B));

    }
    public static int checkAP(int[] A) {
        Arrays.sort(A);
        int diff = A[1]-A[0];
        for(int i = 0; i<A.length-1;i++)
        {
            if(A[i+1]-A[i] != diff)
            {
                return 0;
            }
        }
        return 1;

    }
}
