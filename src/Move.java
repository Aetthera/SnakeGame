public class Move extends Rectangle implements Runnable {

    public static int speed = 700;

    public static String move = "";
    private void w(){Snake.snake.addFirst(Snake.X(0) - 1 + "," + Snake.Y(0));
        Player.isHit();
        Player.Score();
        Player.Remove();}
    private void s(){Snake.snake.addFirst(Snake.X(0)+ 1 + "," + (Snake.Y(0)));
        Player.isHit();
        Player.Score();
        Player.Remove();}
    private void a(){Snake.snake.addFirst(Snake.X(0) + "," + (Snake.Y(0) - 1));
        Player.isHit();
        Player.Score();
        Player.Remove();}
    private void d(){Snake.snake.addFirst(Snake.X(0) + "," + (Snake.Y(0) + 1));
        Player.isHit();
        Player.Score();
        Player.Remove();}

    @Override

    public void run() {

        while (true) {
            if (move.equals("w")) {
                w();
            } else if (move.equals("s")) {
                s();
            } else if (move.equals("a")) {
                a();
            } else if (move.equals("d")) {
                d();
            } else {

                Thread.yield();
            }
            try {

                if (speed < 700) {
                    speed = 700;
                }
                Thread.sleep(speed);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}