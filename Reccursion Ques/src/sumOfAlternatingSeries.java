//
import java.util.Scanner;

public class sumOfAlternatingSeries {
    public static int ssum(int n){
        if (n==0) return 0;
        if (n%2==0){
            return ssum(n-1)-n;
        }else{
            return ssum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ssum(n));
    }
}
