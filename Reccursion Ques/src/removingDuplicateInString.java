import java.util.Arrays;

public class removingDuplicateInString {
    public static void remove(String ss , Boolean[] mapping ,int idx , StringBuilder newStr){
        if (idx==ss.length()){
            System.out.println(newStr);
            return;
        }
        char curr=ss.charAt(idx);
        if (mapping[curr-'a']){
            remove(ss,mapping,idx+1,newStr);
        }else{
            mapping[curr-'a']=true;
            remove(ss,mapping,idx+1,newStr.append(curr));
        }
    }
    public static void main(String[] args) {
        String ss = "sharad";
        Boolean[] mapping = new Boolean[26];
        Arrays.fill(mapping,false);
        remove(ss,mapping,0,new StringBuilder());
    }
}
