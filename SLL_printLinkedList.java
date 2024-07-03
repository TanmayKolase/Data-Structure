//Singly Linked List

import java.util.Scanner;

public class SLL_printLinkedList {

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

        void addElement(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "=>");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        SLL_printLinkedList pl = new SLL_printLinkedList();
        LinkedList list = pl.new LinkedList();

        Scanner input = new Scanner(System.in);

        int value;
        do {
            System.out.print("Enter a value (-1 to stop):");
            value = input.nextInt();
            if (value != -1) {
                list.addElement(list.new Node(value));
            }
        } while (value != -1);

        list.printList();
        input.close();
    }
}
