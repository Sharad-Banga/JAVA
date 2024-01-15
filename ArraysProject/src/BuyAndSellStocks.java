public class BuyAndSellStocks {
    public static int stocks(int[] array) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i< array.length ; i++){
            if(buyPrice<array[i]){
                int profit = array[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice=array[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {

        int[] array = new int[]{7,1,5,3,6,4};
        System.out.println(stocks(array));
    }
}
