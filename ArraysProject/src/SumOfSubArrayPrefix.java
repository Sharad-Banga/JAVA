import java.util.Arrays;

public class SumOfSubArrayPrefix {
    public static void sumPrefix(int[] array){

    {
        int[] prefix = new int[array.length];
        prefix[0] = array[0];
        int n = prefix.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i =1 ; i<n ; i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        System.out.println(Arrays.toString(prefix));

        for (int i = 0; i < n; i++) {
            int start = i;

            for (int j = i; j < n; j++) {
                int end = j;

                int currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            }
        System.out.println(maxSum);
        }


    }

    public static void main(String[] args) {
        int[] array = new int[]{1,-2,6,-1,3};
        System.out.println("Given Array : "+ Arrays.toString(array));
        sumPrefix(array);
    }
}
