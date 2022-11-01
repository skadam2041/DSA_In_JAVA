import java.util.Scanner;
public class DoubleLinkedList_Deletion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        double_Node head = null;
        double_Node tail = null;
        double_Node temp = head;
        int data;
        for(int i = 0; i<arr.length; i++)
        {
            data = arr[i];;
            double_Node newnode = new double_Node(data);
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

        //deletion of 1st elements;
        head = head.next;
        head.prev = null;
        System.out.println("after deleting 1st elements");
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-------------");

        //deletion of last elements
        temp = tail.prev;
        temp.next = null;
        tail.prev = null;
        tail = temp;
        System.out.println("after deleting last elements");
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-------------");

        //deletion from specific position
        System.out.println("After deleting from postion 2");
        temp = head;
        double_Node newtemp = temp.next;
        for (int i = 1; i < 2 - 1; i++) {
            temp = newtemp;
            newtemp = newtemp.next;
        }
        temp.next = newtemp.next;
        newtemp.prev=null;
        double_Node temp2 = newtemp.next;
        temp2.prev = temp;
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-------------");
    }
}
class double_Node{
    int data;
    double_Node prev;
    double_Node next;
    double_Node(int d)
    {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}