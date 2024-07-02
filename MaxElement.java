import java.util.ArrayList;

public class MaxElement {

    public static int findMax(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int num: list){
            if(num>max) 
                max = num;
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println("Max is: "+findMax(list));
    }
}
