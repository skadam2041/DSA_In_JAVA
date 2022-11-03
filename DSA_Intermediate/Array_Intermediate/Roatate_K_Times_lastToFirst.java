//Problem Description
//        Given an integer array A of size N and an integer B, you have to return the same array after
//        rotating it B times towards the right.
//        Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]


//logic: 1) reverser entire array
//        1, 2, 3, 4, 7 , 8
//        ^  ^  ^  ^  ^   ^
//        8  7  4  3  2   1
//       2) reverse first K elements
//         7 8 4 3 2 1
//       3) reverse remaining elements
//         7 8 1 2 3 4

public class Roatate_K_Times_lastToFirst {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 7 , 8};
        int B = 2;
        rotate_K_times(A,B);
        for(int i = 0; i< A.length; i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static  int[] rotate_K_times(int[] A, int B) {
        if(B>A.length)
        {
            B = B%A.length;
        }
        int n = A.length;
        reverse(A,0,n-1);
        reverse(A,0,B-1);
        reverse(A,B,n-1);
        return A;
    }
    public static int[] reverse(int A[],int i,int j)
    {
        while(i<j)
        {
            int temp = A[i];
            A[i]= A[j];
            A[j]= temp;
            i++;
            j--;
        }
        return A;
    }
}
