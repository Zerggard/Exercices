package SlotMachine.PartsMachine;

import java.util.Random;

public class Roller {

    private String option;

    public String getOption() {
        return option;
    }

    public Roller(){
        option = turnRoller();
    }

    public String turnRoller(){
        Random random = new Random();
        int option = random.nextInt(MachineConfiguration.RULLERSNUMBER);
        if(option == 0)
            return RullerOptions.A.name();
        if(option == 1)
            return RullerOptions.B.name();
        if(option == 2)
            return RullerOptions.C.name();
        else
            return RullerOptions.D.name();
    }
}
