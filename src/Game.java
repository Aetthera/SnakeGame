import java.util.*;


public class Game {

    Rectangle rectangle =new Rectangle(24,30);
    public void load() {
        Rectangle.Map();
        Snake.InitSnakeLoc();
        Snake.ShowSnake();
        Apple.Random();
        startUp();
        Player.isHit();
        Player.Remove();
        Player.Score();

    }

    //CHEN
    public void startUp() {
        Thread start = new Thread(new Move());
        start.start();
        while (true) {
            Scanner input = new Scanner(System.in);
              Move.move = input.next();

            if (Move.move.length() >= 2) {
                Move.move = Move.move.substring(0, 1);
            }
        }
    }




}