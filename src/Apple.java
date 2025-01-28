public class Apple  {
    public static void Random() {
        int ii = (int) (Math.round(Math.random() * 20 + 2));
        int jj = (int) (Math.round(Math.random() * 26 + 2));
        if (ii == 0 || jj == 0 || ii == 23 || jj == 28) {
            Random();
        } else {
            for (int i = 0; i < Snake.snake.size(); i++) {
                int x = Snake.X(i);
                int y = Snake.Y(i);

                if (x == ii && jj == y) {
                    Random();
                } else {
                    Rectangle.map[ii][jj] = "\uD83C\uDF4E";
                }
            }
        }

    }
}