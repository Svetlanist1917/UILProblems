
package finished_uil;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Local {
    static String getLine(int line){
        String fileName = "C:\\Users\\adabau1886\\Desktop\\DataFilesUIL\\local.txt";
        try{
            String found = Files.readAllLines(Paths.get(fileName)).get(line);
            return found;
        } 
        catch(Exception e){
            System.out.println("Error catch: " + e);
            return null;
        }
    }
    
    public static void main(String[] args){
        for(int line = 1; line < 1 + Integer.parseInt(getLine(0)); line ++){
            int year = Integer.parseInt(getLine(line).split(" ")[0]);
            int freezing = 0;
            int warm = 0;
            
            for(int i = 1; i  < getLine(line).split(" ").length; i ++){
                if(Integer.parseInt(getLine(line).split(" ")[i]) < 32){
                    freezing ++;
                }else if(Integer.parseInt(getLine(line).split(" ")[i]) > 50){
                    warm ++;
                }
            }
            
            System.out.println(year + " " + freezing + " " + warm);
        }
    }
}
