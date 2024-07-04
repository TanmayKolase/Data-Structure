public class stackLinkedList {
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    class Stack {
        Node top;

        Stack() {
            top = null;
        }

        void push(int data) {
            Node newNode = new Node(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        int pop() {
            if (top == null) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            } else {
                int value = top.data;
                top = top.next;
                return value;
            }
        }

        int peek() {
            if (top == null) {
                System.out.println("Stack is empty. Nothing to peek.");
                return -1;
            } else {
                return top.data;
            }
        }

        boolean isEmpty() {
            return (top == null);
        }

        void printForward() {
            printBackwardRecursive(top);
            System.out.println("null");
        }

        void printBackwardRecursive(Node node) {
            if (node == null) {
                return;
            }
            printBackwardRecursive(node.next);
            System.out.print(node.data + " => ");
        }
        
        void printBackward() {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " => ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        stackLinkedList sll = new stackLinkedList();
        Stack stack = sll.new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Print stack forward:");
        stack.printForward();

        System.out.println("Print stack backward:");
        stack.printBackward();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Print stack forward:");
        stack.printForward();

        System.out.println("Print stack backward:");
        stack.printBackward();
    }
}
