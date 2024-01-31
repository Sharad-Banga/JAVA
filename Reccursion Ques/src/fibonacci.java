//returning value at index in fibonacci series
import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n ){
        if (n==0) return 1;
        if (n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
