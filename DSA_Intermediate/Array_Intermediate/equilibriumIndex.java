//Problem Description
//        You are given an array A of integers of size N.
//
//        Your task is to find the equilibrium index of the given array
//
//        The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//
//        NOTE:
//
//        Array indexing starts from 0.
//        If there is no equilibrium index then return -1.
//        If there are more than one equilibrium indexes then return the minimum index.

//logic*************//
//create prefix sum array /
//left sum = pf[l];
//right sum = pf[right] - pf[left-1]
//compare left and right sum
//checl for 0th index



public class equilibriumIndex {
    public static void main(String[] args) {
        int A[] = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumIndex(A));
    }
    public static int findEquilibriumIndex(int[] A) {
        int n = A.length;
        int PF[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) { //create prefix array
            sum = sum + A[i];
            PF[i] = sum;
        }
        if ((PF[n - 1] - PF[0]) == 0) //edge case..sum of leftside element of 0th index is zero
        //sum of right side element is total sum - prefix sum till that index
        {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            int leftsum = PF[i - 1]; //left sum is prefix sum of elements on left side of index excluding ith index value
            int rightsum = PF[n - 1] - PF[i]; //right sum is sum of elements on right side of ith index excluding ith index value
            if (rightsum == leftsum) {
                return i;
            }
        }
        return -1;
    }
}
