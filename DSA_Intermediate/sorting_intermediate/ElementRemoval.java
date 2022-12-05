//Problem Description
//        Given an integer array A of size N. You can remove any element from the array in one operation.
//        The cost of this operation is the sum of all elements in the array present before this operation.
//
//        Find the minimum cost to remove all elements from the array.

//logic :- remove maximum element first its contribution in next iteration will decreases.
//i.e remove elements in decreasing order

import java.util.*;

public class ElementRemoval {
    public static void main(String[] args) {
        int A[] = {2, 1, 5, 3,4, 8};
        System.out.println(calculateCost(A));
    }
    public static int calculateCost(int[] A) {
        Arrays.sort(A);
        int cost = 0;
        int j = 1;
        for(int i = A.length-1; i>=0; i--)
        {
            cost = cost  + (A[i]*j);
            j++;
        }
        return cost;
    }
}
