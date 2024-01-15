// Program to find a unique number in a given array
public class q7 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,2};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j =i+1 ; j< arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int k=0;k<arr.length;k++){
            if (arr[k]!=-1){
                return arr[k];
            }
        }
        return -1;
    }
}
