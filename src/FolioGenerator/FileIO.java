package FolioGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public static List<String> readFile(){
        List<String> listCodes = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FolioConfiguration.SOURCEFILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineText = "";
            while (lineText != null){
                lineText = bufferedReader.readLine();
                if(lineText != null)
                    listCodes.add(lineText);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Path of file is wrong, the file does not exist");
        } catch (IOException e) {
            System.out.println("Error reading txt file");
        }
        return listCodes;
    }

    public static void writeFile(String codeIncoming){
        try {
            FileWriter fileWriter = new FileWriter(FolioConfiguration.SOURCEFILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if(codeIncoming != null || !codeIncoming.isEmpty())
                bufferedWriter.write(codeIncoming + "\n");
            bufferedWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Path of file is wrong, the file does not exist");
        }


    }
}
