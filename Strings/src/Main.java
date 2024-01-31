class Main{
    public static void main(String[] args) {
        String s1 = "sharad";
        String s2 = "banga";
        String s3 = s1+s2;
        System.out.println(s3);//printing concatenated string-->sharadbanga

        //compare(int compares lexicographically
        System.out.println(s1.compareTo(s2));

        //length of string
        System.out.println(s3.length());//11

        //index of a character
        System.out.println(s3.indexOf('a'));//1

        //contains
        String j1 = "racecar";
        String j2 = "ace";
        System.out.println(j1.contains("ace"));//true

        //startsWith
        String q1 = "sharad";
        System.out.println(q1.startsWith("sh"));//true

        //endsWith
        String q2 = "banga";
        System.out.println(q2.endsWith("nga"));//true

        String name = "Sharad Banga";
        //lowercase
        System.out.println(name.toLowerCase());

        //upppercase
        System.out.println(name.toUpperCase());

        String w1 = "ss";

        System.out.println(w1);
        //      to check equality of strings use
        //      s1.equals(s2);
        //      if
        //      String s1 = "sharad";
        //      String s2 = "sharad";
        //      String s3 = new String("sharad");
        //      s1.equals(s2); -> true
        //      s1.equals(s3); -> false
    }

}