
//trapping water
public class q21 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int x = traped(height);
        System.out.println(x); // 6
    }
    private static int traped(int[] height) {
        int n = height.length;

        //left max
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i=1 ; i<n ; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //right max
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //trapped water
        int td =0;
        //calculating water level
        for (int i =0 ;i<n;i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            td += waterLevel-height[i];
        }
        return td ;
    }
}
