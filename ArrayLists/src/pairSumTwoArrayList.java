//Find if any pair in a Sorted & Rotated ArrayList has a target sum

import java.util.ArrayList;

public class pairSumTwoArrayList {

    public static boolean sum(ArrayList<Integer> list ,int target){

        int bp = -1;
        for(int i = 0 ;i<list.size() ; i++){
            if(list.get(i)>list.get(i+1)){
                 bp=i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;

        int n = list.size();

        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 16;
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        boolean x = sum(list , target);
        if(x==true){
            System.out.println("Found!");
        }else{
            System.out.println("Not Found!");
        }
    }
}
