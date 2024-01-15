public class StairCaseSearch {
    public static boolean staircaseSearch(int[][] matrix,int key){
        int row=0;
        int col = matrix.length-1;

        while(col>=0 && row< matrix.length){
            if(matrix[row][col] == key){
                System.out.println("key found at ("+row+ ","+col+")");
                return true;
            }else if(matrix[row][col]>key){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int key = 11;
        staircaseSearch(matrix,key);
    }
}
