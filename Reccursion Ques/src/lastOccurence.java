public class lastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,2};
        int idx = 0;
        int target = 2;
        int ss = lastOcc(arr,idx,target);
        System.out.println(ss);
    }

    private static int lastOcc(int[] arr, int idx, int target) {
        if (idx== arr.length) return -1;
        int isFound = lastOcc(arr,idx+1,target);
        if (isFound==-1 && arr[idx]==target){
            return idx;
        }
        return isFound;
    }
}
