import java.util.Scanner;

public class circularLinkedList_creation_insertion_traversing {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        NewNode obj = new NewNode(0);
        obj.CreateCircularList(arr);
        obj.display();
        obj.insertAtHead();
        obj.display();
        obj.insertAtLast();
        obj.display();
        obj.insertAtPosition();
        obj.display();
    }
}

class NewNode{
    Scanner s = new Scanner(System.in);
    int data;
    NewNode next;
    NewNode(int d)
    {
        this.data = d;
        this.next = null;
    }
    NewNode head = null;
    NewNode tail = null;
    NewNode temp = head;
    //creation of Circular list
    public void CreateCircularList(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            data = arr[i];
            NewNode node = new NewNode(data);
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

    //traversing of circular list
    public void display(){
        System.out.println("circular list is : ");
        temp = head;
        System.out.println(temp.data);
        temp = temp.next;
        while (temp != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-------------------");
    }

    //insertion at head;
    public void insertAtHead()
    {
        System.out.println("enter number to insert at head");
        data = s.nextInt();
        NewNode node = new NewNode(data);
        node.next = head;
        head = node;
        tail.next = head;
    }

    //insertion at tail
    public void insertAtLast()
    {
        System.out.println("enter number to insert at last/tail");
        data = s.nextInt();
        NewNode node = new NewNode(data);
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //insertion at specific position
    public void insertAtPosition()
    {
        System.out.println("enter position and number to insert at last/tail");
        int position = s.nextInt();
        data = s.nextInt();
        NewNode node = new NewNode(data);
        temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        System.out.println("circular list is after insertion at position" + position + " is");
    }
}