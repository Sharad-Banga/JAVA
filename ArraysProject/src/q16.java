import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values :");
        for (int i=0 ; i<3 ;i++){
            for (int j=0; j<3 ; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("display ");
        for (int i=0 ; i<3 ;i++){
            for (int j=0; j<3 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
