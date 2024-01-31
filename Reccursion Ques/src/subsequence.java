import java.util.ArrayList;

public class subsequence {
    public static ArrayList<String> SSQ(String s) {
        ArrayList<String> ll = new ArrayList<>();
        if (s.length()==0){
            ll.add(" ");
            return ll;
        }

        char curr = s.charAt(0);
        ArrayList<String> ss = SSQ(s.substring(1));
        for (String g : ss){
            ll.add(curr+g);
            ll.add(g);
        }
        return ll;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(SSQ(s));
    }
}
