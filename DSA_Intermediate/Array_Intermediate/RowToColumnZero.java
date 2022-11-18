//Problem Description
//        You are given a 2D integer matrix A, make all the elements in a row or column
//        zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
//
//        Input 1:
//
//        [1,2,3,4]
//        [5,6,7,0]
//        [9,2,0,4]
//
//
//        Example Output
//        Output 1:
//
//        [1,2,0,0]
//        [0,0,0,0]
//        [0,0,0,0]
//
//
//        Example Explanation
//        Explanation 1:
//
//        A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.

import java.util.ArrayList;

public class RowToColumnZero {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        AL.add(A);
        ArrayList<Integer> B = new ArrayList<Integer>();
        B.add(5);
        B.add(6);
        B.add(7);
        B.add(0);
        AL.add(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        C.add(9);
        C.add(2);
        C.add(0);
        C.add(4);
        AL.add(C);
        convertToZero(AL);
        System.out.println(AL);
    }
    public static ArrayList<ArrayList<Integer>> convertToZero(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> rowArray = new ArrayList<Integer>(); //create new list to store row index with zero
        ArrayList<Integer> colArray = new ArrayList<Integer>(); //create new list to store col index with zero
        //traverse the 2D list and find index with 0 and store them row wise and col wise
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(0).size(); j++) {
                if (A.get(i).get(j) == 0) {
                    rowArray.add(i); //store index into new rowArray
                    colArray.add(j); // store index into new colArray
                }
            }
        }
        //traverse rowArray with index details and make colums in that row zero
        for (int i = 0; i < rowArray.size(); i++) {
            for (int col = 0; col < A.get(0).size(); col++) {
                A.get(rowArray.get(i)).set(col, 0); // A.get(index of row).set(col Index, 0)
            }
            //traverse colArray with index details and make rows in that colume zero
            for (int j = 0; j < colArray.size(); j++) {
                for (int row = 0; row < A.size(); row++) {
                    A.get(row).set(colArray.get(j), 0); //A.get(row).set(index of col, 0)
                }
            }
        }
        return A;
    }

}
