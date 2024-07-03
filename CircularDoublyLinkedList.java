import java.util.Scanner;

public class CircularDoublyLinkedList{

    class LinkedList {
        Node head;

        class Node {
            int data;
            Node prev;
            Node next;

            Node(int value) {
                data = value;
                prev = null;
                next = null;
            }
        }

        void addElement(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                head.next = head;
                head.prev = head;
            } else {
                Node last = head.prev;
                last.next = newNode;
                newNode.prev = last;
                newNode.next = head;
                head.prev = newNode;
            }
        }

        void printForward() {
            if (head == null) {
                System.out.println("Empty list!");
            } else {
                Node temp = head;
                do {
                    System.out.print(temp.data + " => ");
                    temp = temp.next;
                } while (temp != head);
                System.out.println();
            }
        }

        void printBackward() {
            if (head == null) {
                System.out.println("Empty list!");
            } else {
                Node temp = head.prev;
                do {
                    System.out.print(temp.data + " => ");
                    temp = temp.prev;
                } while (temp != head.prev);
                System.out.println();
            }
        }

        void deleteNode(int value) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            Node current = head;
            while (current.data != value && current.next != head) {
                current = current.next;
            }

            if (current.data != value) {
                System.out.println("Value not found in the list.");
                return;
            }

            // If only one node
            if (head.next == head) {
                head = null;
            } else if (current == head) { 
                Node last = head.prev;
                head = head.next;
                head.prev = last;
                last.next = head;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }

        int getSize() {
            if (head == null) {
                return 0;
            }

            int count = 0;
            Node temp = head;
            do {
                count++;
                temp = temp.next;
            } while (temp != head);

            return count;
        }

        boolean isEmpty() {
            return (head == null);
        }
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        LinkedList list = cdll.new LinkedList();

        Scanner input = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add element");
            System.out.println("2. Print list forward");
            System.out.println("3. Print list backward");
            System.out.println("4. Delete node");
            System.out.println("5. Get size");
            System.out.println("6. Check if list is empty");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    value = input.nextInt();
                    list.addElement(value);
                    break;
                case 2:
                    System.out.println("List (forward):");
                    list.printForward();
                    break;
                case 3:
                    System.out.println("List (backward):");
                    list.printBackward();
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    value = input.nextInt();
                    list.deleteNode(value);
                    break;
                case 5:
                    System.out.println("Size of the list: " + list.getSize());
                    break;
                case 6:
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("The list is not empty.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        input.close();
    }
}
