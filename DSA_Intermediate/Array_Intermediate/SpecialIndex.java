//Problem Description
//        Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element
//        from these indices makes the sum of even-indexed and odd-indexed array elements equal.
public class SpecialIndex {
    public static void main(String[] args) {
        int A[] = {2,1,6,4};
        System.out.println(findSpecialIndex(A));

    }
    public static int findSpecialIndex(int[] A) {
        //create prefix even sum arry
        int n = A.length;
        int prefixEvenSumArray[] = new int[A.length];
        int Evensum = A[0];
        prefixEvenSumArray[0] = Evensum;
        for( int i = 1; i<n; i++)
        {
            if(i%2 ==0)
            {
                Evensum = Evensum+A[i];
                prefixEvenSumArray[i] = Evensum;
            }
            else
            {
                prefixEvenSumArray[i] = Evensum;
            }
        }

        //create prefix odd sum arry
        int prefixOddSumArray[] = new int[A.length];
        int Oddsum =0;
        prefixOddSumArray[0] = Oddsum;
        for( int i = 1; i<n; i++)
        {
            if(i%2 != 0)
            {
                Oddsum = Oddsum+A[i];
                prefixOddSumArray[i] = Oddsum;
            }
            else
            {
                prefixOddSumArray[i] = Oddsum;
            }
        }

        //after deleting the i index element....then index of elements after i will be changed
        //odd index will become even and even becomes odd
        int count = 0;
        if(  (prefixEvenSumArray[n-1]-prefixEvenSumArray[0]) == (prefixOddSumArray[n-1]-prefixOddSumArray[0])    )
        {
            count++;
        }
        for(int i = 1; i<n; i++)
        {
            int evenSum = prefixEvenSumArray[i-1] + prefixOddSumArray[n-1]-prefixOddSumArray[i];
            int oddSum = prefixOddSumArray[i-1] + prefixEvenSumArray[n-1] - prefixEvenSumArray[i];
            if(evenSum == oddSum)
            {
                count++;
            }
        }
        return count;
    }
}
