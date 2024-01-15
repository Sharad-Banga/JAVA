// For a given array of integers of size n, answer q queries to print
// the sum of values in a given range of indices from l to r

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter i : ");
        int i = sc.nextInt();
        System.out.print("enter j : ");
        int j = sc.nextInt();
        int sum = ssum(arr,i,j);
        System.out.println(sum);
    }

    private static int[] pre(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i=1;i< arr.length;i++){
            ans[i] = arr[i] + ans[i-1];
        }
        return ans;
    }

    private static int ssum(int[] arr, int i, int j) {
        int[] prefix = pre(arr);
        return prefix[j] - prefix[i-1];
    }
}
