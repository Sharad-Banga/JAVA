//rotating array using extra space
public class q11 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 5;
        int[] c = rotatee(arr,k);
        for (int el : c){
            System.out.print(el+" ");
        }
    }
    private static int[] rotatee(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j =0;
        for (int i = n-k ; i<n ; i++){
            ans[j] = arr[i];
            j++;
        }
        for (int i = 0 ; i<n-k ; i++){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
}
