/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compSciUILpractice;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author txson
 */
public class Clock {
    static String getLine(int line){
        String fileName = "C:\\Users\\txson\\OneDrive\\Desktop\\DataFilesUIL\\clock.dat";
        try{
            String found = Files.readAllLines(Paths.get(fileName)).get(line);
            return found;
        } 
        catch(Exception e){
            //System.out.println("Error catch: " + e);
            return null;
        }
    }
    
    static int[] toTime(int sec){
        int hour = sec/60;
        int minutes = sec%60;
        if(hour == 0){hour = 12;}
        
        int[] r = {hour,minutes};
        return(r);
    }
    
    static int toSec(int hour, int minutes){
        if(hour == 12){hour = 0;}
        return(hour * 60 + minutes);
    }

    public static void main(String[] args){
        
        for(int line = 1; line <= Integer.parseInt(getLine(0)); line ++){
            int hour = Integer.parseInt(getLine(line).split(":")[0]);
            int minutes = Integer.parseInt(getLine(line).split(":")[1]);
            
            int newHour = toTime(720 - toSec(hour,minutes))[0];
            int newMinutes = toTime(720 - toSec(hour,minutes))[1];
            
            System.out.print(newHour + ":");
            
            if(newMinutes < 10){
                System.out.print("0");
            }
            
            System.out.println(newMinutes);
        }
    }
}
