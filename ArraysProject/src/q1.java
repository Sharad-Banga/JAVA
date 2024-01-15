//how many times an element x occurs in array
public class q1 {
    public static int counti(int[] arr, int x, int count){
        for (int i =0; i< arr.length;i++){
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,4,5,2,5};
        System.out.println(counti(arr,2,0));
    }
}
