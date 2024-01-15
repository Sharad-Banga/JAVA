//Program to check if an array is sorted or not
public class q4 {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,5};
        boolean r = isSorted(arr);
        if(r){
            System.out.println("array is sorted");
        }else{
            System.out.println("not sorted");
        }
    }

    private static boolean  isSorted(int[] arr) {
        for (int i =1;i< arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
