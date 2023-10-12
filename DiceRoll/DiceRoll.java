import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // import the ArrayList class
import java.util.Random; // import random

class DiceRoll {
    public static void main(String[] args) {
        try {
            File myFile = new File("diceroll.dat");
            //int bears = 0;
            Scanner myScanner = new Scanner(myFile);
            //Boolean terminate = false;
            ArrayList<String> lines = new ArrayList<String>();
            while (myScanner.hasNextLine()){
                lines.add(myScanner.nextLine());
            }
            int index = 0;
            int matrixes = Integer.parseInt(lines.get(index));
            index++;
            for (int i = 0; i < matrixes; i++){
                Long seed = Long.parseLong(lines.get(index));
                Random rand = new Random(seed);
                System.out.println(rand.nextInt(1,4) + " " + rand.nextInt(1,25));
                index++;
            }
            myScanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        //public int RandomInt(int upper){
        //    return generator.nextInt() % upper + 1;
        //}
    }
}
