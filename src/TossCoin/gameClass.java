package TossCoin;

public class gameClass {
    public static void main(String[] args){
        Coin coin = new Coin();
        Game game = new Game();

        System.out.println("This program prints the coin toss in 10 times");
        System.out.println("============================================================");

        for (int cont = 0; cont < 10; cont++){

            System.out.println("Toss " + (cont + 1));
            coin.tossCoin();
            game.addToss();
            System.out.println("In the coin get " + (coin.getHead() ? "head" : "tails"));

            if (coin.getHead())
                game.addHead();
            else
                game.addTails();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The coin was tossed 10 times the results were:");
        System.out.println("Total toss..: " + game.getTotalTossDone());
        System.out.println("Total heads..: " + game.getTotalHeads());
        System.out.println("Total tails..: " + game.getTotalTails());
    }
}
