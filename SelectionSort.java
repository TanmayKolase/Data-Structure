import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int length = arr.length;

        for(int i=0; i<length-1; i++) {
            int minIndex = i;

            for(int j=i+1; j<length; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1};
        System.out.print("Before Sorting: ");
        System.out.print(Arrays.toString(numbers));

        //Call bubbleSort
        selectionSort(numbers);

        System.out.print("\n"+"After Sorting: ");
        System.out.print(Arrays.toString(numbers));
    }
}
