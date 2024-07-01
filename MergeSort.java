import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1};

        System.out.println("Before sorting: "+ Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("After sorting: "+ Arrays.toString(numbers));
    }

    private static void mergeSort(int[] numbers) {
        int length = numbers.length;
        if(length <= 1) return;

        int middle = length / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[length - middle];

        for(int i = 0; i < middle; i++){
            leftHalf[i] = numbers[i];
        }
        for(int i = middle; i < length; i++)
        {
            rightHalf[i - middle] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //call merge method to merge partitioned array
        merge(numbers , leftHalf , rightHalf);
    }

    private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0, j=0 , k=0;
        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                numbers[k] = leftHalf[i];
                i++;
            }
            else
            {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j < rightSize){
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
