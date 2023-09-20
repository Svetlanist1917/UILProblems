import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Bayani {

    public static void main(String[] args){
        String fileName = "Bayani.dat";
        List<Double> numbersList = new ArrayList<>();

        try{
            File data = new File(fileName);
            Scanner reader = new Scanner(data);
            
            while (reader.hasNextLine()){
                String line = reader.nextLine();

                try{
                    double number = Double.parseDouble(line);
                    numbersList.add(number);
                }catch(NumberFormatException ohNo){
                    System.err.println("Error parsing a number.");
                }
            }
            reader.close();

            DecimalFormat df = new DecimalFormat("$ ####.##");
            double sum = 0.0;

            for (Double number : numbersList) {
                System.out.println(df.format(number));
                sum += number;
            }
            System.out.println("Total = " + df.format(sum));

        }catch (Exception ohNo){
            System.err.println("No file Found!");
        }
    }
}
