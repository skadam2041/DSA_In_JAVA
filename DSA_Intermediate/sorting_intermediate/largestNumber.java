//Problem Description
//        Given an array A of non-negative integers, arrange them such that they form the largest number.
//
//        Note: The result may be very large, so you need to return a string instead of an integer.
//
//Explanation 1:
//        int A[] = {3, 30, 34, 5, 9};
//        Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
// sort by overriding comparator


import java.util.*;

public class largestNumber {
    public static void main(String[] args) {
        int A[] = {3, 30, 34, 5, 9};
        System.out.println(largestNum(A));

    }
    public static String largestNum(final int[] A) {
        int n = A.length;
        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = A[i];
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String s1 = "" + a + b;  //concate a an b
                String s2 = "" + b + a;  //concat b and a
                if (Long.parseLong(s1) > Long.parseLong(s2)) { //check which number is more..if first the n do swap and move it to last
                    return 1;
                } else return -1;
            }
        });
        //creating new String builder
        StringBuilder ans = new StringBuilder();
        if (a[0] == 0) return "0"; // for case - [ 0, 0, 0, 0, 0 ]
        for (int i = n - 1; i >= 0; i--) {
            ans.append(a[i]); //appending elements from end of array to start of string
        }
        return ans.toString(); //converting into string
    }
}
