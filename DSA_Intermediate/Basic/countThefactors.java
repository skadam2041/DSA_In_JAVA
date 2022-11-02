//Problem Description
//        Given an integer A, you need to find the count of it's factors.
//
//        Factor of a number is the number which divides it perfectly leaving no remainder.
//
//        Example : 1, 2, 3, 6 are factors of 6

//logic: You have to traverse from 1 to squrt of number add 2 factors if u get factor in between
//check i is != A/i if same number consider once in else condition
//for eg. factors of 24 > 1 24 2 12 3 8 4 6
//1x24 > +2
//2x12 > +2
//3x8 > +2
//4x6 > +2

//you will get all the  factors when u traverse till sqrt of n..just count 2 at time


import java.util.*;
public class countThefactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = s.nextInt();
        System.out.println(FactorsCount(n));
    }
    //time Complexity will be (sqrt of n)
    public static int FactorsCount(int A) {
        int count = 0;
        for(int i = 1; i*i <= A; i++) // untill i is greater than squareroot of A
        {
            if(A%i ==0)
            {
                if(i!=(A/i))
                {
                    count= count+2; // i and A/i will be factors
                }
                else
                {
                    count= count+1; // in case pf perfect square
                }
            }
        }
        return count;
    }
}