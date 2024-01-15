import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        list.add(1);
        list.add(2);
        System.out.println(list);

        int elt = list.get(1);
        System.out.println("elt at 1 is "+elt);
    }
}