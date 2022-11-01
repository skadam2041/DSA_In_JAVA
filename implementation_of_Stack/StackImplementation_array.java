
import java.util.Scanner;

public class StackImplementation_array {
    public static void main(String[] args) {
        StackArray obj = new StackArray();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.pop();
        obj.display();
        obj.deleteStack();
        obj.display();
    }
}
class StackArray{
    Scanner s = new Scanner(System.in);
    int arr[] = new int [5];
    int top = -1;
    void push(int data)
    {
        if(top>=arr.length)
        {
            System.out.println("overflow - canot add size is full");
        }
        else {
            top = top + 1;
            arr[top] = data;
            System.out.println("element inserted: "+ data);
        }
    }
    void pop()
    {
        if (top == -1)
        {
            System.out.println("underflow - cannot delete as no element");
         }
        else {
            System.out.println("top element "+ arr[top]+" deleted");
            top = top - 1;
        }
    }
    void display()
    {
        if(top ==-1 )
        {
            System.out.println("stack dont exist");
        }
        else {
            System.out.println("Stack is: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    void deleteStack()
    {
        arr = null;
        top = -1;
        System.out.println("stack deleted successfully");
    }
}