//For an array of integers return the first value
// that is repeating in the array
public class q9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,5,6,8};
        int rr = raepeat(arr);
        System.out.println(rr);
    }
    private static int raepeat(int[] arr) {
        int n = arr.length;
        for (int i = 0 ;i<n;i++){
            for (int j =i+1;j<n;j++){
                if (arr[i]==arr[j]) return arr[i];
            }
        }
        return -1;
    }
}
