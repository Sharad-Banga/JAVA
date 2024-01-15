public class SumOfDiagonals {
    public static void sum(int[][] matrix){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0 ; i< matrix.length ; i++){
            sum1 += matrix[i][i];

            if(i!=matrix.length-1-i){
                sum2+=matrix[i][matrix.length-1-i];

            }
        }

        System.out.println("Sum of primary diagonal : "+sum1);
        System.out.println("Sum of secondary diagonal : "+sum2);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        sum(matrix);
    }
}
