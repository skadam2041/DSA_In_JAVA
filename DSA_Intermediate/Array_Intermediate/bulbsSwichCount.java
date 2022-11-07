//Problem Description
//        A wire connects N light bulbs.
//
//        Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
//
//        Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
//
//        You can press the same switch multiple times.
//
//        Note: 0 represents the bulb is off and 1 represents the bulb is on.
//        ////logic..............//**********************
//A=[0,1,0,1] where 0 represent bulb is OFF and 1 represent bulb is ON.
//
//        As we know it we press a bulb even no of times then it will remain in same state otherwise its state will reverse.
//
//        For odd:
//        ON => OFF or OFF=>ON
//        For even:
//        No change, state will remain same.
//
//        So, we can store no. of times switch pressed previously.
//
//        If previous count is even then current blub will remain in same state & if count is odd then current bulb already changed due to switch pressed before.
//
//        So we can check two conditions:
//        1) If count%2==0 && A[i]==0 then here we need to change the state of current bulb, so we increase count++.
//        2) If  count%2!=0 && A[i]=1  then here count is odd times so current state of bulb get change and if its currently 1 then it becomes 0.
//        So we need to change it again and need to increase count.
public class bulbsSwichCount {
    public static void main(String[] args) {
        int A[] = {0,1,0,1};
        System.out.println(countSwich(A));
    }
    public static int countSwich(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (count % 2 == 0 && A[i] == 0) {
                count++;
            } else if (count % 2 != 0 && A[i] == 1) {
                count++;
            }
        }
        return count;
    }

}
