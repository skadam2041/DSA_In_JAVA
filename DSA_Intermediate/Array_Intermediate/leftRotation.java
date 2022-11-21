//Problem Description
//        Given an array of integers A and multiple values in B, which represents the
//        number of times array A needs to be left rotated.
//
//        Find the rotated array for each value and return the result in the from of a matrix where
////        ith row represents the rotated array for the ith value in B.
//Input 1:
//
//        A = [1, 2, 3, 4, 5]
//        B = [2, 3]
//        Output 1:
//
//        [ [3, 4, 5, 1, 2]
//        [4, 5, 1, 2, 3] ]

import java.util.ArrayList;

public class leftRotation {
    public static void main(String[] args) {
        ArrayList<Integer> A  = new  ArrayList<Integer> ();
        ArrayList<Integer> B = new  ArrayList<Integer> ();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        B.add(2);
        B.add(3);
        System.out.println(rotateleft(A,B));

    }
    public static ArrayList<ArrayList<Integer>> rotateleft(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<ArrayList<Integer>> ();
        ArrayList<Integer> sec_list = (ArrayList<Integer>)A.clone();

        for(int k = 0; k<B.size(); k++)
        {
            int num = B.get(k);
            if(num>A.size())
            {
                num = num%A.size();
            }
            num = A.size() - num; //as rotation 1st elemeent to last place
            int n = A.size();
            reverse(A,0,n-1);
            reverse(A,0,num-1);
            reverse(A,num,n-1);
            ansList.add(A);
            A= (ArrayList<Integer>)sec_list.clone();
        }
        return ansList;
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> A,int i,int j)
    {
        while(i<j)
        {
            int temp = A.get(i);
            A.set(i,A.get(j));
            A.set(j, temp);
            i++;
            j--;
        }
        return A;
    }

}
