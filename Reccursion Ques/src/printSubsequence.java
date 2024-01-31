public class printSubsequence {
    public static void ssq(String s,int idx, String ans){
        if (idx== s.length()){
            System.out.println(ans);
            return;
        }
        char curr = s.charAt(idx);
        String rem = s.substring(0,idx)+s.substring(idx);
        ssq(rem , idx+1 ,  ans+curr);
        ssq(rem , idx+1 , ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        ssq(s,0," ");
    }
}
