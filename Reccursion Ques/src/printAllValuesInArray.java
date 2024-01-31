public class printAllValuesInArray {
    public static void pp(int[] arr , int idx){
        int n = arr.length;
        if (idx== arr.length) return;
        System.out.println(arr[idx]);
        pp(arr,idx+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        pp(arr,0);
    }
}
