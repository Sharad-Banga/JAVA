import java.util.ArrayList;

public class MaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);
        list.add(6);
        System.out.println(list);
        int maxNum = Integer.MIN_VALUE;
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i)>maxNum){
                maxNum = list.get(i);
            }

        }
        System.out.println("max is "+maxNum);
    }
}
