package MouseCat;

import java.util.Random;

public class Mouse {
    public Mouse(){
        Game.map[getCoordinate()][getCoordinate()] = 1;
    }

    private int getCoordinate(){
        Random random = new Random();
        return random.nextInt(5);
    }
}
