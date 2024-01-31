//given route containing 4 directions (E,W,N,S),find the
//shortest path to reach destination
//"WNEENESENNN"

public class shortestPath {
    public static float getShortestPath(String str){
        int x=0;
        int y =0;

        for(int i =0 ; i<str.length() ; i++){
            char dir = str.charAt(i);

            //SOUTH
            if(dir=='S'){
                y--;
            }
            //NORTH
            else if(dir == 'N'){
                y++;
            }
            //WEST
            else if(dir == 'W'){
                x--;
            }
            //EAST
            else{
                x++;
            }
        }
        return (float)Math.sqrt((x*x) + (y*y));
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));

    }
}
