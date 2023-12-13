
package finished_uil;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Whats {
    static String getLine(int line){
        String fileName = "C:\\Users\\adabau1886\\Desktop\\DataFilesUIL\\whats.txt";
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
        for(int line = 1; line <= Integer.parseInt(getLine(0)); line++){
            
            ArrayList<Integer> differences = new ArrayList<>();
            ArrayList<Integer> days = new ArrayList<>();
            
            differences.add(Integer.parseInt(getLine(line).split(" ")[1]) - Integer.parseInt(getLine(line).split(" ")[0]));
            
            for(int i = 2; i < getLine(line).split(" ").length; i ++){
                int dif = Integer.parseInt(getLine(line).split(" ")[i]) - Integer.parseInt(getLine(line).split(" ")[i-1]);
                
                if(differences.size() == 0){
                    differences.add(dif);
                    continue;
                }
                
                for(int j = 0; j < differences.size(); j ++){

                    if(differences.get(j) > dif){
                        differences.add(j, dif);
                        days.add(j, i);
                        break;
                    }
                    if(j == differences.size() - 1){
                        differences.add(dif);
                        days.add(i);
                        break;
                    }
                    
                }
            }
            
            //System.out.println(differences);
            //System.out.println(days);
            
            for(int i = 0; i < 4; i ++){
                System.out.println(differences.get(i) + " " + days.get(i));
            }
            
            System.out.println(" ");
        }
    }
}
