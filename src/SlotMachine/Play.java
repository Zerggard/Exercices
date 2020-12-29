package SlotMachine;

import SlotMachine.PartsMachine.Lever;

import java.util.Scanner;

public class Play {
    public static Machine machine = new Machine();
    public static Lever lever = new Lever();
    public static void main(String[] args){
        int decision = 0;
        do {
            try {
                System.out.println("Welcome to Vegas pull lever to start play");
                System.out.println("============================================================");
                Scanner menuOption = new Scanner(System.in);
                System.out.println("1.- Play");
                System.out.println("2.- Exit");
                System.out.print("Your decision..: ");
                decision = menuOption.nextInt();
                switch (decision) {
                    case 1: {
                        int option = 0;
                        System.out.println("Pull the lever to turn rollers");
                        System.out.println("If all rollers are equals obtain 10 credits");
                        do {
                            try {
                            Scanner coordinateOption = new Scanner(System.in);
                            System.out.println();
                            System.out.println("1.- Play");
                            System.out.println("2.- Deposit");
                            System.out.println("3.- Withdraw");
                            System.out.println("4.- Exit");
                            System.out.println();
                            System.out.print("Your decision..: ");
                            option = coordinateOption.nextInt();

                            switch (option) {
                                case 1: {
                                    machine.playMachine();
                                    machine.showRoller();
                                    System.out.print("Your Credits..: " + machine.getCredit());
                                    break;
                                }
                                case 2:{
                                    machine.addCredit();
                                    System.out.print("Your Credits..: " + machine.getCredit());
                                    break;
                                }
                                case 3:{
                                    if(machine.getCredit() > 0) {
                                        System.out.println("You withdraw " + machine.getCredit());
                                        machine.withdrawCredit();
                                        option = 3;
                                        decision = 2;
                                    }
                                    break;
                                }
                            }
                            } catch (Exception e) {
                                System.out.println("Please only number 1 or 4");
                            }
                        } while (option != 4);
                        break;
                    }
                }
            }catch (Exception e){
                System.out.println("Select only option 1 or 2");
            }
        }while(decision != 2);
        System.out.println("Thank you for your visit");
        if(machine.getCredit() > 0) {
            System.out.println("You withdraw " + machine.getCredit());
            machine.withdrawCredit();
        }
    }
}
