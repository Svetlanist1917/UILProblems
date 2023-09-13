import java.io.*;
import java.util.Scanner;

public class Arti {
    public static void main(String[] args){
        try{
            Scanner reader = new Scanner("Arti.dat");
            while (reader.hasNextDouble()){
                double number = reader.nextDouble();

                if (number >= 0) {
                    double squareRoot = Math.sqrt(number);
                    System.out.println("Square root of " + number + " is: " + squareRoot);
                } else {
                    System.out.println("Cannot calculate square root of a negative number: " + number);
            }

        } catch (Exception ohNo){
            System.out.println("No file found");
        }

        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
}