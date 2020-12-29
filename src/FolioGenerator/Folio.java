package FolioGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Folio {

    private String folio;

    public String getFolio() {
        return folio;
    }

    public String addISO(String iso) {
        return folio = iso+folio;
    }

    public Folio(){
        folio = generateFolio();
    }

    private String generateBlockCode(int sizeBlockCode){
        Random random = new Random();
        String characters = FolioConfiguration.LISTCHARACTERS;
        String codeMock = "";
        String code = "";

        for(int index = 0; index < sizeBlockCode; ){
            codeMock += characters.charAt(random.nextInt(characters.length()));
            if(index == 0){
                code = codeMock;
                index++;
            }else if(Character.isLetter(code.charAt(code.length() -1)) &&
                    Character.isLetter(codeMock.charAt(codeMock.length() - 1))){
                codeMock = code;
                continue;
            }else{
                code = codeMock;
                index++;
            }
        }
        return code;
    }

    private String generateFolio(){
        return folio = generateBlockCode(FolioConfiguration.SIZEBEGINBLOCKCODE) + "-" +
                generateBlockCode(FolioConfiguration.SIZEMIDDLEBLOCKCODE) + "-" +
                generateBlockCode(FolioConfiguration.SIZELASTBLOCKCODE);
    }

    public static boolean isFolioValid (String folio, String isoIncoming){
        boolean folioWithISO = false;
        List<String> listCodes = FileIO.readFile();
        List<String> listCodesWithISO = new ArrayList<>();
        List<String> listCodesWithoutISO = new ArrayList<>();

        for (String country: FolioConfiguration.COUNTRIES) {
            if(isoIncoming.trim().toUpperCase().contains(country)){
                folioWithISO = true;
                break;
            }
        }
        for (String code: listCodes) {
            if(code.trim().toUpperCase().contains(isoIncoming.trim().toUpperCase()))
                listCodesWithISO.add(code);
            else
                listCodesWithoutISO.add(folio);
        }

        if(folioWithISO){
            for (String code:listCodesWithISO) {
                if(code.equals(isoIncoming + folio))
                    return false;
            }
        }else{
            for (String code:listCodesWithoutISO) {
                if(code.equals(folio))
                    return false;
            }
        }
        return true;
    }
}
