public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rev(arr);
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }

    private static void rev(int[] arr) {
        int i =0 ;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
