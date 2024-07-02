import java.util.ArrayList;

public class ReverseArrayList {

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list){

        int start = 0;
        int end = list.size() - 1;

        while(start < end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }

        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList: "+list);
        System.out.println("Reversed ArrayList: "+ reverseArrayList(list));
    }
}
