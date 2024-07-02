import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    
    public static void reverseArray(int[] numbers){
        int start = 0;
        int end = numbers.length - 1;
        int temp;//for swapping

        while(start < end){
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] numbers){
        System.out.println(Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        // User enters the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            numbers[i] = in.nextInt();
        }

        System.out.print("Original Array: "); printArray(numbers);

        //call method to reverse the array
        reverseArray(numbers);
        System.out.print("Reversed Array: ");
        printArray(numbers);

        in.close();
    }
}
