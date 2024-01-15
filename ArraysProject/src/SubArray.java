public class SubArray {
    public static void subArray(int[] array){
        int n = array.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                for(int k=i ; k<=j ; k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        subArray(array);
    }
}
