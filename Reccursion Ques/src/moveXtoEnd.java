public class moveXtoEnd {
    public static void end(String s , int idx ,int count , StringBuilder newStr){
        if (idx==s.length()){
            for (int i=0; i<count ; i++){
                newStr.append('x');
            }
            System.out.println(newStr);
            return;
        }
        char curr = s.charAt(idx);
        if (curr =='x'){
            count++;
            end(s,idx+1,count,newStr);
        }else{
            end(s,idx+1,count,newStr.append(curr));
        }
    }
    public static void main(String[] args) {
        String s ="sxhxrxaxdx";
        int idx = 0;
        end(s , idx ,0, new StringBuilder());
    }
}
