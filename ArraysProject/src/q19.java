import java.util.Arrays;

//rotate 2d array by 90 degree
public class q19 {
    public static void main(String[] args) {
        int[][]  arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println("ORIGINAL ARRAY ");
        System.out.println("..............");
        for (int i=0 ; i<4 ;i++){
            for (int j=0 ; j<4 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------");
        int[][] tru = new int[4][4];
        int [][] gg = transpose(arr,tru);
        for (int i = 0;i<4;i++){
            rev(gg[i]);
        }
        System.out.println("ROTATED ARRAY ");
        System.out.println("..............");
        for (int i=0 ; i<4 ;i++){
            for (int j=0 ; j<4 ; j++){
                System.out.print(gg[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] arr,int[][] tru) {
        for(int i = 0;i<4;i++){
            for (int j=0 ; j<4 ; j++){
                tru[i][j] = arr[j][i];
            }
        }
        return tru;
    }

    public static void rev(int[] arr){
        int i=0;
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
