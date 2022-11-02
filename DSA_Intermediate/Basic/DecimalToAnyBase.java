public class DecimalToAnyBase {
    public static void main(String[] args) {
        int A = 4;
        int B = 3;
        System.out.println(ConvertDecimalToAnyBase(A,B));
    }
    public static int ConvertDecimalToAnyBase(int A, int B) {
        int ans = 0;
        int rem = 0;
        int dec = 1;
        while (A > 0) {
            rem = A % B;
            ans = ans + rem * dec;
            dec = dec * 10;
            A = A / B;
        }
        return ans;
    }
}
