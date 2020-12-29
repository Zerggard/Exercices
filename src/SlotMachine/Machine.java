package SlotMachine;

import SlotMachine.PartsMachine.Lever;
import SlotMachine.PartsMachine.MachineConfiguration;
import SlotMachine.PartsMachine.Roller;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    private List<Roller> rollers;
    private Lever lever = new Lever();
    private int credit = 0;

    public Machine(){
        rollers = new ArrayList<>();
    }

    public void playMachine() {
        if(credit > 0){
            rollers = lever.pullLever();
            --credit;
            boolean isGain = true;
            for (int count = 1; count < MachineConfiguration.RULLERSNUMBER; count++) {
                if (!rollers.get(0).getOption().equals(rollers.get(count).getOption())) isGain = false;
            }
            if(isGain)
                this.credit += MachineConfiguration.MAXGAIN;
        }else{
            System.out.println("Please insert credit!");
        }

    }
    public int getCredit() {
        return credit;
    }

    public void addCredit() {
        credit += MachineConfiguration.DEPOSITEDEFAULT;
    }

    public void withdrawCredit() {
        credit = 0;
    }

    public void showRoller() {
        System.out.println();
        for (Roller roller: rollers) {
            System.out.print("|" + roller.getOption() + "|");
        }
        System.out.println();
    }
}
