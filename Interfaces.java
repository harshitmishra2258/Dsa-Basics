public class Interfaces{
    public static void main(String[] args) {
        Queen q = new Queen();
        // System.out.println(q.moves);
        q.moves();
        
    }
}
interface Chesspieces{
    void moves();

}
class Queen implements Chesspieces{
    public void moves(){
        System.out.println("UP,Down,Left,Right,Diagonal - IN all directions ");
    }
}

class Rook implements Chesspieces{
    public void moves(){
        System.out.println("UP,Down,Left,Right ");
    }
}
class King implements Chesspieces{
    public void moves(){
        System.out.println("UP,Down,Left,Right,Diagonal - IN all direction only 1 step  ");
    }
}