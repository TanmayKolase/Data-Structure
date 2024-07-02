import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceArrayListElement {

    public static void replaceElement(ArrayList<Integer> list, int index, int newElement) {
        if (index >= 0 && index < list.size()) {
            list.set(index, newElement);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to add:");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Original ArrayList: " + list);

        System.out.println("Enter the index of the element to replace:");
        int index = scanner.nextInt();

        System.out.println("Enter the new element:");
        int newElement = scanner.nextInt();

        replaceElement(list, index, newElement);

        System.out.println("Updated ArrayList: " + list);

        scanner.close();
    }
}
