public class toggleCase {
    public static void main(String[] args) {
        String s = "ThIsIsAsTrInG ";
        System.out.println(changeCase(s));

    }
    public static String changeCase(String A) {
        char ch[] = A.toCharArray();
        for(int i = 0; i<ch.length; i++)
        {
            ch[i] = (char)(ch[i]^32);
        }
//         A = String.copyValueOf(ch);
//         return A;
        return new String(ch);
    }

}
