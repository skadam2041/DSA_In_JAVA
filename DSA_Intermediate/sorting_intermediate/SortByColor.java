//Problem Description
//        Given an array with N objects colored red, white, or blue, sort them so that objects of the same color
//        are adjacent, with the colors in the order red, white, and blue.
//
//        We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.
//
//        Note: Using the library sort function is not allowed.


// optimal // O(n)

// ---------------------
// crate a new Arrays of length 3
// travel on array and count 0,1 and 2
// save count in count array
// replace 0,1,2, occording to count in array
//-----------------------------
public class SortByColor {
    public static void main(String[] args) {
        int A[] = {0,1 ,2, 0, 1, 2};
        A = sortColors(A);
        for (int i = 0; i <A.length ; i++) {
            System.out.print(A[i]+" ");
        }

    }
    public static  int[] sortColors(int[] A) {
        //normal sort
        // Arrays.sort(A);
        // return A;

        //gives TLE for hard // bubble sort
        // int n = A.length;
        // for(int i = 0; i<n-1;i++ ) //bubble sort
        // {
        //     for(int j = 0; j < n-i-1;j++) //will go till n- i -1 element
        //     {
        //         if((A[j]>A[j+1])) // && A[j]>A[j+1]) //if next element is smaller do the swap with previous bigger ele
        //         {
        //             int temp = A[j];
        //             A[j] = A[j+1];
        //             A[j+1] = temp;
        //         }
        //     }
        // }
        // return A;

        // optimal //

        // ---------------------
        // crate a new Arrays of length 3
        // travel on array and count 0,1 and 2
        // save count in count array
        // replace 0,1,2, occording to count in array
        //-----------------------------
        if(A.length == 1)
        {
            return A;
        }
        int count[] = new int[3];
        for(int i = 0; i<A.length;i++)
        {
            if(A[i] == 0)
            {
                count[0]++;
            }
            else if(A[i] == 1)
            {
                count[1]++;
            }
            else
            {
                count[2]++;
            }
        }
        int ans[] = new int[A.length];
        int k = 0;
        for(int i = 0; i<3;i++)
        {
            int j = count[i];
            while(j>0)
            {
                ans[k] = i;
                k++;
                j--;
            }
        }
        return ans;
    }
}
