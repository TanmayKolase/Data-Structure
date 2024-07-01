import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = numbers[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer <= rightPointer) {
            while (leftPointer <= rightPointer && numbers[leftPointer] <= pivot) {
                leftPointer++;
            }

            while (leftPointer <= rightPointer && numbers[rightPointer] >= pivot) {
                rightPointer--;
            }

            if (leftPointer < rightPointer) {
                swap(numbers, leftPointer, rightPointer);
            }
        }

        swap(numbers, leftPointer, highIndex);

        quickSort(numbers, lowIndex, leftPointer - 1);
        quickSort(numbers, leftPointer + 1, highIndex);
    }

    private static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
