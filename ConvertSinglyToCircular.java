class ConvertSinglyToCircular {
    class SinglyLinkedList {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        public void append(int newData) {
            Node newNode = new Node(newData);
            if (head == null) {
                head = newNode;
                return;
            }

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        public void convertToCircular() {
            if (head == null) {
                return;
            }

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = head;
        }

        public void printList(boolean isCircular) {
            if (head == null) {
                return;
            }

            Node current = head;
            if (isCircular) {
                do {
                    System.out.print(current.data + " => ");
                    current = current.next;
                } while (current != head);
                System.out.println("(head)");
            } else {
                while (current != null) {
                    System.out.print(current.data + " => ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        ConvertSinglyToCircular obj = new ConvertSinglyToCircular();
        SinglyLinkedList list = obj.new SinglyLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.print("Original list: ");
        list.printList(false);

        list.convertToCircular();

        System.out.print("Circular list: ");
        list.printList(true);
    }
}
