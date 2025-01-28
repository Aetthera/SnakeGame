public class Rectangle {
    public static int len=24, wid=30;
    static String [][] map;

    public Rectangle(){}
    public static void Map(){for (int i = 0; i < len; i++) {
        for (int j = 0; j < wid; j++) {
            if (i == 0) {
                map[i][j] = "*";
            }
            if (i == len - 1) {
                map[i][j] = "*";
            } else {
                if (j == 0 || j == wid - 1) {
                    map[i][j] = "*";
                } else {
                    if (i == 0) {

                    } else {
                        map[i][j] = " ";
                    }
                }
            }
        }
      }
    }

    public Rectangle(int len, int wid){
        this.len = len;
        this.wid = wid;

        map = new String[len][wid];
    }

}




