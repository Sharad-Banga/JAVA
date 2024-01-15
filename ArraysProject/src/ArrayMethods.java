import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] arrone = getRandomArray(5);
        System.out.println(Arrays.toString(arrone));

    }
        private static int[] getRandomArray(int len){
            Random random = new Random();
            int[] newInt = new int[len];

            for(int i =0 ; i<len ; i++){
                newInt[i] = random.nextInt(100);
            }

            return newInt;

    }
}
