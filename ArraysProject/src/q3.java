//Program to count the number of elements strictly greater than a value x
public class q3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5};
        int r = count(arr,2);
        System.out.println(r);
    }

    private static int count(int[] arr, int x) {
        int count = 0;
        for (int i =0 ; i<arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        return count;
    }
}
