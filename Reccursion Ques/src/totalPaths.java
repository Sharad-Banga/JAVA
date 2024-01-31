public class totalPaths {
    public static int paths(int i ,int j , int n , int m){
        if (i==n || j ==m) return 0;
        if (i==n-1 && j==m-1) return 1;

        int down = paths(i+1 , j ,n,m);
        int right = paths(i ,j+1 , n , m);
        return down + right;
    }
    public static void main(String[] args) {
        int i=0;
        int j = 0;
        int n = 5;
        int m = 5;
        int s = paths(i,j,n,m);
        System.out.println(s);
    }
}
