

public class StackImplementation_LinkedList {
    public static void main(String[] args) {
        stackLinkedList obj = new stackLinkedList(0);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
        obj.deleteStack();
        obj.display();


    }
}
class stackLinkedList{
    int data;
    stackLinkedList next;
    stackLinkedList(int d)
    {
        this.data = d;
        this.next = null;
    }
    stackLinkedList top = null;
    stackLinkedList temp = top;


    void push(int data)
    {
       stackLinkedList node = new stackLinkedList(data);
       if(top == null)
       {
           top = node;
           System.out.println("inserted value: "+ top.data);
       }
       else
       {
           node.next = top;
           top = node;
           System.out.println("inserted value: "+ top.data);
       }
    }

    void display()
    {
        if(top == null)
        {
            System.out.println("stack dont exist");
        }
        else {
            System.out.println("stack is");
            temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void pop()
    {
        if(top == null)
        {
            System.out.println("underflow - cannot delete as no element");
        }
        System.out.println(top.data + " is deleted from stack");
        temp = top;
        stackLinkedList temp2 = temp.next;
        top = temp2;
    }

    void deleteStack(){
        top = null;
        System.out.println("stack deleted");
    }
}
