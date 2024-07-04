import java.util.LinkedList;

public class LinearQueue {
    LinkedList<Integer> queue;

    LinearQueue()
    {
        queue = new LinkedList<>();
    }

    void enqueue(int data)
    {
        queue.addLast(data);
    }

    void printqueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty! Cannot perform print operation");
            return;

        }else{
            System.out.println("Queue: "+ queue);
        }
    }

    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty! Cannot perform dequeue operation");
            return -1;
        }
        else{
            return queue.removeFirst();
        }
    }

    boolean isEmpty()
    {
        return queue.isEmpty();
    }

    int size()
    {
        return queue.size();
    }

    int peek()
    {
        //peeks first element from queue...
        return queue.peekFirst();
    }

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        queue.printqueue();

        System.out.println("Dequeued element: "+queue.dequeue());

        System.out.println("Front element: "+queue.peek());
        System.out.println("Queue size: "+queue.size());

        queue.printqueue();        
    }
}
