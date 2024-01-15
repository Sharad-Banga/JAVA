//Program to count the number of triplets whose
// sum is equal to the given value x
public class q6 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        int cc = ct(arr,12);
        System.out.println(cc);
    }

    private static int ct(int[] arr, int target) {
        int count = 0;
        int n = arr.length;
        for (int i =0 ; i<n; i++){
            for (int j =i+1; j<n;j++){
                for (int k = j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==target) count++;
                }
            }
        }
        return count;
    }

}
