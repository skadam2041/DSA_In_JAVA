//Problem Description
//        You are given a function to_lower() which takes a character array A as an argument.
//
//        Convert each character of A into lowercase characters if it exists. If the lowercase of a character
//        does not exist, it remains unmodified.
//        The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
//
//        Return the lowercase version of the given character array.


public class toLowerFunction {
    public static void main(String[] args) {
        char A[] = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        A = to_lower(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
    public static char[] to_lower(char[] A) {
        for(int i = 0; i<A.length; i++)
        {
            if(A[i]<='Z' && A[i]>='A')
            {
                A[i] = (char)(A[i] + 32);
            }
        }
        return A;
    }
}
