//sum of two matrix
import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of rows : ");
        int r = sc.nextInt();
        System.out.print("enter no. of cols : ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        System.out.println("enter 1st matrix :");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("display array 1 : ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        int[][] b = new int[r][c];
        System.out.println("enter 2nd matrix :");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("display array 2 : ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("sum of arrays :");
        int[][] sum = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
