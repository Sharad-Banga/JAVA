// finding factorial of a given number
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (n==0) return 1;
        return n*fact(n-1);
    }
}
