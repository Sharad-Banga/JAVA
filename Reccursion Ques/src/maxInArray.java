public class maxInArray {
    public static int max(int[] arr , int idx){
        if (idx == arr.length) return -1;
        if (arr[idx]>max(arr,idx+1)){
            return arr[idx];
        }else{
            return max(arr,idx+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,5,4,3};
        int idx = 0;
        System.out.println(max(arr,idx));
    }
}
