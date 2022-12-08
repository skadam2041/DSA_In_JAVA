//Problem Description
//        You are given an array A of N elements. Sort the given array in increasing order of number
//        of distinct factors of each element, i.e., element having the least number of factors should be the first
//        to be displayed and the number having highest number of factors should be the last one.
//        If 2 elements have same number of factors, then number with less value should come first.
//
//        Note: You cannot use any extra space

//--------------using bubble sorting----change comparator --- TC - N^2
import java.util.Arrays;

public class factorSort {
    public static void main(String[] args) {
        int A[] = {24,54,2,34,33,12,3,7,6};
        sorting(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }

    public static int[] sorting(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        for (int i = 0; i < n - 1; i++) //bubble sort
        {
            for (int j = 0; j < n - i - 1; j++) //will go till n- i -1 element
            {
                if (comparator(A[j], A[j + 1]) == 1)// && A[j]>A[j+1]) //if next element is smaller do the swap with previous bigger ele
                {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }

    public static int comparator(int a, int b) //comparator function
    {
        int i = factorsCount(a);
        int j = factorsCount(b);
        if (i > j) return 1;
        return 0;

    }

    public static int factorsCount(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) // untill i is greater than squareroot of A
        {
            if (num % i == 0) {
                if (i != (num / i)) {
                    count = count + 2; // i and A/i will be factors
                } else {
                    count = count + 1; // in case of perfect square
                }
            }
        }
        return count;

    }
}
