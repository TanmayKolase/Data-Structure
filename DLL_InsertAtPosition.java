//DLL - Doubly Linked List

public class DLL_InsertAtPosition {
    class LinkedList{
        Node head;

        class Node{
            int data;
            Node prev;
            Node next;

            Node(int value){
                data = value;
                prev = null;
                next = null;
            }
        }

        void insertAtPosition(int data, int position){
            Node newNode = new Node(data);
            if(position == 1)
            {
                newNode.next = head;
                if(head != null)
                {
                    head.prev = newNode;
                }
                head = newNode;
                return;
            }

            Node current = head;
            for(int i=1; i<position -1 && current != null; i++)
            {
                current = current.next;
            }

            if (current == null) {
                System.out.println("The position is out of bounds.");
                return;
            }

            newNode.next = current.next;
            newNode.prev = current;
            if(current.next!=null)
            {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }   
    
    public static void main(String[] args) {
        DLL_InsertAtPosition obj = new DLL_InsertAtPosition();

        LinkedList list = obj.new LinkedList();

        list.insertAtPosition(10,1);
        list.insertAtPosition(20,2);
        list.insertAtPosition(30,3);
        list.insertAtPosition(40,2);

        list.printList();
    }
}
