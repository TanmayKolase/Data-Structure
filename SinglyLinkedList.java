import java.util.Scanner;

public class SinglyLinkedList {
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
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = newNode;
            }
        }

        void printList() {

            if (head == null) {
                System.out.println("Empty list!");
            } else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + "=>");
                    temp = temp.next;
                }
                System.out.println();
            }

        }

        void deleteNode(int value) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            if (head.data == value) {
                head = head.next;
                return;
            }

            Node prev = null;
            Node temp = head;

            while (temp != null && temp.data != value) {
                prev = temp;
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Value not present in the list!");
                return;
            }

            prev.next = temp.next;
        }

        int getSize() {
            int count = 0;
            Node temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        boolean isEmpty() {
            return (head == null);
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
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
