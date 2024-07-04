public class stackArray {
    int top;
    int[] array;
    int maxSize;

    stackArray(int value) {
        maxSize = value;
        array = new int[maxSize];
        top = -1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            array[++top] = data;
        }
    }

    boolean isFull() {
        return (top == maxSize - 1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    int size() {
        return (top + 1);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            return array[top--];
        }
    }

    void printBackward() {

        System.out.print("Stack in Backward direction: ");
        int curr = top;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[curr] + "=>");
            curr--;
        }
        System.out.println();
    }

    void printForward() {
        System.out.print("Stack in Forward direction: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "=>");
        }
        System.out.println();
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return (array[top]);
        }
    }

    public static void main(String[] args) {
        stackArray stack = new stackArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printForward();
        stack.printBackward();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Stack size is: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack size is: " + stack.size());

        System.out.println("Top element is: " + stack.peek());

    }
}