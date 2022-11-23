//N/3 Repeat Number
//        Problem Description
//        You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
//        If so, return the integer. If not, return -1.
//
//        If there are multiple solutions, return any one.

public class N_3RepeatNumber {
    public static void main(String[] args) {
        int A[] = {1,2,3,3,4,4,3,5};
        System.out.println(FindrepeatedNumber(A));
    }
    public static int FindrepeatedNumber(int[] A) {
        //2 possible majority ele with freq 0
        int ele1 = -1;
        int freq1 = 0;
        int ele2 = -1;
        int freq2 = 0;

        //Minimum occurence required
        int occRequired = A.length / 3;
        // {1,2,3,4,4,4,4,3,5,5} for dry run
        //Find out the elements with max occurences//moore voting algo
        for(int i = 0; i<A.length; i++){
            //check if number is not equal to ele2 anf freq of 1 is 0
            if(freq1 == 0 && ele2 != A[i]){
                ele1 = A[i];
                freq1++;
            }
            //if element = ele1
            else if(ele1 == A[i]){
                freq1++;
            }
            //check if number is not equal to ele1 anf freq of 2 is 0
            else if(freq2 == 0 && ele1 != A[i]){
                ele2 = A[i];
                freq2++;
            }
            //if element = ele2
            else if(ele2 == A[i]){
                freq2++;
            }else{
                freq1--;
                freq2--;
            }
        }

        int occurence1 = 0;
        int occurence2 = 0;

        //Find out the occurences of the elements found above
        for(int i=0; i<A.length; i++){
            if(ele1 == A[i]){
                occurence1++;
            }else if(ele2 == A[i]){
                occurence2++;
            }
        }

        //return the element with max occurence
        if(occurence1 > occRequired){
            return ele1;
        }else if(occurence2 > occRequired){
            return ele2;
        }else{
            return -1;
        }
    }
}
