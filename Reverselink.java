public class Reverselink {

    // Method to reverse the linked list
    public static Node reverseLinkedList(Node head) {
        Node prev = null, next; // Combine declarations for clarity
        while (head != null) {
            next = head.next;   // Store next node
            head.next = prev;   // Reverse the link
            prev = head;        // Move prev one step ahead
            head = next;        // Move head one step ahead
        }
        return prev; // New head after reversal
    }

    // Method to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); // Print current node's data
            head = head.next;                 // Move to next node
        }
        System.out.println(); // Print new line after printing list
    }

    public static void main(String[] args) {
        // Create and initialize the linked list in a more compact way
        Node head = new Node(1, new Node(2, new Node(3, new Node(4))));

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

    // Constructor with optional next node for compact initialization
    Node(int data) {
        this(data, null);
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
