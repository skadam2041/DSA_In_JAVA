//Problem Description
//        Say you have an array, A, for which the ith element is the price of a given stock on day i.
//        If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//        Return the maximum possible profit.
//A = [1, 4, 5, 2, 4]
//        Buy the stock on day 0, and sell it on day 2.


//check comments
public class BuySellStocks1 {
    public static void main(String[] args) {
        int A[] = {1, 4, 5, 2, 4};
        System.out.println(maxProfit(A));
    }
    public static int maxProfit(final int[] A) {
        int n = A.length;
        if(n == 0) //edge case handled
        {
            return 0;
        }
        //create suffixMax array
        int suffixMax[] = new int[n];
        suffixMax[n-1] = A[n-1]; //last element will be same
        for(int i = n-2;i>=0;i--) //gp from 2nd last to 0th index
        {
            if( A[i]  >  suffixMax[i+1]) //check if A[i] is greater than next suffixMax element //
            {
                suffixMax[i] = A[i]; //if it is greater than  next suffixMax ele then assign it to suffixmax of index
            }
            else {
                suffixMax[i] = suffixMax[i+1]; ///else carry it to previos suffixMax ele assign there
            }
        }
        int maxProfit = 0; //At ist profit is zero
        for(int i = 0; i<n-1; i++) // go from 1st to 2nd last element
        {
            int profit =  suffixMax[i+1] - A[i]; //find diff
            if(maxProfit < profit) // check if profit is greater than previos max profit
            {
                maxProfit = profit; //if true the assign profit to maxProfit
            }
        }
        return maxProfit;     //return the final maxProfit
    }
}
