import java.util.Scanner;

public class CircularSinglyLinkedList {
    class LinkedList {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int value) {
                data = value;
                next = null;
            }
        }

        void addElement(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                head.next = head;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head;
            }
        }

        void printList() {
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

        void deleteNode(int value) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            Node current = head, prev = null;
            do {
                if (current.data == value) {
                    break;
                }
                prev = current;
                current = current.next;
            } while (current != head);

            if (current == head) {
                Node last = head;
                while (last.next != head) {
                    last = last.next;
                }

                if (head == last) {
                    head = null;
                } else {
                    head = head.next;
                    last.next = head;
                }
            } else {
                prev.next = current.next;
            }
        }

        int getSize() {
            if (head == null) {
                return 0;
            }

            Node temp = head;
            int count = 0;
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
        CircularSinglyLinkedList sl = new CircularSinglyLinkedList();
        LinkedList list = sl.new LinkedList();

        Scanner input = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add element");
            System.out.println("2. Print list");
            System.out.println("3. Delete node");
            System.out.println("4. Get size");
            System.out.println("5. Check if list is empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    value = input.nextInt();
                    list.addElement(value);
                    break;
                case 2:
                    list.printList();
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    value = input.nextInt();
                    list.deleteNode(value);
                    break;
                case 4:
                    System.out.println("Size of the list: " + list.getSize());
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("The list is not empty.");
                    }
                    break;
                case 6:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        input.close();
    }
}
