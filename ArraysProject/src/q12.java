import java.util.Arrays;

//Rotate the array by 'k' steps without  extra space
public class q12 {
    public static void rev(int[] arr, int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("GIVEN ARRAY : "+Arrays.toString(arr));
        int n = arr.length;
        int k = 3;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        System.out.println("ARRAY AFTER ROTATION : "+Arrays.toString(arr));
    }
}
