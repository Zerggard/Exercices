package MonkeyTroubles;

import java.util.Random;

public class MonkeyTroubles {
    private static Monkey aMonkey = new Monkey();
    private static Monkey bMonkey = new Monkey();

    public static void main (String[] args){
        for (int cont = 0; cont < 10; cont++){
            if (weGotProblem())
                System.out.println("We got a problem with monkeys");
            else
                System.out.println("Everything is ok");
        }


    }

    public static boolean isSmiling(){
        Random random = new Random();
        int number = random.nextInt(2);
        return number != 1;
    }

    public static boolean weGotProblem(){
        aMonkey.setSmiling(isSmiling());
        bMonkey.setSmiling(isSmiling());
        //System.out.println("Monkey a is " + aMonkey.isSmiling());
        //System.out.println("Monkey b is " + bMonkey.isSmiling());
        if(aMonkey.isSmiling() && bMonkey.isSmiling()) {
            System.out.print("both are smiling ");
            return true;
        }
        else if (!aMonkey.isSmiling() && !bMonkey.isSmiling()) {
            System.out.print("both are not smiling ");
            return true;
        }
        else return false;
    }
}
