package MouseCat;

import sun.management.GarbageCollectionNotifInfoCompositeData;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Mouse mouse = new Mouse();
        int decision = 0;
        do {
            try {
                Scanner menuOption = new Scanner(System.in);
                System.out.println("This is a game catch mouse");
                System.out.println("============================================================");
                System.out.println("1.- Play");
                System.out.println("2.- Exit");
                System.out.print("Your decision..: ");
                decision = menuOption.nextInt();
                switch (decision) {
                    case 1: {
                        String coordinates = "";
                        System.out.println("INFO: Write the coordinates example '2,2' to find mouse");
                        System.out.println("You have only 5 chances to find the mouse, good luck.");
                        do {

                            Scanner coordiantesOption = new Scanner(System.in);
                            System.out.print("Your decision..: ");
                            coordinates = coordiantesOption.nextLine();
                            try {
                                Game.verifyingCoordinates(coordinates);
                            } catch (Exception e) {

                            }
                        } while (Game.tries != 5);
                        break;
                    }
                    default: {
                        System.out.println("Select only option 1 or 2");
                    }
                }
            }catch (Exception e){

            }
        }while(decision != 2);
        Game.printResults();
    }
}
