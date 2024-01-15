//to find second largest number

import java.util.Arrays;
public class q8 {
    public static void main(String[] args) {
        int[] arr = {2,4,2,4,5,6,7,3,10};
        Arrays.sort(arr);
        System.out.println("2nd largest elt is : "+arr[arr.length-2]);
    }
}
