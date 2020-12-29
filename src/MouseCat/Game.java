package MouseCat;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static int wins;
    public static int loses;
    public static int[][] map = new int[5][5];
    public static List<String> listCoordinates = new ArrayList<>();
    public static int tries = 0;

    public static void winMessage(){
        System.out.println("\nCongratulation you win \n");
        wins++;
    }

    public static void loseMessage(){
        System.out.println("\nYou lose \n");
        loses++;
    }

    public static void repeatMessage(){
        System.out.println("\nYou are repeated the coordinate \n");
    }

    public static void coordinateWrongMessage(){
        System.out.println("The coordinate that it has been writing is wrong, try again \n");
    }

    public static void mouseIsNotThereMessage(){
        System.out.println("\nThe mouse is not there, try again. Try " + tries + " of 5 \n");
    }

    public static void coordinateWrongRangeMessage(){
        System.out.println("\nThe coordinate that it has been writing is out of range maximum [5,5], try again \n");
    }

    public static void printResults(){
        System.out.println("RESULTS");
        System.out.println("============================================================");
        System.out.println("You played " + (Game.loses + Game.wins) + " times");
        System.out.println("You loses " + Game.loses + " times");
        System.out.println("You wins " + Game.wins + " times");
        System.out.println("============================================================");
    }

    public static void verifyingCoordinates(String coordinate) throws Exception {
        if (coordinate.trim().length() > 3) {
            coordinateWrongMessage();
            return;
        }
        int[] numbers = new int[2];

        if (coordinate.contains(",")){

            numbers = getNumber(coordinate);


            if(numbers[0] < 5 && numbers[1] < 5){
                if(!listCoordinates.contains(coordinate)) {
                    listCoordinates.add(coordinate);
                    tries++;
                    if (Cat.catchMouse(numbers[0], numbers[1])) {
                        winMessage();
                        return;
                    }else{
                        mouseIsNotThereMessage();
                    }
                    if(tries == 5){
                        loseMessage();
                        return;
                    }
                }
                else {
                    repeatMessage();
                    return;
                }
            }
            else{
                coordinateWrongRangeMessage();
                return;
            }
        }
        else {
            coordinateWrongMessage();
            return;
        }
    }

    private static int[] getNumber(String number){

        String[] numbersText = number.trim().split(",");
        int[] numbersInt = new int[2];

        for (int count = 0; count < numbersText.length; count++) {
            try {
                numbersInt[count] = Integer.parseInt(numbersText[count]);
            }catch (Exception e){

            }
        }
        return numbersInt;
    }
}
