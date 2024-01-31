public class reverseTheString {
    public static String rev(String s , int idx){
        if (idx==s.length()) return "";
        char curr = s.charAt(idx);
        return rev(s,idx+1)+curr;
    }
    public static void main(String[] args) {
       String s = "sharad";
        System.out.println(rev(s , 0));
    }
}
