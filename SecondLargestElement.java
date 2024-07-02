import java.util.Scanner;

public class SecondLargestElement {

    public static int secondLargestElement(int[] numbers){
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for(int num: numbers){
            if(num > largestElement){
                secondLargestElement = largestElement;
                largestElement = num;
            }else if(num > secondLargestElement && num != largestElement){
                secondLargestElement = num;
            }
        }
        return secondLargestElement;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        // User enters the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            numbers[i] = in.nextInt();
        }

        int result = secondLargestElement(numbers);
        System.out.println("Second largest element from array is: "+result);

        in.close();
    }
}
