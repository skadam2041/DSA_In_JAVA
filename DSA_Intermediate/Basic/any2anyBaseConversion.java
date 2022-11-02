//Problem Description
//        You are given a number A. You are also given a base B. A is a number on base B.
//        You are required to convert the number A into its corresponding value in decimal number system.
//The decimal 8 in base 3 is 22.
public class any2anyBaseConversion {
    public static void main(String[] args) {
        int A= 22;
        int B = 3;
        System.out.println(convertNum(A,B));
    }
    public static int convertNum(int A, int B) {
        int ans = 0;
        int power = 1;
        while(A>0)
        {
            int i = A%10;
            ans = ans+(power*i);
            A=A/10;
            power = power*B;
        }
        return ans;
    }
}
