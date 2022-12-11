//Problem Description
//        Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit
//        of every number.
//
//        If a number has no tens digit, we can assume value to be 0.
//        If 2 numbers have same tens digit, in that case number with max value will come first
//        Solution should be based on comparator.
//Input 1:
//        A = [15, 11, 7, 19]
// Output 1:
//        [7, 19, 15, 11]

//------------by overriding comparatot------------


import java.util.*;

public class TensDigitSorting {
    public static void main(String[] args) {
        Integer A [] = {15, 11, 7, 19};
        sorting(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }

    }
    public static  Integer[] sorting(Integer[] A) {
        Arrays.sort(A, new Comparator<Integer> (){
            @Override
            public int compare(Integer val1, Integer val2) {
                Integer tens_digit1 = (val1 / 10 ) % 10;
                Integer tens_digit2 = (val2 / 10 ) % 10;
                if (tens_digit1 == tens_digit2){
                    return val2 - val1;
                }
                return tens_digit1 - tens_digit2;
            }
        });
        return A;
    }
}
