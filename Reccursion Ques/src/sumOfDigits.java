//adding digits of given number
import java.util.Scanner;

public class sumOfDigits {
    public static int ssum(int n){
        if (n==0) return 0;
        int a = n%10;
        return a + ssum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        System.out.println(ssum(n));
    }
}
