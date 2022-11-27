//problem Description
//        You are given two integers A and B.
//        Return 1 if B-th bit in A is set
//        Return 0 if B-th bit in A is unset

//A&(1<<B) is used to check bit if o then 0 is greater than 0 than 1

public class CheckBit {
    public static void main(String[] args) {
        int num = 45;
        int index = 3;
        System.out.println(checkTheBit(num,index));
    }
    public static int checkTheBit(int A, int B) {
        if((A&(1<<B))  == 0)
        {
            return 0;
        }
        return 1;
    }
}
