import java.util.Arrays;

public class ArrayPairing {

    public static void pairs(int[] arrone){
        int n;
        n = arrone.length;
        for (int i=0 ; i<n ; i++ ){
            int curr = arrone[i];
            for(int j=i+1 ; j<n ; j++){
                System.out.println("(" +curr + "," +arrone[j]+ "),");
            }
        }

    }


    public static void main(String[] args) {
        int[] arrone = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(arrone));
        pairs(arrone);

    }
}
