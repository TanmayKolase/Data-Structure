import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;

        while (swapped)
        {
            swapped = false;
            for(int i=0; i<arr.length-1; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nums  = {5,4,3,2,1};
        System.out.print("Before Sorting: ");
        System.out.print(Arrays.toString(nums));

        //Call bubbleSort
        bubbleSort(nums);

        System.out.print("\n"+"After Sorting: ");
        System.out.print(Arrays.toString(nums));
    }
}