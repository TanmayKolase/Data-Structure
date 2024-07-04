public class CircularQueue {

    class Node{
        int data;
        Node  next;

        Node(int value)
        {
            data = value;
            next = null;
        }
    }

    Node front , rear;

    CircularQueue()
    {
        front  = null;
        rear = null;
    }

    void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty())    
        {
            front  = rear = newNode;
            rear.next = front;
        }else{
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    boolean isEmpty()
    {
        return (front == null && rear == null);
    }

    void printQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty! Cannot perfrom print operation!");
            return;
        }else{
            Node temp = front;
            do {
                System.out.print(temp.data+"=>");
                temp = temp.next;
            } while (temp != front);
            System.out.println();
        }
    }

    int peek()
    {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot perform peek operation!");
            return -1; 
        }
        return front.data;
    }

    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty! Cannot perform dequeue operation!");
            return -1;
        }
        
        int data;
        if(front == rear)
        {
            data = front.data;
            front = rear = null;
            
        }else{
            data = front.data;
            front = front.next;
            rear.next = front;
        }
        return data;
    }
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        System.out.println("Front element: "+queue.peek());

        System.out.println("Dequeued element: "+queue.dequeue());
        queue.printQueue();
    }
    
}
