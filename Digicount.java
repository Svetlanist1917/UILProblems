/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package completedCompSciUILpractice;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author txson
 */
public class Digicount {
    static String getLine(int line){
        String fileName = "C:\\Users\\txson\\OneDrive\\Desktop\\DataFilesUIL\\digicount.dat";
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
        for(int i = 0; i < getLine(0).split(" ").length; i ++){
            
            int countTo = Integer.parseInt(getLine(0).split(" ")[i]);
            int[] digits = new int[10];
            
            for(int count = 1; count <= countTo; count ++){
                for(int j = 0; j < Integer.toString(count).length(); j ++){
                    digits[Integer.parseInt(Integer.toString(count).split("")[j])] ++;
                }
            }
            
            for(int j = 0; j < digits.length; j ++){
                System.out.print(digits[j] + " ");
            }
            
            System.out.println("");
        }
    }
}
