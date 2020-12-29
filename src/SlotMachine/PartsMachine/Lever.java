package SlotMachine.PartsMachine;

import java.util.ArrayList;
import java.util.List;

public class Lever {

    public List<Roller> pullLever(){
        List<Roller> rollers = new ArrayList<>();
        for(int count = 0; count < MachineConfiguration.RULLERSNUMBER; count++){
            rollers.add(new Roller());
        }
        return rollers;
    }
}
