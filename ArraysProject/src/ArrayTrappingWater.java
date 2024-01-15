
public class ArrayTrappingWater {
    public static int trapped(int[] array){

        int n = array.length;
        //calculate left max boundary
        int[] leftMax = new int[n];
        leftMax[0]=array[0];
        for(int i = 1 ; i< n ; i++){
            leftMax[i] = Math.max(array[i],leftMax[i-1]);
        }

        //calculate right max boundary
        int[] rightMax = new int[n];
        rightMax[n-1] = array[n-1];
        for(int i = n-2 ; i>=0 ; i--) {
            rightMax[i] = Math.max(array[i], rightMax[i + 1]);
        }

        int trappedWater = 0 ;
            //calculating water level
            for (int i = 0; i < n; i++) {
                int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //calculating trapped water (water level - height of block(array value))

           trappedWater += waterLevel - array[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {

        int[] array = new int[]{4,2,0,6,3,2,5};
        System.out.println("water trapped = "+trapped(array));
    }
}
