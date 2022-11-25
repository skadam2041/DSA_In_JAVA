//Problem Description
//        Given two integers A and B. Find the minimum value (A ⊕ X) + (B ⊕ X) that can be achieved for any X.
//
//        where P ⊕ Q is the bitwise XOR operation of the two numbers P and Q.


public class MinXORsum {
    public static void main(String[] args) {
        int A = 6;
        int B = 12;
        System.out.println(findMinXor(A,B));
    }
    public static int findMinXor(int A, int B) {
        // return A^B;
        int min = Integer.MAX_VALUE;

        if(A==B)
        {
            return 0;
        }
        int i = Math.min(A,B); //find min element assign it to i

        int val = (i^A)+(i^B);

        return val;
    }
}
