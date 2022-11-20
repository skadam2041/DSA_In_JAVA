//Problem Description
//        Given an array of size N, find the subarray of size K with the least average.

public class leastAvgSubArray {
    public static void main(String[] args) {
        int A[] = {1,33,5,6,66,77,8,99,5,4,22};
        int B = 3;
        System.out.println(findMinAvg(A,B));
    }
    public static  int findMinAvg(int[] A, int B){
        //if sum is minimum then avg also minimum so no need to find avg //
        float avg = 0;//because of division
        float sum = 0; // no typecasting required if take float
        for(int i = 0; i<B; i++)
        {
            sum = sum+A[i];
        }
        avg = sum/B;
        //take 2 pointers//
        int i = 1;
        int j = B;
        int index = 0;
        while(j<A.length) // j will go till array length
        {
            sum = sum - A[i-1] + A[j]; //find sum
            if(avg > (sum/B)) //compare for least avg
            {
                avg = sum/B;
                index = i; //assign index = i
            }
            i++; //increase i and  j//window will slide by 1 index;
            j++;
        }
        return index;
    }
}
