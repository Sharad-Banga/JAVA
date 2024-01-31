public class removeOccInString {
    public static String remove(String s , int idx){
        if (idx==s.length()) return " ";
        char curr = s.charAt(idx);
        if (curr=='a'){
            return remove(s,idx+1);
        }else{
            return curr+remove(s,idx+1);
        }
    }
    public static void main(String[] args) {
        String s = "Sharad";
        System.out.println(remove(s,0));
    }
}
