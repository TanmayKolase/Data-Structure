import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int size = arr.length;

        // User enters the values
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int result = linearSearch(arr, size, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found!");

        scanner.close();
    }

    public static int linearSearch(int[] arr, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
