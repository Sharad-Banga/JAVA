import java.util.Scanner;

public class printKMultiplesOfNum {
    public static void multi(int num , int k){
        if (k==0) return;
        multi(num,k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of num : ");
        int num = sc.nextInt();
        System.out.println("enter number of multiples : ");
        int k = sc.nextInt();
        multi(num,k);
    }
}
