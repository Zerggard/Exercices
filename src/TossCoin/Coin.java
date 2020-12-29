package TossCoin;

import java.util.Random;

public class Coin {
    private boolean head;
    private boolean tails;

    public boolean getHead(){
        return head;
    }

    public boolean getTails(){
        return tails;
    }

    public void tossCoin (){

        this.head = this.tails = false;

        Random random = new Random();
        int number = random.nextInt(2);
        if(number == 1)
            this.head = true;
        else
            this.tails = true;
    }
}
