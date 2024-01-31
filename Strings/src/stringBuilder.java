public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        //append
        sb.append(" World");
        System.out.println(sb);

        //setCharAt
        sb.setCharAt(0,'M');
        System.out.println(sb);

        //insert
        sb.insert(0,"Marsh");
        System.out.println(sb);

        //delete at
        sb.deleteCharAt(0);
        System.out.println(sb);

        //delete from i to j
        sb.delete(0,4);
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);

        //
    }
}
