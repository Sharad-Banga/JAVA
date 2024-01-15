class TdArraySpiral{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println("GIVEN ARRAY : ");
        int n = arr.length;
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        spiral(arr);
    }
    private static void spiral(int[][] arr) {
        int n = arr.length;
        int SR = 0;
        int SC = 0;
        int ER = n-1;
        int EC = arr[0].length-1;
        int curr = 1;
        while(SR<=ER && SC<=EC){

            for (int j=SC ; j<=EC ; j++){
                arr[SR][j] = curr++;
            }
            for (int i=SR+1 ; i<=ER ; i++){
                arr[i][EC] = curr++;
            }
            for (int j=EC-1 ; j >=SC ; j--){
                if (EC == SC ){
                    break;
                }
                arr[ER][j] = curr++;
            }
            for (int i=ER-1 ; i >SR ; i--){
                if (ER == SR ){
                    break;
                }
                arr[i][SC] = curr++;
            }
            SR++;
            EC--;
            ER--;
            SC++;
        }
        System.out.println("SPIRAL FORM : ");
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}