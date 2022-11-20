//Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
//        Find and return the length of the longest consecutive 1’s that can be achieved.
public class longestConsecutiveOnes {
    public static void main(String[] args) {
        String A = "111110001110111110111111011";
        System.out.println(FindMaxOnesLength(A));
    }
    public static int FindMaxOnesLength(String A) {
        //Approach 1
        //find total counts of 1;
        int countOf1 = 0;
        for(int i = 0 ; i < A.length();i++)
        {
            if(A.charAt(i) == '1')
            {
                countOf1++;
            }
        }
        //create suffix count array // count number of 1s til zero from last index and
        //make count = 0 when 0 comes and
        //again start counting till index 0
        int sufCount = 0;
        int suffixCountArray[] = new int[A.length()];
        for(int i = A.length()-1 ; i >=0;i--)
        {
            if(A.charAt(i) == '1')
            {
                sufCount++;
            }
            else
            {
                sufCount = 0;
            }
            suffixCountArray[i] =sufCount;
        }
        //create prefix count array // count number of 1s til zero from 0th index and
        //make count = 0 when 0 comes and
        //again start counting till last index
        int prefCount = 0;
        int prefixCountArray[] = new int[A.length()];
        for(int i = 0 ; i < A.length();i++)
        {
            if(A.charAt(i) == '1')
            {
                prefCount++;
            }
            else
            {
                prefCount = 0;
            }
            prefixCountArray[i] = prefCount;
        }
        //at firrst Ans
        int ans = -1;
        //for edge elements // 0th and last//
        if(A.charAt(0)=='0')
        {
            //only consider suffixCountArray as nothing present before oth index
            if(countOf1==(suffixCountArray[1]))
            {
                if(ans < suffixCountArray[1]) //compare
                {
                    ans = suffixCountArray[1];
                }
            }
            else
            {
                if(ans < 1+suffixCountArray[1]) //compare
                {
                    ans = 1+suffixCountArray[1];
                }
            }
        }
        if(A.charAt(A.length()-1)=='0')
        {
            //only consider prefixCountArray as nothing present after last index
            if(countOf1==(prefixCountArray[A.length()-2]))
            {
                if(ans < prefixCountArray[A.length()-2])
                {
                    ans = prefixCountArray[A.length()-2];
                }
            }
            else
            {
                if(ans < 1+prefixCountArray[A.length()-1])
                {
                    ans = 1+prefixCountArray[A.length()-1];
                }
            }
        }
        //check elements between 0th and last
        for(int i = 1; i<A.length()-1;i++)
        {
            if(A.charAt(i)=='0')
            {
                //sum of prefixCountArray[i-1] + suffixCountArray[i+1] +1 // +1 for 0 swaped with
                // +nothing if nothing present to swap
                if(countOf1==(prefixCountArray[i-1]+suffixCountArray[i+1]))
                {
                    if(ans < prefixCountArray[i-1]+suffixCountArray[i+1])
                    {
                        ans = prefixCountArray[i-1]+suffixCountArray[i+1];
                    }
                }
                else
                {
                    if(ans < prefixCountArray[i-1]+suffixCountArray[i+1]+1)
                    {
                        ans = prefixCountArray[i-1]+suffixCountArray[i+1]+1;
                    }
                }
            }
        }
        //if all are one then max size is A.length
        if(ans==-1)
        {
            return A.length();
        }
        //else ans
        else
        {
            return ans;
        }


        //Approach2
        // int countOf1 = 0;
        // for(int i = 0 ; i < A.length();i++)
        // {
        //     if(A.charAt(i) == '1')
        //     {
        //         countOf1++;
        //     }
        // }
        // int sufCount = 0;
        // int suffixCountArray[] = new int[A.length()];
        // for(int i = A.length()-1 ; i >=0;i--)
        // {
        //     if(A.charAt(i) == '1')
        //     {
        //         sufCount++;
        //     }
        //     else
        //     {
        //         sufCount = 0;
        //     }
        //     suffixCountArray[i] =sufCount;
        // }
        // int prefCount = 0;
        // int prefixCountArray[] = new int[A.length()];
        // for(int i = 0 ; i < A.length();i++)
        // {
        //     if(A.charAt(i) == '1')
        //     {
        //         prefCount++;
        //     }
        //     else
        //     {
        //         prefCount = 0;
        //     }
        //     prefixCountArray[i] = prefCount;
        // }
        // int ans = -1;
        // if(A.charAt(0)=='0')
        // {

        //         if(ans < suffixCountArray[1]+1)
        //         {
        //             ans = suffixCountArray[1];
        //         }


        // }
        // if(A.charAt(A.length()-1)=='0')
        // {
        //        if(ans < prefixCountArray[A.length()-2]+1)
        //         {
        //             ans = prefixCountArray[A.length()-2]+1;
        //         }


        // }
        // for(int i = 1; i<A.length()-1;i++)
        // {
        //     if(A.charAt(i)=='0')
        //     {
        //         if(ans < prefixCountArray[i-1]+suffixCountArray[i+1]+1)
        //         {
        //             ans = prefixCountArray[i-1]+suffixCountArray[i+1]+1;
        //         }
        //     }
        // }
        // if(ans==-1)
        // {
        //     return countOf1;
        // }
        // else if(ans>countOf1)
        // {
        //     return ans-1;
        // }
        // else
        // {
        //     return ans;
        // }

    }
}
