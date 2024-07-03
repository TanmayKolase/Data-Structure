import java.util.Scanner;

public class DoublyLinkedList {
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
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.prev = temp;
            }
        }

        void printForward() {
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

        void printBackward() {
            if (head == null) {
                System.out.println("Empty list!");
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }

                while (temp != null) {
                    System.out.print(temp.data + "=>");
                    temp = temp.prev;
                }
                System.out.println();
            }
        }

        void deleteNode(int value) {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }

            Node curr = head;
            while (curr != null && curr.data != value) {
                curr = curr.next;
            }

            if (curr == null) {
                System.out.println("Value not found in the list!");
                return;
            }

            // If node to be deleted is head
            if (curr == head) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
                return;
            }

            // Adjust pointers to delete the node
            if (curr.prev != null) {
                curr.prev.next = curr.next;
            }
            if (curr.next != null) {
                curr.next.prev = curr.prev;
            }
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
        DoublyLinkedList dll = new DoublyLinkedList();
        LinkedList list = dll.new LinkedList();

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
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        input.close();
    }

}
