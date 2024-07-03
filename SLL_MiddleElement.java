//Singly Linked List

import java.util.ArrayList;
import java.util.Scanner;

public class SLL_MiddleElement {

    class LinkedList {
        Node head; // head of the list

        class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        void printMiddle() {
            ArrayList<Integer> list = new ArrayList<>();
            Node temp = head;

            while (temp != null) {
                list.add(temp.data);
                temp = temp.next;
            }

            int middleIndex = list.size() / 2;
            System.out.println("The middle element is: " + list.get(middleIndex));
        }

        public void addToTheLast(Node node) {
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
    }

    public static void main(String[] args) {
        SLL_MiddleElement me = new SLL_MiddleElement();
        LinkedList list = me.new LinkedList();
        
        Scanner input = new Scanner(System.in);
        
        int value;
        do {
            System.out.print("Enter a value (-1 to stop):");
            value = input.nextInt();
            if (value != -1) {
                list.addToTheLast(list.new Node(value));
            }
        } while (value != -1);
        
        list.printMiddle();
        input.close();
    }
}
