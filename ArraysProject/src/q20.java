//pascal triangle
public class q20 {
    public static void main(String[] args) {
        int[][] j = pascal(10);
        print(j);
    }

    public static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for (int i=0; i<n ; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i]=1;
            for (int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }
        return ans;
    }
    public static void print(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for (int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
