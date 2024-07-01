import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1};

        System.out.println("Before sorting: "+Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("After sorting: "+Arrays.toString(numbers));
    }

    private static void insertionSort(int[] numbers) {
        for(int i=1; i<numbers.length; i++) {
            int currentValue = numbers[i];
            int j = i-1;

            while(j>=0 && currentValue < numbers[j]) {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = currentValue;
        }
    }
}