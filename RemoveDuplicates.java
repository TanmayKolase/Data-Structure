import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        // User enters the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            numbers[i] = in.nextInt();
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }

        // Convert the ArrayList back to an array
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        System.out.println(Arrays.toString(newArray));

        in.close();
    }
}
