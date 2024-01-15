//Program to find the total number
// of pairs in the arrays whose sum is equal to the given target value
public class q5 {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int cc = ct(arr,7);
        System.out.println(cc);
    }

    private static int ct(int[] arr, int target) {
        int count = 0;
        int n = arr.length;
        for (int i =0 ; i<n; i++){
            for (int j =i+1; j<n;j++){
                if (arr[i]+arr[j]==target) count++;
            }
        }
        return count;
    }
}
