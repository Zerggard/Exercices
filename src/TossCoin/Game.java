package TossCoin;

public class Game {
    private int totalTossDone = 0;
    private int totalHeads = 0;
    private int totalTails = 0;

    public Game(){
        this.totalTossDone =
                this.totalHeads =
                        this.totalTails = 0;
    }

    public int getTotalTossDone() {
        return totalTossDone;
    }

    public void addToss() {
        this.totalTossDone++;
    }

    public int getTotalHeads() {
        return totalHeads;
    }

    public void addHead() {
        this.totalHeads++;
    }

    public int getTotalTails() {
        return totalTails;
    }

    public void addTails() {
        this.totalTails++;
    }
}
