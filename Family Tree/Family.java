import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // import the ArrayList class
import java.util.Random; // import random

class Family {
    public static void main(String[] args) {
        try {
            File myFile = new File("family.dat");
            int amountt_of_lines = 0;
            //int bears = 0;
            Scanner myScanner = new Scanner(myFile);
            //Boolean terminate = false;
            ArrayList<String> lines = new ArrayList<String>();
            ArrayList<FamGen> famgen_list = new ArrayList<FamGen>();
            while (myScanner.hasNextLine()){
                lines.add(myScanner.nextLine());
                amountt_of_lines++;
            }

            for(int i = 0; i < amountt_of_lines; i++){
                String i_line = lines.get(amountt_of_lines);
                String first_name;
                String second_name;
                Boolean is_older;
                int index = 0;
                while(i_line.charAt(index) != ' '){
                    index++;
                }
                first_name = i_line.substring(0, index);
                System.out.println(first_name + "g");
            }

            myScanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class FamGen{
    public String name;
    public int generation;
}
