/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finished_uil;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author adabau1886
 */
public class Qualified {
    static String getLine(int line){
        String fileName = "C:\\Users\\adabau1886\\Desktop\\DataFilesUIL\\qualified.txt";
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
        String[] contests = {"STC","WTC","NTC","CTC","LVC"};
        int[] req = {560,340,420,370,470};
        
        for(int line = 1; line <= Integer.parseInt(getLine(0)); line++){
            String name = getLine(line).split(" ")[0];
            int score = Integer.parseInt(getLine(line).split(" ")[1]);
            String school = getLine(line).split(" ")[2];
            
            for(int i = 0; i < contests.length; i  ++){
                if(school.equals(contests[i]) && score >= req[i]){
                    System.out.println(name);
                }
            }
        }
    }
}
