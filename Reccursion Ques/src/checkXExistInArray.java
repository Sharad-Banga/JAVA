public class checkXExistInArray {
    public static boolean find(int[] arr, int x ,int idx){
        if (idx== arr.length) return false;
        if(arr[idx]==x) return true;
        return find(arr,x,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,86,6};
        int x = 4;
        System.out.println(find(arr,x,0));
    }
}
