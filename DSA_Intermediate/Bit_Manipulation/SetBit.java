//Problem Description
//        You are given two integers A and B.
//        Set the A-th bit and B-th bit in 0, and return output in decimal.

///to set any bit use formula >> : num | (1<<position of setting)

public class SetBit {
    public static void main(String[] args) {
         int A = 3;
         int B = 5;
        System.out.println(SetTheBit(A,B));
    }

    public static int SetTheBit(int A, int B) {
        int n = 0;
        n = n | (1 << A);
        n = n | (1 << B);
        return n;
    }
}
