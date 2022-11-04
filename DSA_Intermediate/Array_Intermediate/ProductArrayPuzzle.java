//Given an array of integers A, find and return the product array of the same size
// where the ith element of the product array will be equal to the product of all the elements divided by the ith
// element of the array.
//
//        Note: It is always possible to form the product array with integer
//        (32 bit) values. Solve it without using the division operator.

//logic//
//create prefixproduct and suffixproduct array
//suffixArray will have products of elements from end to ith index at i index of sfx array
//ans[i] = pref[i-1] * suf[i+1]; // neglate ith term and gives remaining product
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int ans[] = product(A);
        for(int i = 0; i< ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] product(int[] A) {
        // int ans[] = new int[A.length];
        // for(int i = 0; i<A.length;i++)
        // {
        //     int prod = 1;
        //     for(int j = 0; j<A.length;j++)
        //     {
        //         if(i == j)
        //         {
        //             continue;
        //         }
        //         else
        //         {
        //             prod = prod * A[j];
        //         }
        //     }
        //     ans[i] = prod;
        // }
        // return ans;


        // prefix array
        int pref[] = new int[A.length];
        int prod = 1;
        for(int i = 0; i<A.length;i++)
        {
            prod = prod*A[i];
            pref[i] = prod;
        }

        //   suffix array
        int suf[] = new int[A.length];
        prod = 1;
        for(int i = A.length-1; i>=0;i--)
        {
            prod = prod*A[i];
            suf[i] = prod;
        }
        //ans array
        int ans[] = new int[A.length];
        ans[0] = suf[1]; //for start index
        ans[A.length-1] = pref[A.length-2]; //for end index;
        for(int i = 1; i<A.length-1;i++)
        {
            if(i>0 && i<A.length)
            {
                ans[i] = pref[i-1] * suf[i+1];
            }
        }
        return ans;

    }
}
