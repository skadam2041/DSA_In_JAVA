//Problem Description
//        You have given a string A having Uppercase English letters.
//        You have to find how many times subsequence "AG" is there in the given string.
//        NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
//
//        Explanation 1:
//        Subsequence "AG" is 3 times in given string


//====logic=====//
//start couting "G" from last and when "A" appears add counts to A carry the count til last "A" element
//for example "CAGASGSGA"   when we start from right Gs count is 0 so adding in As count do nothing then
//         we can find 2 counts of G so add in As count the we get
//        3rd count of "G" add it to counts of A earlier 2+1 = 3 total 3 counts


public class SpecialSequences {
    public static void main(String[] args) {
        String A = "ABCGAG";
        System.out.println(countSequence(A));
    }
    public static int countSequence(String A) {
        long count  = 0;
        long countG = 0;
        for(int i = A.length()-1; i>=0; i--)
        {
            if(A.charAt(i) == 'A')
            {
                count = count + countG;
            }
            else if(A.charAt(i) == 'G') //count  G  and add it to count when 'A' founds
            {
                countG++;
            }
        }
        int ans = (int)(count%1000000007);
        return ans;
    }
}
