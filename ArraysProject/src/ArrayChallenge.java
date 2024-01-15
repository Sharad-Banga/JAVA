import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {

        int[] arrone = getRandomArray(5);
        System.out.println("Random array we get :"+Arrays.toString(arrone));
        int[] sortedArray = sortedArray(arrone);
        System.out.println("Array in descending order"+Arrays.toString(sortedArray));


    }
    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(1000);
        }

        return newInt;
    }

    private static int[] sortedArray(int[] array){

        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i =0 ; i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp  = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

}
