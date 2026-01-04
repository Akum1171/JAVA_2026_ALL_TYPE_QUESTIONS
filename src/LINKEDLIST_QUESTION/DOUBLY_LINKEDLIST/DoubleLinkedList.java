package LINKEDLIST_QUESTION.DOUBLY_LINKEDLIST;
public class DoubleLinkedList {

    private Node head;
    private Node tail;

    public DoubleLinkedList()
    {
        head=null;
        tail=null;
    }

    //add last Element
    public void addLast(int val)
    {
        Node n=new Node(val);

        if(head==null)
        {
            head=n;
            tail=n;
        }
        else {
            tail.next=n;
            n.prev=tail;
            tail=n;
        }

    }
    //add first element DL

    public void addFirst(int val)
    {
        Node n=new Node(val);

        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            head.prev=n;
            n.next=head;
            head=n;
        }

    }
}