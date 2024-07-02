import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        Integer[] array = new Integer[list.size()];
        System.out.println("Arraylist: "+list);
        list.toArray(array);
        System.out.println("Array: "+Arrays.toString(array));
    }
}
