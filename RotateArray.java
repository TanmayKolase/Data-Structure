import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void reverse(int[] numbers , int start , int end){
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateArray(int[] numbers, int k){
        k = k % numbers.length;
        reverse(numbers , 0 , numbers.length - 1);
        reverse(numbers , 0 , k-1);
        reverse(numbers , k , numbers.length - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        // User enters the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            numbers[i] = in.nextInt();
        }

        System.out.print("Enter rounds of rotation: ");
        int k = in.nextInt();//k means rotation value

        System.out.print("Array before rotation: "+Arrays.toString(numbers)+'\n');

        rotateArray(numbers,k);

        System.out.print("Array after rotation: "+Arrays.toString(numbers));

        in.close();
    }
}
