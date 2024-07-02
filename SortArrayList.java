import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static ArrayList<Integer> sortList(ArrayList<Integer> list){
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println("Before sorting"+list);
        System.out.println("After sorting: "+ sortList(list));
    }
}
