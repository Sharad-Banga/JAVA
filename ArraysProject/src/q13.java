//printing prefix sum
public class q13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] prefix = pre(arr);
        for (int e : prefix){
            System.out.print(e+" ");
        }
    }

    private static int[] pre(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i=1;i< arr.length;i++){
            ans[i] = arr[i] + ans[i-1];
        }
        return ans;
    }
}
