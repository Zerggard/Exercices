package FolioGenerator;

import java.util.List;
import java.util.Scanner;

public class Generate {
    public static void main(String[] args){
        Folio folio;
        int decision = 0;
        do {
            try {
                Scanner menuOption = new Scanner(System.in);
                System.out.println("This program generate a code with ISO 3166-2 for Mexico");
                System.out.println("============================================================");
                System.out.println("1.- Generate code");
                System.out.println("2.- Print codes");
                System.out.println("3.- Exit");
                System.out.print("Your decision..: ");
                decision = menuOption.nextInt();
                switch (decision) {

                    case 1: {
                        String isoIncoming = "";
                        do {
                            folio = new Folio();
                            Scanner iso = new Scanner(System.in);
                            System.out.println("If you want to use code ISO please write it otherwise press ENTER");
                            System.out.print("ISO..: ");
                            isoIncoming = iso.nextLine();
                            isoIncoming = isoIncoming.toUpperCase();
                        }while (!Iso31662Mexico.isISOValid(isoIncoming));
                        while (!Folio.isFolioValid(folio.getFolio(), isoIncoming)){
                            folio = new Folio();
                        }
                        folio.addISO(isoIncoming);
                        System.out.println("============================================================");
                        System.out.println("The folio is..: " + folio.getFolio());
                        System.out.println("The folio has been saved");
                        System.out.println("============================================================");
                        FileIO.writeFile(folio.getFolio());
                        System.out.println("Press Enter to continue");
                        System.in.read();
                        break;
                    }
                    case 2:{
                        List<String> listCodes = FileIO.readFile();
                        System.out.println("Folios");
                        System.out.println("============================================================");
                        for (String code:listCodes) {
                            System.out.println(code);
                        }
                        System.out.println();
                        System.out.println("Press Enter to continue");
                        System.in.read();
                        break;
                    }
                }
            }catch (Exception e){
                System.out.println("Please write only numbers: 1 or 2");
            }
        }while(decision != 3);
    }


}
