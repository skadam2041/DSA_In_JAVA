public class QueueImplementation_array {
    public static void main(String[] args)
    {
        QueueArray obj = new QueueArray();
        obj.dequeue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.dequeue();
        obj.display();
        obj.dequeue();
        obj.deleteQueue();
        obj.display();
    }
}
class QueueArray{
     int arr[] = new int[5];
     int f = -1;
     int r = -1;

     void enqueue(int data)
     {
         if(r >= arr.length-1)
         {
             System.out.println("overflow - canot insert more as size is full");
         }
         else
         {
             if(f == -1 && r ==-1)
             {
                 f = 0;
                 r = 0;
                 arr[r] = data;
                 System.out.println("element inserted" + arr[r]);
             }
             else
             {
                 r = r+1;
                 arr[r] = data;
                 System.out.println("element inserted" + arr[r]);
             }
         }
     }

     void dequeue()
     {
         if(f == -1 && r ==-1 )
         {
             System.out.println("underflow- no elements present for deletion");
         }
         else
         {
             System.out.println("element " + arr[f] + " deleted");
             f = f+1;
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
             for (int i = f; i <= r; i++) {
                 System.out.println(arr[i]);
             }
         }
     }

     void deleteQueue(){
         arr= null;
         f = -1;
         r = -1;
         System.out.println("queue deleted");
     }

}