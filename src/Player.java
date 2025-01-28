import java.util.*;
public class Player {
    public static void isHit() {
        if (Rectangle.map[Snake.X(0)][Snake.Y(0)].equals("*")) {
            System.out.println("game over");
            System.exit(0);
        }
        if (Rectangle.map[Snake.X(0)][Snake.Y(0)].equals("□")) {
            System.out.println("game over");
            System.exit(0);
        }
    }


    public static void Remove() {

        Rectangle.map[Snake.X(Snake.snake.size() - 1)][Snake.Y(Snake.snake.size() - 1)] = " ";

        Snake.snake.removeLast();

        Snake.ShowSnake();
    }

    public static void Score(){
        int score=0;
        if (Rectangle.map[Snake.X(0)][Snake.Y(0)].equals("○")) {
            Snake.snake.addFirst(Snake.X(0) + "," + (Snake.Y(0) - 1));

            Apple.Random();
            Move.speed -= 15;
            score+=1;
        }
        if(Rectangle.map[Snake.X(0)][Snake.Y(0)].equals("○")) {
            Snake.snake.addFirst(Snake.X(0) + "," + (Snake.Y(0) + 1));

            Apple.Random();
            Move.speed -= 15;
            score+=1;
        }
        if(Rectangle.map[Snake.X(0)][Snake.Y(0)].equals("○")) {
            Snake.snake.addFirst(Snake.X(0)+ 1 + "," + (Snake.Y(0) ));

            Apple.Random();
            Move.speed -= 15;
            score+=1;
        }
        if(Rectangle.map[Snake.X(0)][Snake.Y(0)].equals("○")) {
            Snake.snake.addFirst(Snake.X(0)- 1 + "," + (Snake.Y(0) ));

            Apple.Random();
            Move.speed -= 15;
            score+=1;
        }

        System.out.println("your score is "+score);
}

}

