package MouseCat;

public class Cat {
    public static boolean catchMouse(int x, int y){
        if (Game.map[x][y] == 1)
            return true;
        else
            return false;
    }
}
