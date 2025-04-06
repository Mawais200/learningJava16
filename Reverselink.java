public class Reverselink {

    // Method to reverse the linked list
    public static Node reverseLinkedList(Node head) {
        Node prev = null;              // To keep track of the previous node
        Node current = head;          // Start from head node
        Node next = null;             // To store next node temporarily

        while (current != null) {
            next = current.next;      // Store next node
            current.next = prev;      // Reverse the link
            prev = current;           // Move prev one step ahead
            current = next;           // Move current one step ahead
        }

        return prev; // New head after reversal
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // Print current node's data
            temp = temp.next;                 // Move to next node
        }
        System.out.println(); // Print new line after printing list
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printList(head); // Output: 1 2 3 4

        head = reverseLinkedList(head); // Reverse the list

        System.out.println("Reversed Linked List:");
        printList(head); // Output: 4 3 2 1
    }
}

// Definition for the Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    