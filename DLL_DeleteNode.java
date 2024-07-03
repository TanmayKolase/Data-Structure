public class DLL_DeleteNode {
    class LinkedList{
        Node head;

        class Node{
            int data;
            Node prev;
            Node next;

            Node(int value)
            {
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

        void deleteNode(int key){
            Node current = head;
            while(current!= null && current.data != key)
            {
                current = current.next;
            }

            if (current == null) {
                System.out.println("Node with data " + key + " not found.");
                return;
            }

            if(current == head)
            {
                head = current.next;
            }

            if (current.prev != null) {
                current.prev.next = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            }

            current = null;

        }
    }

    public static void main(String[] args) {
        DLL_DeleteNode obj = new DLL_DeleteNode();
        LinkedList list = obj.new LinkedList();

        list.insertAtPosition(10,1);
        list.insertAtPosition(20,2);
        list.insertAtPosition(30,3);
        list.insertAtPosition(40,2);

        list.printList();
        list.deleteNode(40);
        list.printList();
        list.deleteNode(10);
        list.printList();
    }
}
