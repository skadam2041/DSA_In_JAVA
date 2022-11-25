//Problem Description
//        You have an array A with N elements. We have two types of operation available on this array :
//        We can split an element B into two elements, C and D, such that B = C + D.
//        We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
//        You have to determine whether it is possible to convert array A to size 1, containing a single element
//        equal to 0 after several splits and/or merge?

// Observation :-

// Even ^ Even = Even
// Odd ^ Odd = Even
// Even ^ Odd = Odd

// We can split any Even Number into 2 Equal Even numbers and there XOR will be Zero as both numbers are same.

// Eg. "24" can be splitted into 12 and 12 , 12^12 = 0

// 1. So we know for Even number in the array they are self sufficient to Split and make themself Zero.

// For Odd Numbers in an array it will be split into one even and one Odd Number.

// Eg. "23" can be splitted into 12 and 11.

// So if there are 2 Odd Numbers they will be splitted into 2 Even and 2 odd Number.

// As we know from condition 1 that we can ignore even numbers. So for 2 Odd Numbers it will splitted into 2 Even and 2 Odd. These 2 Odd Numbers can also be ignored as "Odd ^ Odd = Even"

// We just need to find if No. Of Odd numbers are Odd because rest all does not matter.

public class InterestingArray {
    public static void main(String[] args) {
        int A[] = {1,3,5,6};
        System.out.println(Isinteresting(A));


    }
    public static String Isinteresting(int[] A) {
        int odd =0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0) odd++;
        }

        if(odd%2 == 0) return "Yes";
        else return "No";
    }

}
