import java.util.Scanner;

public class linkedlList_Creation_Insertion_traversing {
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50};
        NewNodeCreation obj = new NewNodeCreation(0);
        obj.createSingleLinkedList(arr);
        obj.displayList();
        obj.insertionFromLast(arr);
        obj.displayList();
        obj.insertionAtPosition(arr);
        obj.displayList();
    }
}
class NewNodeCreation{
    public
    int data;
    NewNodeCreation next;
    NewNodeCreation(int d){
        this.data = d;
        this.next = null;
    }

    NewNodeCreation head = null;
    NewNodeCreation tail = null;
    NewNodeCreation temp = head;

    //creation of linked list by insertion at front
    public void createSingleLinkedList(int arr[])
    {
        //from front
        System.out.println("insertion from head(front)");
        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            NewNodeCreation newnode = new NewNodeCreation(data);
            if (head == null) {
                head = newnode;
            } else {
                newnode.next = head;
                head = newnode;
            }
        }
    }
    //traversing of linked list
    public  void displayList()
    {
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //insertion from last
    public  void insertionFromLast(int arr[])
    {
        NewNodeCreation temp = head;
        System.out.println("insertion at last");
        for(int i = 0; i<arr.length ; i++) {
            int data = arr[i];
            NewNodeCreation newnode = new NewNodeCreation(data);
            if(head == null )
            {
                head = newnode;
                tail = newnode;
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
    }

    //insertion at specific position
    public void insertionAtPosition(int arr[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insertion at specific position");
        System.out.println("enter position to enter");
        int position = s.nextInt();
        System.out.println("enter data");
        int newdata = s.nextInt();
        NewNodeCreation newnode = new NewNodeCreation(newdata);
        if (position == 1) {
            newnode.next = head;
            head = newnode;
        } else {
            temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
}

