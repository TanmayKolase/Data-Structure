import java.util.Scanner;

public class FindMissingNumber {

    public static int findMissingNumber(int[] numbers) {

        int n = numbers.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num: numbers){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        // User enters the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            numbers[i] = in.nextInt();
        }

        int result = findMissingNumber(numbers);
        System.out.println("Result: "+result);

        in.close();
    }
}
