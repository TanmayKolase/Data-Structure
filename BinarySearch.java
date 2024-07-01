import java.util.Scanner;

public class BinarySearch {

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

        int result = binarySearch(arr, size, target);

        if (result != -1)
            System.out.println("Element is present at index " + result);
        else
            System.out.println("Element is not present in array");

        scanner.close();
    }

    public static int binarySearch(int[] arr, int size, int target) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
