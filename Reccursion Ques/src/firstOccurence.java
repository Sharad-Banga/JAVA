public class firstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,2};
        int idx = 0;
        int target = 2;
        int ss = firstOcc(arr,idx,target);
        System.out.println(ss);
    }

    private static int firstOcc(int[] arr, int idx, int target) {
        if (idx== arr.length) return -1;
        if (arr[idx]==target) {
            return idx;
        }
        return firstOcc(arr,idx+1,target);

    }
}
