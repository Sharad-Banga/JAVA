import java.util.Scanner;

public class exponential {
    public static int expo(int p, int q){
        if(q==0) return 1;
        return p*expo(p,q-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of p : ");
        int p = sc.nextInt();
        System.out.println();
        System.out.print("enter value of q : ");
        int q = sc.nextInt();
        System.out.println(expo(p,q));
    }
}
