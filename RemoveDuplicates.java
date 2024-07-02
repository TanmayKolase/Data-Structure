import java.util.ArrayList;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> tempList = new ArrayList<>();

        for(int num: list){
            if(!tempList.contains(num)){
                tempList.add(num);
            }
        }

        return tempList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println("Before: "+list);
        System.out.println("After: ");
        removeDuplicates(list);
    }
}