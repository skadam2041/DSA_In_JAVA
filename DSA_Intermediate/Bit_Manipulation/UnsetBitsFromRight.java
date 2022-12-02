//Problem Description
//        Given an integer A. Unset B bits from the right of A in binary.
//        For eg:-
//        A = 93, B = 4
//        A in binary = 1011101
//        A should become = 1010000 = 80. Therefore return 80.
public class UnsetBitsFromRight {
    public static void main(String[] args) {
        long A = 58593;
        int B = 6;
        System.out.println(UnsetBits(A,B));
    }
    public static long UnsetBits(long A, int B) {
        B--;
        while(B>=0)
        {
            if((A&(1<<B))!= 0)
            {
                A = A^(1<<B);
            }
            B--;
        }
        return A;
    }
}
