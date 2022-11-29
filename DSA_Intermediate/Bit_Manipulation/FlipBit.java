//Problem Description
//        You are given two integers A and B.
//        If B-th bit in A is set, make it unset
//        If B-th bit in A is unset, make it set
//        Return the updated A value
//use xor operation num = num^(1<<position for flipping);

public class FlipBit {
    public static void main(String[] args) {
            int A = 34;
            int B= 3;
        System.out.println(FlipTheBit(A,B));
    }
    public static int FlipTheBit(int A, int B) {
        A = A^(1<<B);
        return A;
    }

}
