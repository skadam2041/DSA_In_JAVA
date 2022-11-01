public class OueueImplementation_LinkedList {
    public static void main(String[] args) {
        QueueLinkedList obj = new QueueLinkedList(0);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.display();
        obj.dequeue();
        obj.display();
        obj.deteteQueue();
        obj.display();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.display();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }
}
class QueueLinkedList{
    int data;
    QueueLinkedList next;

    QueueLinkedList(int d){
        this.data = d;
        this.next = null;
    }

    QueueLinkedList front = null;
    QueueLinkedList rear = null;
    QueueLinkedList temp = front;

    void enqueue(int data)
    {
        QueueLinkedList node = new QueueLinkedList(data);
        if(front == null && rear == null)
        {
            front = node;
            rear = node;
            System.out.println("element inserted: " + front.data);
        }
        else
        {

            rear.next = node;
            rear = node;
            System.out.println("element inserted: " + rear.data);
        }
    }

    void dequeue()
    {
        if(front == null)
        {
            System.out.println("underflow- nothing to delete");
        }
        else
        {
            System.out.println("element " + front.data + " is deleted");
            front = front.next;
        }
    }

    void display()
    {
        if(front == null)
        {
            System.out.println("Queue dont exist");
        }
        else
        {
            System.out.println("The Queue is : ");
            System.out.println(front.data);
            temp = front.next;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void deteteQueue()
    {
        front = null;
        rear = null;
        System.out.println("Queue is deleted");
    }
}