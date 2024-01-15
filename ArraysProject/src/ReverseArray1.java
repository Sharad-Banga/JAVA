import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray1 {

    public static int[] reverse(int[] arrone){

        int first = 0;
        int last = (arrone.length)-1;

        while(first<last){
            int temp = arrone[last];
            arrone[last] = arrone[first];
            arrone[first] = temp;

            first++;
            last--;

        }
        return arrone;
    }



    public static void main(String[] args) {
        int[] arrone = new int[]{1,2,3,4,5};
        reverse(arrone);
        System.out.println(Arrays.toString(arrone));

    }
}
