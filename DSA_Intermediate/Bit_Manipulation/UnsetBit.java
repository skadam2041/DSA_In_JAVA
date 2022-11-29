//Problem Description
//        You are given two integers A and B.
//        If B-th bit in A is set, make it unset
//        If B-th bit in A is unset, leave it as it is
//        Return the updated A value

////////logic >>>--- Use formula num^(1<<position of Unsetting bit) .. >>this formula flips th bits 1 to 0 ans 0 to 1
//change only when bit is 1

public class UnsetBit {
    public static void main(String[] args) {
        int A = 26;
        int B = 3;
        System.out.println(UnsetTheBit(A,B));
    }
    public static int UnsetTheBit(int A, int B) {
        if((A&(1<<B))== 0) // bit is 0 no need to set
        {
            return A;
        }
        else
        {
            return (A^(1<<B)); //else bit is 1 so  unset it
        }

    }
}
