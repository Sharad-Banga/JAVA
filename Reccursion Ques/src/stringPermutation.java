public class stringPermutation {
    public static void main(String[] args) {
        String s = "abc";
        String perm = "";
        printPerm(s,perm);
    }

    private static void printPerm(String s, String perm) {
        if (s.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i =0 ; i <s.length() ; i++){
            char curr = s.charAt(i);
            printPerm(s.substring(0,i)+s.substring(i+1) , perm+curr);
        }
    }
}
