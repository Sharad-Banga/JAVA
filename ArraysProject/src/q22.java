class q22{
    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(sellstocks(arr));
    }

    private static int sellstocks(int[] arr) {
        int n = arr.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for (int i =0 ; i<n ; i++){
            if (buyPrice<arr[i]){
                int p = arr[i]-buyPrice;
                maxPrice = Integer.max(p,maxPrice);
            }else{
                buyPrice=arr[i];
            }
        }
        return maxPrice;
    }
}