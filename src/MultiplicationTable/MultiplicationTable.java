package MultiplicationTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        int number = 0;
        boolean isCharacter;

        System.out.println("This program prints multiplication table of number up to 10");
        System.out.println("============================================================");

        do {
            System.out.print("Introduce a number..: ");
            try{
                Scanner in = new Scanner(System.in);
                number = in.nextInt();
                isCharacter = false;
            }catch (Exception e){
                isCharacter = true;
            }
            if(number == 0 && !isCharacter)
                System.out.println("\nAll number multiplied by 0 is 0 \n");
        }while(isCharacter || number == 0);

        for (String row: getTable(number)) {
            System.out.println(row);
        }

    }

    public static List<String> getTable(int numberIncoming){
        List<String> listTable = new ArrayList<>();
        for (int cont = 1; cont <= 10; cont++){
            listTable.add(numberIncoming + " X " + cont + " = " + cont * numberIncoming);
        }
        return listTable;
    }
}
