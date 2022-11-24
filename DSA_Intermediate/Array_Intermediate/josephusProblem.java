//Problem Description
//        There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and pass the knife
//        to the next person standing in circle.
//        This process continues till there is only 1 person remaining. Find the last person standing in the circle.
public class josephusProblem {
    public static void main(String[] args) {
        int A = 14;
        System.out.println(findlastPerson(A));
    }
    public static int findlastPerson(int A) {
        int near2power = 1;
        while(near2power<=A)
        {
            near2power = near2power*2;
        }
        near2power = near2power/2;
        int ans = 1 + ((A- near2power)*2);
        return ans;
    }
}

