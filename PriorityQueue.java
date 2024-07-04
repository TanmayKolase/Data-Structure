class PriorityQueue {
    class Node {
        int data;
        int priority;
        Node next;

        Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            this.next = null;
        }
    }

    private Node front;

    public PriorityQueue() {
        front = null;
    }

    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (isEmpty() || priority > front.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            Node temp = front;
            while (temp.next != null && temp.next.priority >= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int data = front.data;
        front = front.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1; 
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        System.out.print("Queue elements (priority): ");
        while (temp != null) {
            System.out.print(temp.data + "(" + temp.priority + ") ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.enqueue(10, 2);
        queue.enqueue(20, 1);
        queue.enqueue(30, 3);
        queue.printQueue();

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        queue.printQueue();

        queue.enqueue(40, 2);
        queue.enqueue(50, 1);
        queue.printQueue();
    }
}
