//You are given a string S, and you have to find all the amazing substrings of S.
//
//        An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
//Input
//        ABEC
//
//        Output
//        6
//
//        Explanation
//        Amazing substrings of given string are :
//        1. A
//        2. AB
//        3. ABE
//        4. ABEC
//        5. E
//        6. EC
//        here number of substrings are 6 and 6 % 10003 = 6.

//logic//
//check vowel ..it can form substring with alll characters after if
//find count and add when another vowels count comes
public class AmazingSubstring {
    public static void main(String[] args) {
        String A = "ABEC";
        System.out.println(countSubString(A));
    }
    public static int countSubString(String A) {
        long TotalCount = 0;
        long StringSize = A.length();

        for(int i = 0; i<StringSize;i++)
        {
            //check at which index vowel is present
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' ||A.charAt(i) == 'i'||A.charAt(i) == 'o'||A.charAt(i) == 'u'
                    ||A.charAt(i) == 'A'||A.charAt(i) == 'E'||A.charAt(i) == 'I'||A.charAt(i) == 'O'||A.charAt(i) == 'U')
            {
                //count how many subarrays u can make from that index
                long subcount = (StringSize-i);
                //add it to total count
                TotalCount = TotalCount + subcount;
            }
        }
        return (int)(TotalCount%10003);
    }
}
