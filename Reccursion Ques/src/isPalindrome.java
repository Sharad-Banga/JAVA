public class isPalindrome {
    public static boolean isPalin(String s, int l, int r){
        if (l>=r) return true;
        return ((s.charAt(l)==s.charAt(r)) && isPalin(s,l+1 , r-1));
    }
    public static void main(String[] args) {
        String s = "racecar";
        int l = 0;
        int r = s.length()-1;
        System.out.println(isPalin(s,l,r));
    }
}
