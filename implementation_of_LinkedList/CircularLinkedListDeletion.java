import java.util.Scanner;

public class CircularLinkedListDeletion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        list obj = new list(0);
        obj.creationOfCircularList(arr);
        obj.display();
        obj.deleteAtHead();
        System.out.println("after deleting 1st element");
        obj.display();
        obj.deleteAtTail();
        System.out.println("after deleting last element");
        obj.display();
        obj.deleteFromPosition();
        obj.display();
    }
}
class list{
    int data;
    list next;
    list(int d)
    {
        this.data = d;
        this.next = null;
    }
    Scanner s = new Scanner(System.in);
    list head = null;
    list tail = null;
    list temp = head;
    // creation of circular linked list
    public void creationOfCircularList(int arr[])
    {
        System.out.println("circular linked list is created");
        for (int i = 0; i < arr.length; i++) {
            data = arr[i];
            list node = new list(data);
            if (head == null) {
                head = node;
                tail = node;
                node.next = head;
            } else {
                node.next = head;
                head = node;
                tail.next = head;
            }
        }
    }

    //traversing
    public void display()
    {
        temp = head;
        System.out.println(temp.data);
        temp = temp.next;
        while (temp != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-------------------");
    }

    public void deleteAtHead()
    {
        temp = head;
        head = temp.next ;
        tail.next = head;
    }

    public void deleteAtTail()
    {
        temp = head;
        temp = temp.next;
        list temp2 = null;
        while(temp2 != tail)
        {
            temp= temp.next;
            temp2 = temp.next;
        }
        temp.next = head;
        tail = head;
    }

    public void deleteFromPosition()
    {
        System.out.println("after deleting from postion 2");
        temp = head;
        list newtemp = temp.next;
        for (int i = 1; i < 2 - 1; i++) {
            temp = newtemp;
            newtemp = newtemp.next;
        }
        temp.next = newtemp.next;
    }
}
