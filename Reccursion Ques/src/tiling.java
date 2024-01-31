import java.util.Scanner;

public class tiling {
    public static int tile(int n){
        if (n==0) return 1;
        if (n==1) return 1;

        int f1 = tile(n-1);
        int f2 = tile(n-1);
        return f1+f2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n = sc.nextInt();
        System.out.println(tile(n));
    }
}
