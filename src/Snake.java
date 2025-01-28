import java.util.*;
public class Snake {
    public Snake(int len, int wid){
        super();
    };

    public static LinkedList<String> snake = new LinkedList();


    public static int X(int x) {
        return Integer.parseInt(snake.get(x).split(",")[0]);
    }


    public static int Y(int y) {
        return Integer.parseInt(snake.get(y).split(",")[1]);
    }

    public static void InitSnakeLoc() {
        snake.add("13,14");
        snake.add("13,15");
        snake.add("13,16");
        snake.add("13,17");
    }
    public static void ShowSnake() {

        for (int i = 0; i < snake.size(); i++) {
            int x = X(i);
            int y = Y(i);
            if (i == 0) {
                Rectangle.map[x][y] = "●";
                continue;
            }
            Rectangle.map[x][y] = "□";
        }

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(Rectangle.map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
