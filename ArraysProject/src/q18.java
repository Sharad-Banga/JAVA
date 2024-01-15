//transpose of matrix
public class q18 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                         {7,8,9}};
        int[][] tru = new int[3][3];
        int[][] tr =  transp(arr,tru);
        for(int i = 0;i<3;i++){
            for (int j=0 ; j<3 ; j++){
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] transp(int[][] arr,int[][] tru) {
        for(int i = 0;i<3;i++){
            for (int j=0 ; j<3 ; j++){
                tru[i][j] = arr[j][i];
            }
        }
        return tru;
    }
}
