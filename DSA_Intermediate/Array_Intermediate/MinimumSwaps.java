    //Problem Description
    //
    //        Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
    //
    //        Note: It is possible to swap any two elements, not necessarily consecutive.
    //        A = [1, 12, 10, 3, 14, 10, 5]
    //        After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
    //        After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
    //        Now, all elements less than or equal to 8 are together.
public class MinimumSwaps {
        public static void main(String[] args) {
            int A[]= {1, 12, 10, 3, 14, 10, 5};
            int B = 8;
            System.out.println(countSwaps(A,B));
        }
        public static int countSwaps(int[] A, int B) {
            //find window length = number of elements  less than or equal to B
            int window = 0;
            for(int i = 0; i<A.length; i++)
            {
                if(A[i] <= B)
                {
                    window++;
                }
            }
            //find elements less than or equal to B for starting window from 0th index
            int count = 0;
            for(int i = 0; i<window; i++)
            {
                if(A[i] <= B)
                {
                    count++; //will get total suitable elements(elements less than or equal to B) in 1st window
                }
            }
            //ans will be remaining elements excepts  elements less than or equal to B
            int ans = window-count;
            //take 2  pointers
            int i = 1;
            int j = window;
            while(j<A.length) ///till j less than A.length
            {
                if(A[i-1]<= B) //if i-1 is suitable elements then decrease the count as it will be not available in current window
                {
                    count--;
                }
                if(A[j]<= B)//if j is suitable elements then increase the count as it will be available in current win
                {
                    count++;
                }
                if(ans>(window-count)) //find min ans by comparing
                {
                    ans = window-count;
                }
                i++; // increase i and j for next window
                j++;
            }
            return ans;
        }
}
