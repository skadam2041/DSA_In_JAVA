//Problem Description
//        You are given an array A of N integers.
//        Return a 2D array consisting of all the subarrays of the array

import java.util.ArrayList;

public class createAllSubarrays {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println(AllSubarrays(A));
    }
    public static ArrayList<ArrayList<Integer>> AllSubarrays(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> subarr = new ArrayList<ArrayList<Integer>>();
        int n = A.size();
        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = s; i <= e; i++) {
                    list.add(A.get(i));
                }
                subarr.add(list);
            }
        }
        return subarr;
    }
}
