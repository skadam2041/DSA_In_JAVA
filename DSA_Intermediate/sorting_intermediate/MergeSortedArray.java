//Merge Sorted Array
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
//
//        and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//        Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
//        representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//        To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
//        and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//        The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//        To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
//        and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

//logic : create array of size m+n
//:check elements in A in smaller than B then put it in new array increase i++
//:if not add elements from B in new arr and j++;
// in this one array will added to new array
// after that remaining elements from array copy as it is
// then copy new array to A[]
public class MergeSortedArray {
    public static void main(String[] args) {
        int A[] = {1, 3, 5, 7,9, 11, 0 , 0 , 0 , 0, 0, 0};
        int B[] = {2, 4, 6, 8,10, 12};
        int m = 6;
        int n = 6;
        int ans[] = new int[m+n];
        ans = merge(A,m,B,n);
        for (int i = 0; i < (m+n); i++) {
            System.out.print(ans[i]+" ");
        }

    }

    public static int[] merge(int[] A, int m, int[] B, int n) {
        int arr[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j<n)
        {
            if(A[i]<B[j])
            {
                arr[k] = A[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = B[j];
                k++;
                j++;
            }
        }
        while(i<m)
        {
            arr[k] = A[i];
            k++;
            i++;
        }
        while(j<n)
        {
            arr[k] = B[j];
            k++;
            j++;
        }
        for(int x = 0; x<arr.length; x++)
        {
            A[x] = arr[x];
        }
        return A;

    }
}
