import java.io.*;
import java.util.Scanner;

public class Arti {

    public static void main(String[] args){
        try{
            File data = new File("Arti.dat");
            Scanner reader = new Scanner(data);
            while (reader.hasNextDouble()){
            Float number = Float.parseFloat(reader.nextLine());
                if (number >= 0){
                    double squareRoot = Math.sqrt(number);
                    System.out.printf("%.0f %.3f\n", number, squareRoot);
                }else{
                    System.out.println("Cannot calculate square root of a negative number: " + number);
                }
            }
            reader.close();
        }catch (Exception ohNo){
            System.out.println("No file found");
        }
    }
}