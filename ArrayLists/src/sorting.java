import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(4);
        System.out.print("Given List : ");
        System.out.println(list);
        System.out.print("List Sorted in ascending order : ");
        Collections.sort(list);
        System.out.println(list);
        System.out.print("List Sorted in descending order : ");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
