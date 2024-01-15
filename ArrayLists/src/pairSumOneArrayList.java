//Find if any pair in a Sorted ArrayList has a target sum

import java.util.ArrayList;

public class pairSumOneArrayList {
    public static boolean sum(ArrayList<Integer> list , int target){

        int lp=0;
        int rp= list.size()-1;

        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 7;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        boolean x = sum(list , target);
        if(x==true){
            System.out.println("Found!");
        }else{
            System.out.println("Not Found!");
        }
    }
}
