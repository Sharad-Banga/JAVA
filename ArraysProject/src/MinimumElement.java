import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {

        int[] returnedArray= readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = "+returnedMin);
    }

    private static int[] readIntegers(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list of integers seperated by commas");
        String input = sc.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i=0 ; i< splits.length;i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;
        for(int el : array){
            if(el<min){
                min=el;
            }
        }

        return min;
    }
}
