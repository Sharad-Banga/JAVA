//find the last occurence of element x in given array
public class q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,2,6,4};
        int xx = lastoccu(arr,2);
        System.out.println("last occurence of "+2+" is "+xx);
    }

    private static int lastoccu(int[] arr,int x) {
        int lastidx =-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                lastidx = i;
            }
        }
        return lastidx;
    }
}
