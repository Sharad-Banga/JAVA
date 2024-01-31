public class sumOfArray {
    public static int ss(int[] arr , int idx){
        if (idx== arr.length) return 0;
        return arr[idx]+ss(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(ss(arr,0));
    }
}
