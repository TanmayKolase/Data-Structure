import java.util.Scanner;

public class CheckSortedArray {

    public static boolean checkSorted(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        // User enters the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            numbers[i] = in.nextInt();
        }

        if(checkSorted(numbers)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted!!!");
        }

        in.close();
    }
}
