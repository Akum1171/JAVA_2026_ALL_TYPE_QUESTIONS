package ARRAY_STRING_QUESTIONS;
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    // Reverse logic
    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = next;               // move curr
        }
        return prev; // new head
    }

    // Print linked list
    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

     static void main(String[] args) {
        // Create Linked List: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println("Original Linked List:");
        printList(head);
        // Reverse the linked list
        head = reverse(head);
        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
