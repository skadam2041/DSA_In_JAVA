//problem
//        reverse the array
//take 2 pointers start and end swap element and one increment and one decreament
public class reverseArray {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 7, 8};
        reverseArray(A);
        for(int i = 0; i< A.length; i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void reverseArray( int[] A) {
        int i = 0;
        int j = A.length -1;
        while(i<j)
        {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }

    }
}
