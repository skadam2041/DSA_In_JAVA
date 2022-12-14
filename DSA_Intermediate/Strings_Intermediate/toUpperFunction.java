//Problem Description
//        You are given a function to_upper() consisting of a character array A.
//
//        Convert each charater of A into Uppercase character if it exists. If the Uppercase of a character
//        does not exist, it remains unmodified.
//        The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.
//
//        Return the uppercase version of the given character array.


public class toUpperFunction {
    public static void main(String[] args) {
        char A[] = {'s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'D', 'e', 'm', 'y'};
        A = to_upper(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
        public static  char[] to_upper(char[] A) {
            for(int i = 0; i<A.length; i++)
            {
                if(A[i]<='z' && A[i]>='a')
                {
                    A[i] = (char)(A[i] - 32);
                }
            }
            return A;
        }
}
