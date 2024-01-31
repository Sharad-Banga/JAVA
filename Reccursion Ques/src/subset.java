public class subset {
    public static void subset(int[] arr,int n , int idx , int sum){
        if (idx>=n){
            System.out.println(sum);
            return;
        }
        subset(arr ,n, idx+1 , sum);
        subset(arr ,n, idx+1 , sum+arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum =0;
        subset(arr,arr.length,0,sum);
    }
}
