import java.util.Scanner;

public class MaxMinArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        // User enters the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            numbers[i] = in.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            } else if (num < max && num > min) {
                min = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        in.close();
    }
    
}