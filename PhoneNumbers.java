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
public class PhoneNumbers {
    static String getLine(int line){
        String fileName = "C:\\Users\\adabau1886\\Desktop\\DataFilesUIL\\phonenumbers.txt";
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
        for(int line = 1; line <= Integer.parseInt(getLine(0)); line ++){
            //Splits phone number into its smaller parts
            String[] number = getLine(line).split("-");

            //If an error occurs, line must not be a valid phone number
            try{
                //Tries to turn each of the 3 seprate strings into integers
                Integer.parseInt(number[0]);
                Integer.parseInt(number[1]);
                Integer.parseInt(number[2]);

                //Checks if each number is correct length, if so, output phone number and continueto next line
                if(number.length == 3 && number[0].length() == 3 &&  number[1].length() == 3 && number[2].length() == 4){
                    System.out.println(getLine(line));
                    continue;
                }
            }catch (Exception e){
                System.out.println("INVALID PHONE NUMBER");
                continue;
            }
            
            System.out.println("INVALID PHONE NUMBER");
        }
    }
}
