public class CircularOueue_Array {
    public static void main(String[] args)
    {
        CircularQueueArray obj = new CircularQueueArray();
        obj.dequeue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.display();

        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.display();

        obj.dequeue();
        obj.deleteQueue();
        obj.display();
    }
}
class CircularQueueArray{
    int arr[] = new int[5];
    int f = -1;
    int r = -1;

    void enqueue(int data)
    {
        if(f == (r+1)% arr.length) // it will always give number between 0 to arr.length .. if f first and r is last then only condition will satisfy(true)
        {                          // we cannot insert more but when delete happens(dequeue) f shifts next position and condition is false then we can add again from 0 to arr.length
            System.out.println("overflow - canot insert more as size is full");
        }
        else
        {
            if(f == -1 && r ==-1)  // inserting at first place
            {
                f = 0;
                r = 0;
                arr[r] = data;
                System.out.println("element inserted" + arr[r]);
            }
            else   // inserting at next place
            {
                r = (r+1)%arr.length;  // if position 1 is empty then
                arr[r] = data;
                System.out.println("element inserted" + arr[r]);
            }
        }
    }

    void dequeue()
    {
        if(f == -1 && r ==-1 )
        {
            System.out.println("underflow - no elements present for deletion");
        }
        else if( f == r)
        {
            System.out.println("last element deleted - underflow");
            f = -1;
            r = -1;
        }
        else
        {
            System.out.println("element " + arr[f] + " deleted");
            f = (f+1)% arr.length;
        }
    }

    void display()
    {
        if(f == -1 || r == -1)
        {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("The Queue is");
            for (int i = f; i != r; i = (i+1)%arr.length)
            {
                System.out.println(arr[i]);
            }
            System.out.println(arr[r]);
        }
    }

    void deleteQueue(){
        arr= null;
        f = -1;
        r = -1;
        System.out.println("queue deleted");
    }

}