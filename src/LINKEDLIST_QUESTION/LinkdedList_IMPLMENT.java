package LINKEDLIST_QUESTION;


//add , delete print LK
public class LinkdedList_IMPLMENT {
    Node head;

    public void LinkdedList_IMPLMENT()
    {
        this.head=null;
    }

    //addFirst element
    public void addFirst(int val)
    {
        Node n=new Node(val);

        if(head==null) {
            head=n;
        }
        else {
            n.next=head;
            head=n;
        }
    }

    //addLast element
    public void addLast(int val)
    {
        Node n=new Node(val);
        if(head==null)
        {
            head=n;//this is the first value in LK
        }
        else
        {
            Node temp=head;

            while(temp.next !=null)
            {
                temp=temp.next;
            }
            temp.next=n;//if null then assign n i.e value will add in the last
        }
    }

    //delete last element
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
        }
        else
        {
            Node temp=head;

            while(temp.next.next != null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    //delete first
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty...");
        }
        else {
            head=head.next;
        }
    }

    //Add element is between in LikedList
    public void add(int val,int pos)
    {
        Node temp=head;

        for(int i=0;i<pos-2;i++)
        {
            temp=temp.next;
        }
        Node n=new Node(val);
        n.next=temp.next;
        temp.next=n;
    }

    //Delete element is between in LikedList
    public void delete(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos-2;i++)
        {
            temp=temp.next;//it will stop one step nack which you want to delete position
        }
        temp.next=temp.next.next;//now we will not ponited to next element that we want to delete postion then automatically that will remove by GC

    }

    //print the linkedList
    public void printLinkedList()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
        }
        else {
            Node temp=head;

            while( temp !=null)
            {
                System.out.println(temp.val);
                temp=temp.next;
            }
        }
    }
         static void main(String[] args)
        {
            LinkdedList_IMPLMENT v1=new LinkdedList_IMPLMENT();

            v1.addLast(34);
            v1.addLast(54);
            v1.addLast(14);
            v1.addLast(94);

            System.out.println("before delete last element:-");
            v1.printLinkedList();

            v1.deleteLast();

            System.out.println("After delete last element");
            v1.printLinkedList();

            v1.addFirst(420);
            System.out.println("After added first element: ");
            v1.printLinkedList();

            v1.deleteFirst();
            System.out.println("After deleted first element :");
            v1.printLinkedList();

            v1.add(520, 3);
            System.out.println("Add element in between/ in any postion");
            v1.printLinkedList();

            v1.delete(3);
            System.out.println("Delete element through position");
            v1.printLinkedList();
        }
}


