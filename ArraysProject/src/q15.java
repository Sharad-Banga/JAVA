//Program to check if an array can be partitioned into sub-arrays with equal sum
public class q15 {
    public static void main(String[] args) {
        int[] arr = {5,3,2,6,3,1};
        int totalsum = summ(arr);
        int prefixSum = 0;
        for (int i =0 ; i<arr.length;i++){
            prefixSum += arr[i];
            int suffixSum = totalsum-prefixSum;
            if (prefixSum == suffixSum){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }

    private static int summ(int[] arr) {
        int s =0;
        for (int i =0;i<arr.length;i++){
            s += arr[i];
        }
        return s;
    }
}
