public class SumOfSubArraySimple {
    public static void sum(int[] array){
        int maxSum = Integer.MIN_VALUE;

        int n = array.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                int currSum = 0;
                for(int k = i ; k<=j ; k++){
                    currSum +=array[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5};
        sum(array);
    }
}
