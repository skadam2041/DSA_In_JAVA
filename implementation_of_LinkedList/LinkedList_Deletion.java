import java.util.Scanner;

public class LinkedList_Deletion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        Node head =null;
        Node tail = null;
        Node temp = head;
        //insertion at end
        for(int i = 0; i<arr.length ; i++) {
            int data = arr[i];
            Node newnode = new Node(data);
            if(head == null)
            {
                head = newnode;
            }
            else
            {
                temp = head;
                while(temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = newnode;
            }
        }


        //deleting 1st element;
        {
            System.out.println("deletin 1st ");
            temp = head;
            head = temp.next;
        }
        //traversing in linked list
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

        //deleting from end;
        {
            System.out.println("deleting last");
            temp = head;
            Node newtemp = temp.next;
            while (newtemp.next != null) {
                temp = newtemp;
                newtemp = newtemp.next;
            }
            temp.next = null;
        }
        //traversing in linked list
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

        //deleting from position 2;

        {
            System.out.println("deleting from postion 2");
            temp = head;
            Node newtemp = temp.next;
            for (int i = 1; i < 2 - 1; i++) {
                temp = newtemp;
                newtemp = newtemp.next;
            }
            temp.next = newtemp.next;
        }

        //traversing in linked list
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
class Node{
    public
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}


