import java.util.ArrayList;

public class printEveryIndicesOfX {
    public static ArrayList<Integer> pp(int[] arr, int x , int idx){
        if (idx== arr.length) return new ArrayList<>();
        ArrayList<Integer> ll = new ArrayList<>();
        if(arr[idx]==x){
            ll.add(idx);
        }
        ArrayList<Integer> ans = pp(arr,x,idx+1);
        ll.addAll(ans);
        return ll;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,86,6};
        int x = 4;
        System.out.println(pp(arr,x,0));
    }
}