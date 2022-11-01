import java.util.Scanner;

public class DoubleLinkedList_creation_insertion_traversing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        doubleNode head = null;
        doubleNode tail = null;
        doubleNode temp = head;
        int data;
        for(int i = 0; i<arr.length; i++)
        {
            data = arr[i];;
            doubleNode newnode = new doubleNode(data);
            if(head == null)
            {
                head = newnode;
                tail = newnode;
            }
            else
            {
                head.prev = newnode;
                newnode.next = head;
                head = newnode;
            }
        }
        // forward traversing
        System.out.println("forward traverssing");
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        //reverse traversing
        System.out.println("reverse traversing");
        temp = tail;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
        System.out.println("-------------");

        //insertion at head
        {
            System.out.println("enter element to insert at head : ");
             data = s.nextInt();
             doubleNode newnode = new doubleNode(data);
             head.prev = newnode;
             newnode.next = head;
             head = newnode;

        }
        //forward traversing
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-------------");

        //insertion at tail
        {
            System.out.println("enter element to insert at tail : ");
            data = s.nextInt();
            doubleNode newnode = new doubleNode(data);
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;

        }
        //forward traversing
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-------------");

        //insertion at middle position
        {
            System.out.println("enter position element to insert at tail : ");
            int position = s.nextInt();
            data = s.nextInt();
            doubleNode newnode = new doubleNode(data);
            temp = head;

            for(int i = 1; i< position -1 ;i++)
            {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            newnode.prev = temp;
        }
        //forward traversing
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-------------");
    }
}
class doubleNode{
    int data;
    doubleNode prev;
    doubleNode next;
    doubleNode(int d)
    {
        this.data = d;
        this.prev = null;
        this.next = null;
    }
}