import java.util.ArrayList;
import java.util.Scanner;

public class RemoveArrayListElement {

    public static void removeElementByIndex(ArrayList<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Invalid index. No element removed.");
        }
    }

    public static void removeElementByValue(ArrayList<Integer> list, Integer value) {
        boolean removed = list.remove(value);
        if (!removed) {
            System.out.println("Element not found. No element removed.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to add:");
        int n = in.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        System.out.println("Original ArrayList: " + list);

        // Remove element by index
        System.out.println("Enter the index of the element to remove:");
        int index = in.nextInt();
        removeElementByIndex(list, index);
        System.out.println("ArrayList after removing element by index: " + list);

        // Remove element by value
        System.out.println("Enter the value of the element to remove:");
        int value = in.nextInt();
        removeElementByValue(list, value);
        System.out.println("ArrayList after removing element by value: " + list);

        in.close();
    }
}
