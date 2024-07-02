import java.util.Scanner;

public class ArrayContainsElement {

    public static void checkElement(int[] numbers , int target){
        for(int num: numbers){
            if(num == target){
                System.out.println("Element found!");
                return;
            }
        }

        System.out.println("Element not found!");
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        // User enters the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            numbers[i] = in.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = in.nextInt();

        checkElement(numbers , target);
        in.close();
    }    
}
